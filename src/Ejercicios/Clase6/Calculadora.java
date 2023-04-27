package Ejercicios.Clase6;

public class Calculadora {
    public static double sumar(double numero1, double numero2){return numero1 + numero2;}
    public static double restar(double numero1, double numero2){return numero1 - numero2;}
    public static double multiplicar(double numero1, double numero2){return numero1 * numero2;}
    public static double dividir(double numero1, double numero2){
        if(numero1==0 || numero2==0){
            return -1; // para no romper el codigo
        }
        return numero1 / numero2;}


}
