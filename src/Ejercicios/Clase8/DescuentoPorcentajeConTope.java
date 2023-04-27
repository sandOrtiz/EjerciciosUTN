package Ejercicios.Clase8;

public class DescuentoPorcentajeConTope extends DescuentoPorcentaje {

    private float tope;

    public DescuentoPorcentajeConTope(float tope) {
       super(0);
       this.tope = tope;
    }
    public float getTope(){
        return this.tope;
    }
    public void setTope(float nuevoValor){
        this.tope = nuevoValor;

    }
    public void setValorDesc (float valor) {
        if(valor>this.tope){
            super.setValorDesc(0);
            System.out.println("ese valor supera el tope");
        }else {
            super.setValorDesc(valor);
        }
    }
}