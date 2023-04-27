package Ejercicios.Clase8;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


class CarritoTest {

    private Persona persona;
    private Carrito carrito;
    void setup(String ruta){
        String archivoEntrada = ruta;
        List<String> lista = new ArrayList<String>();
        Carrito carrito = new  Carrito(LocalDateTime.parse("2023-03-03T03:49:00"));
        persona = new Persona("Sandra", "Ortiz", LocalDateTime.parse("1972-08-22T08:12:00"), carrito);
        this.carrito = persona.getCarrito();
        try {
            lista = Files.readAllLines(Paths.get(archivoEntrada));
            lista.remove(0);
            for (String linea : lista) {
                String[] datosDeProducto = linea.split(" ");
                Producto p = new Producto(datosDeProducto[1], datosDeProducto[2], Float.parseFloat(datosDeProducto[0]));
                this.carrito.agregarProducto(p);
            }
        }catch (IOException e){
            System.out.println("Hubo un error en la operacion" + e);
        }
    }

@Test
void testValorCeroException(){
    setup("documentos/comprasTotalCero.txt");
    Descuento desFijo = new DescuentoFijo(3000);
    Assert.assertThrows(ValorCeroException.class , () -> {this.carrito.costoFinal(desFijo);});
}
@Test
    void TotalNegativoException(){
        setup("documentos/comprasTotalNegativo.txt");
    Descuento desFijo = new DescuentoFijo(3000);
    Assert.assertThrows(TotalNegativoException.class , () -> {this.carrito.costoFinal(desFijo);}) ;
}
}