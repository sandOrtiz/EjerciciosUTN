package Ejercicios.Clase7;

import java.time.LocalDateTime;

public class Carrito {
    private Producto prodcuto1;
    private Producto prodcuto2;
    private Producto prodcuto3;
    private LocalDateTime fechaCompra;

    public Carrito(Producto prodcuto1, Producto prodcuto2, Producto prodcuto3, LocalDateTime fechaCompra) {
        this.prodcuto1 = prodcuto1;
        this.prodcuto2 = prodcuto2;
        this.prodcuto3 = prodcuto3;
        this.fechaCompra = fechaCompra;
    }

    public Producto getProdcuto1() {
        return prodcuto1;
    }

    public void setProdcuto1(Producto prodcuto1) {
        this.prodcuto1 = prodcuto1;
    }

    public Producto getProdcuto2() {
        return prodcuto2;
    }

    public void setProdcuto2(Producto prodcuto2) {
        this.prodcuto2 = prodcuto2;
    }

    public Producto getProdcuto3() {
        return prodcuto3;
    }

    public void setProdcuto3(Producto prodcuto3) {
        this.prodcuto3 = prodcuto3;
    }

    public LocalDateTime getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDateTime fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    public float costoFinal(Descuento desc){
        float total = desc.valorFinal(this.prodcuto1.costoFinal() + this.prodcuto2.costoFinal() + this.prodcuto3.costoFinal());
        return total;
    }
}
