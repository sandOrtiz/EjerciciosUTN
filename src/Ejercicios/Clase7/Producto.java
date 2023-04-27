package Ejercicios.Clase7;

public class Producto {
    private String nombre;
    private String codigo;
    private float precio;

    public Producto(String nombre, String codigo, float precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public float costoFinal(){
        return this.precio;
    }
}
