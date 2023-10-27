public class Calculadora
{
    public int suma(int sumando1, int sumando2){
        return sumando1 + sumando2;
    }

    public int resta(int minuendo, int sustraendo){
        return suma(minuendo, -sustraendo);
    }

    public int multiplicacion(int factor1, int factor2){
        int acumulador = 0;
        boolean primeroNegativo = false;
        boolean segundoNegativo = false;

        if (factor1 < 0){
            factor1 = -factor1;
            primeroNegativo = true;
        }

        if (factor2 < 0){
            factor2 = -factor2;
            segundoNegativo = true;
        }

        for (int i = 0; i < factor2; i++){
            acumulador = suma(acumulador, factor1);
        }

        //Evaluo ley de signos
        if ( (primeroNegativo && !segundoNegativo) || (!primeroNegativo && segundoNegativo)){
            acumulador = -acumulador;
        }

        return acumulador;
    }

    public int cociente(int dividendo, int divisor){
        int contador = 0;

        while (dividendo >= 0){
            contador++;
            dividendo = resta(dividendo, divisor);
        }

        return contador;
    }

    public int residuo(int dividendo, int divisor){

        int residuo = 0;
        while (dividendo >= 0) {
            residuo = dividendo;
            dividendo = resta(dividendo, divisor);
        }
        return residuo;
    }


}