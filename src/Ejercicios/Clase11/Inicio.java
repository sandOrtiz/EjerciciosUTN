package Ejercicios.Clase11;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args)  {

    Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        String nombre = scanner.nextLine();


            while(true){
            System.out.println("1 - Escribir Mensaje, \n2 - Leer Mensajes, \n3 - Salir ");
            int respuesta = scanner.nextInt();

            if(respuesta == 1 ){
               scanner.nextLine();
                System.out.println("Escriba su mensaje");
                String mensaje = scanner.nextLine();
                try{
                    FileWriter writer = new FileWriter("documentos/chat.txt");
                    writer.write(nombre + " : " + mensaje + "\n");
                    writer.close();
            }catch (IOException e){
                    System.out.println("Error al enviar el mensaje");
                }
            } else if (respuesta == 2) {
                try{
                    FileReader reader = new FileReader("docuemntos/chat.txt");
                    BufferedReader bufferedReader = new BufferedReader(reader);
                    String linea;
                    while((linea = bufferedReader.readLine()) != null){
                        System.out.println(linea);
                    }
                    reader.close();
                }catch (IOException e){
                    System.out.println("Error al leer los mensajes");
                }

            } else if (respuesta == 3) {
                break;
            }
            else {
                System.out.println("Opcion invalida");
            }
            }
        System.out.println("Saliendo del programa.");
    }
}

