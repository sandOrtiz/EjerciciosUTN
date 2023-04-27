package Ejercicios.Clase7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;

public class Inicio {
    public static void main(String[] args) {
        String archivoEntrada = "documentos/compras.txt";
        try{
            List<String> lista = Files.readAllLines(Paths.get(archivoEntrada));
            String[] datosProductos1 = lista.get(1).split(" ");
            String[] datosProductos2 = lista.get(2).split(" ");
            String[] datosProductos3 = lista.get(3).split(" ");

            Producto producto1 = new Producto(datosProductos1[1], datosProductos1[2], Float.parseFloat(datosProductos1[0]));
            Producto producto2 = new Producto(datosProductos2[1], datosProductos2[2], Float.parseFloat(datosProductos2[0]));
            Producto producto3 = new Producto(datosProductos3[1], datosProductos3[2], Float.parseFloat(datosProductos3[0]));

            Carrito carrito = new Carrito(producto1, producto2, producto3, LocalDateTime.parse("2023-03-03T03:49:00"));

            Persona persona1 = new Persona("Sandra", "Ortiz", LocalDateTime.parse("1972-08-22T08:12:00"), carrito);

            Carrito miCarrito = persona1.getCarrito();

            Descuento desFijo = new DescuentoFijo(150);
            Descuento desPorcentaje = new DescuentoPorcentaje(0.50F);
            Descuento desPorcentajeConTope = new DescuentoPorcentajeConTope(0.30F);

            desPorcentajeConTope.setValorDesc(0.30F);

            double resultado = miCarrito.costoFinal(desPorcentajeConTope);
            System.out.println("El costo final es: " + resultado);


            int edad = persona1.edad();
            System.out.println(edad);
        }catch (IOException e){
            System.out.println("Hubo un error en la operación " + e);

        }
        }
 }

