package Ejercicios.Clase7;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarritoTest {
@Test
    void testCostoFinalDescuentoFijo(){
    Producto producto1 = new Producto("arceite","126F", 300);
    Producto producto2 = new Producto("fideos","12C", 300);
    Producto producto3 = new Producto("azucar","16F", 300);
    Carrito miCarrito = new Carrito(producto1, producto2, producto3, LocalDateTime.parse("2023-03-03T03:49:00"));
    Descuento desFijo = new DescuentoFijo(300);

    float valorFinal = miCarrito.costoFinal(desFijo);
    assertEquals(valorFinal, 600);
}
    void testCostoFinalDescuentoPorcentaje(){
        Producto producto1 = new Producto("arceite","126F", 200);
        Producto producto2 = new Producto("fideos","12C", 200);
        Producto producto3 = new Producto("azucar","16F", 200);
        Carrito miCarrito = new Carrito(producto1, producto2, producto3, LocalDateTime.parse("2023-03-03T03:49:00"));
        Descuento desPorcentaje = new DescuentoPorcentaje(200);

        float valorFinal = miCarrito.costoFinal(desPorcentaje);
        assertEquals(valorFinal, 400);

    }
    void testCostoFinalDescuentoPorcentajeConTope(){
        Producto producto1 = new Producto("arceite","126F", 400);
        Producto producto2 = new Producto("fideos","12C", 400);
        Producto producto3 = new Producto("azucar","16F", 200);
        Carrito miCarrito = new Carrito(producto1, producto2, producto3, LocalDateTime.parse("2023-03-03T03:49:00"));
        Descuento desporcentajeConTope = new DescuentoPorcentajeConTope(0.50F);
        desporcentajeConTope.setValorDesc(0.20F);

        float valorFinal = miCarrito.costoFinal(desporcentajeConTope);
        assertEquals(valorFinal, 200);

    }

}