package Ejercicios.clase4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1C {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        String orden = "";

        if (args.length < 4) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Ingrese el primer número");
            n1 =  Integer.parseInt(scn.nextLine());
            System.out.println("Ingrese el segundo número");
            n2 = Integer.parseInt(scn.nextLine());
            System.out.println("Ingrese el tercer número");
            n3 = Integer.parseInt (scn.nextLine());
            System.out.println("Ingrese el tipo de Orden Asc/Desc");
            orden = scn.nextLine();
        } else {
            n1 = Integer.parseInt(args[0]);
            n2 = Integer.parseInt(args[1]);
            n3 = Integer.parseInt(args[2]);
            orden = args[3];
        }
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
