package Ejercicios.clase4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        String numero1 = scn.nextLine();
        System.out.println("Ingrese el segundo número");
        String numero2 = scn.nextLine();
        System.out.println("Ingrese el tercer número");
        String numero3 = scn.nextLine();
        System.out.println("Ingrese el tipo de Orden Asc/Desc");
        String orden = scn.nextLine();

        int n1 = Integer.parseInt(numero1);
        int n2 = Integer.parseInt(numero2);
        int n3 = Integer.parseInt(numero3);

        System.out.println(Arrays.toString(ordenadosPorCriterio(n1, n2, n3, orden)));

    }
    public static int[] ordenadosPorCriterio(int n1, int n2, int n3, String orden ){
        int[] vector = new int[]{n1, n2, n3};

        for (int i = 0; i < vector.length; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                if (orden.equals("Asc")) {
                    if (vector[i] > vector[j]) {
                        int temp = vector[i];
                        vector[i] = vector[j];
                        vector[j] = temp;
                    }
                } else if (orden.equals("Desc")) {
                    if (vector[i] < vector[j]) {
                        int temp = vector[i];
                        vector[i] = vector[j];
                        vector[j] = temp;
                    }
                }
            }}
        return vector;
    }
}
