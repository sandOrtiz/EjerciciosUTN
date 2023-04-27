package Ejercicios.Clase1;

public class Ejercicios1 {
    public static void main(String[] args) {

        int numeroInicio = 5;
        int numeroFinal = 14;
        boolean numeroPar = true;

        int contador = numeroInicio;


        while (contador <= numeroFinal) { //punto a
            System.out.println(contador);

            if (numeroPar == true && contador % 2 == 0) {   //puntos b y c
                System.out.println("el numero es par " + contador);

            } else if (numeroPar == false && contador % 2 != 0) {
                System.out.println("el numero es impar" + contador);

            }
            contador++;
        }
        for (int i = numeroFinal; i >= numeroInicio; i--) { //punto d
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        float ingresosMensuales = 50000;
        int cantidadVehiculos = 0;
        int antiguedadVehiculo = 0;
        int inmuebles = 0;
        boolean transporteLujo = false;


        if (ingresosMensuales >= 489083 ||(cantidadVehiculos >= 3 && antiguedadVehiculo <= 5)
                || inmuebles >= 3 || transporteLujo == true) {
            System.out.println("Hogar Altos Ingresos");
        } else if (ingresosMensuales <= 489093 || (cantidadVehiculos <= 3 && antiguedadVehiculo >= 5)
                || inmuebles <=3 ||transporteLujo == false){
            System.out.println("Hogar Bajos Ingresos");
        }
    }
}



