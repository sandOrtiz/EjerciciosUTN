package Ejercicios.Clase3;

import java.util.Arrays;

public class Ejercicios1ABC {
    public static void main(String[] args) {

        cantidadApacionesCaracter("la casa de papel", 'a'); //punto a
        ordenarNumeros(4, 18, 1, "ascendente"); //punto b
        ordenarNumeros(4, 18, 1, "descendente"); //punto b
        sumarVectorDeNumeros(20, 12, 6, 8); //punto c

    }

    public static void cantidadApacionesCaracter(String cadena, char letra) { // punto a
        int cantidadCaracteres = 0;
        for (int i = 0; i <= cadena.length() - 1; i++) {
            if (cadena.charAt(i) == letra) {
                cantidadCaracteres++;
            }
        }
        System.out.println("Cantidad Apariciones Letra a = " + cantidadCaracteres);
    }

    public static int[] ordenarNumeros(int n1, int n2, int n3, String orden) {
        int[] vector = new int[]{n1, n2, n3};
        for (int i = 0; i < vector.length; i++)
            for (int j = 0; j < vector.length; j++) {
                if (orden.equals("ascendente")) {
                    if (vector[i] > vector[j]) {           // punto b
                        int temp = vector[i];
                        vector[i] = vector[j];
                        vector[j] = temp;
                    }
                } else if (orden.equals("descendente")) {
                    if (vector[i] < vector[j]) {
                        int temp = vector[i];
                        vector[i] = vector[j];
                        vector[j] = temp;
                    }
                }
            }
        System.out.println(Arrays.toString(vector));
        return vector;

    }

    public static int [] sumarVectorDeNumeros(int n1, int n2, int n3, int X) {
        int[] vector = new int[]{n1, n2, n3};
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > X) {           // punto c
                vector[i] = vector[i] + X;
            }
        }
        System.out.println(Arrays.toString(vector));
        return vector;
    }
}
