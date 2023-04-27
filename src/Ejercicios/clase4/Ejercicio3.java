package Ejercicios.clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicio3 {
    public static void main(String[] args) {
        String archivoEntrada = "documentos/Archivo1.txt";
        String archivoSalida = "documentos/Archivo2.txt";
        String operacion = "codificar";
        int desplazamiento = 4;
        String resultado = "";
        String resultadoOperacion = "La operacion fue exitosa";

        try{
            for (String linea : Files.readAllLines(Paths.get(archivoEntrada))){
                if(operacion.equals("codificar")){
                    resultado = codificar(linea, desplazamiento);
                } else if (operacion.equals("decodificar")) {
                    resultado = decodificar(linea, desplazamiento);
                }
            }
            Files.writeString(Paths.get(archivoSalida), resultado);
        }catch (IOException e){
            resultadoOperacion = "Hubo un error en la operacion";
        }
        System.out.println(resultadoOperacion);
    }
    private static String codificar( String palabra, int desplazamiento){
        String nueva = "";
        for (int i = 0; i < palabra.length(); i++) {
            nueva = nueva + siguienteCaracter(palabra.charAt(i), desplazamiento);
        }
        return nueva;
    }
    private static String decodificar( String palabraCodificada, int desplazamiento){
        String nueva = "";
        for (int i = 0; i < palabraCodificada.length(); i++) {
            nueva = nueva + siguienteCaracter(palabraCodificada.charAt(i), desplazamiento);

        }
        return nueva;
    }
    private static char siguienteCaracter(char letra, int desplazamiento){
        String abc = "abcdefghijklmnñopqrstuvwxyz -";
        char letraSiguiente = '-';
        for (int i = 0; i < abc.length(); i++) {
            if (abc.charAt(i) == letra){
                int pos = i + desplazamiento;
                if (pos >= abc.length()) {
                    pos = pos - abc.length();
                } else if (pos < 0) {
                    pos = abc.length() + pos;
                }
                letraSiguiente = abc.charAt(pos);
            }
        }
        return letraSiguiente;
        }
}


