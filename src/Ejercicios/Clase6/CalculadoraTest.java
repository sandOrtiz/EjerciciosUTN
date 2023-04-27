package Ejercicios.Clase6;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



class CalculadoraTest {

    @Test
    void casosDePrueba1(){
        double resultado = Calculadora.multiplicar(80, 3);
        assertEquals(resultado, 240);
    }

    @Test
    void casosDePrueba2(){
        double resultadoSuma = Calculadora.sumar(150, 180);
        double resultadoDivision= Calculadora.dividir(resultadoSuma, 3);
        assertEquals(resultadoDivision, 110);
    }

    @Test
    void casosDePrueba3(){
        double resultadoResta = Calculadora.restar(90, 50);
        double resultadoMultiplicacion= Calculadora.multiplicar(resultadoResta, 15);
        assertFalse(resultadoMultiplicacion == 605);
    }

    @Test
    void casosDePrueba4(){
        double resultadoSuma = Calculadora.sumar(70, 40);
        double resultadoMultiplicacion= Calculadora.multiplicar(resultadoSuma, 25);
        assertFalse(resultadoMultiplicacion == 2700);
    }


    @Test
    void sumar() {
        double resultado = Calculadora.sumar(29.35, 40.65);
        assertEquals(resultado, 70 );

    }

    @Test
    void restarTest() {
        double resultado = Calculadora.restar(90, 50);
        assertEquals(resultado, 40);
    }

    @Test
    void multiplicarTest() {
        double resultado = Calculadora.multiplicar(80, 3);
        assertFalse(resultado == 230 );
    }

    @Test
    void dividir() {
        double resultado = Calculadora.dividir(20, 8);
        assertFalse(resultado == 3);
    }
}