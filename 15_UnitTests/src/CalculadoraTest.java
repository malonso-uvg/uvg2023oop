import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraTest
{
    @Test
    public void SumaEnterosPositivosTest(){
        Calculadora miCalculadora = new Calculadora();
        assertEquals(8, miCalculadora.suma(3,5));
    }

    @Test
    public void SumaEnterosNegativosTest(){
        Calculadora miCalculadora = new Calculadora();
        assertEquals(-8, miCalculadora.suma(-3, -5));
    }

    @Test
    public void SumaEnterosPrimeroPositivoSegundoNegativoTest(){
        Calculadora miCalculadora = new Calculadora();
        assertEquals(-2, miCalculadora.suma(3,-5));
    }

    @Test
    public void SumaEnterosPrimeroNegativoSegundoPositivoTest(){
        Calculadora miCalculadora = new Calculadora();
        assertEquals(2, miCalculadora.suma(-3, 5));
    }

    @Test
    public void MultiplicacionEnterosPositivosTest(){
        Calculadora miCalculadora = new Calculadora();
        assertEquals(15, miCalculadora.multiplicacion(3,5));
    }

    @Test
    public void MultiplicacionEnterosNegativosTest(){
        Calculadora miCalculadora = new Calculadora();
        assertEquals(15, miCalculadora.multiplicacion(-3,-5));
    }

    @Test
    public void MultiplicacionPrimerPositivoSegundoNegativoTest(){
        Calculadora miCalculadora = new Calculadora();
        assertEquals(-15, miCalculadora.multiplicacion(3,-5));
    }

    @Test
    public void MultiplicacionPrimerNegativoSegundoPositivoTest(){
        Calculadora miCalculadora = new Calculadora();
        assertEquals(-15, miCalculadora.multiplicacion(-3,5));
    }
}