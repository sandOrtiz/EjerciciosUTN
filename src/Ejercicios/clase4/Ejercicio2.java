package Ejercicios.clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicio2 {
    public static void main(String[] args) {
        String archivo = "documentos\\Numeros.txt";
        int acumulador = 0;
        String operacion = "suma";
        try {
            for (String linea : Files.readAllLines(Paths.get(archivo))) {
                if (operacion.equals("suma")) {         //punto a
                    acumulador = acumulador + Integer.parseInt(linea);
                }
                if(operacion.equals("multiplicacion")){
                    acumulador = 1;
                    acumulador = acumulador * Integer.parseInt(linea);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(acumulador);


    }

}

