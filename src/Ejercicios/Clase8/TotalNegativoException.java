package Ejercicios.Clase8;

public class TotalNegativoException extends Exception{
    private final float valorCarrito;

    public TotalNegativoException(float valorCarrito) {
         this.valorCarrito = valorCarrito;
    }

    public float getValorCarrito() {
        return valorCarrito;
    }

    @Override
    public String getMessage() {
        return "El resultado de la operación es negativo: " + valorCarrito;
    }

}
