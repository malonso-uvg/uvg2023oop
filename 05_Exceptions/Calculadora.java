public class Calculadora{

    public static int suma(int n1, int n2){
        return n1 + n2;
    }

    public static int cociente(int dividendo, int divisor) throws Exception{
        return dividendo / divisor;
    }

    public static String diaDeLaSemana(int dia) throws Exception{
        switch (dia){
            case 1: return "Domingo"; 
            case 2: return "Lunes"; 
            case 3: return "Martes"; 
            case 4: return "Miercoles"; 
            case 5: return "Jueves"; 
            case 6: return "Viernes"; 
            case 7: return "Sabado"; 
            default: throw new Exception("Dia no válido");
        }
    }

    public static String diaSemanaVector(int dia) throws IndexOutOfBoundsException {
        String[] diasSemana = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        return diasSemana[dia - 1];
    }

}