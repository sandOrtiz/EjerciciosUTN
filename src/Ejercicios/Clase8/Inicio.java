package Ejercicios.Clase8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Inicio {
    public static void main(String[] args) {
        String archivoEntrada = "documentos/compras.txt";
        List<String> lista = new ArrayList<String>();
        Carrito carrito = new  Carrito(LocalDateTime.parse("2023-03-03T03:49:00"));
        Persona persona = new Persona("Sandra", "Ortiz", LocalDateTime.parse("1972-08-22T08:12:00"), carrito);
        Carrito miCarrito = persona.getCarrito();
        try {
            lista = Files.readAllLines(Paths.get(archivoEntrada));
            lista.remove(0);
            for (String linea : lista) {
                String[] datosDeProducto = linea.split(" ");
                Producto p = new Producto(datosDeProducto[1], datosDeProducto[2], Float.parseFloat(datosDeProducto[0]));
                miCarrito.agregarProducto(p);
            }
        }catch (IOException e){
            System.out.println("Hubo un error en la operacion" + e);
        }


            Descuento desFijo = new DescuentoFijo(150);
            Descuento desPorcentaje = new DescuentoPorcentaje(0.50F);
            Descuento desPorcentajeConTope = new DescuentoPorcentajeConTope(0.30F);
            desPorcentajeConTope.setValorDesc(0.30F);

            try {
                double resultadoCostoFinal = miCarrito.costoFinal(desPorcentajeConTope);
                System.out.println("El costo final es: " + resultadoCostoFinal);
            }catch(ValorCeroException | TotalNegativoException e){
                e.getMessage();
            }

            int edad = persona.edad();
            System.out.println(edad);

        }
 }

