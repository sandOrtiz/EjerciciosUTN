package Ejercicios.Clase8;

public class ValorCeroException extends Exception{
    private final float valorCarrito;

    public ValorCeroException(float valorCarrito) {
        this.valorCarrito = valorCarrito;
    }

    public float getValorCarrito() {
        return valorCarrito;
    }

    @Override
    public String getMessage() {
        return "El valor del carrito es 0 no se puede calcular descuento";
    }
}
