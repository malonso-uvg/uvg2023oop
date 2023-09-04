public class Codificador {

    public static String codificar(String mensaje){
        String[][] matrizOriginal = calcularMatriz(mensaje);
        String[][] matrizTranspuesta = calcularMatrizTranspuesta(matrizOriginal);
        String mensaje_codificado = obtenerCadenaCodificada(matrizTranspuesta);
        return mensaje_codificado;
    }

    public static String decodificar(String mensaje_codificado){
        return "";   
    }

    public static String[][] calcularMatriz(String message){
        //Saber el tamaño de la matriz
        //Este mecanismo se puede mejorar
        int index = obtenerTamanio(message);
        String[][] matrizOriginal = new String[index][index];

        //Guardar todas las letras en la matriz
        int contador = 0;
        for (int i = 0; i < index; i++){
            for (int j = 0; j < index; j++){
                if (contador < message.length()){
                    matrizOriginal[i][j] = "" + message.charAt(contador);
                } else {
                    matrizOriginal[i][j] = " ";
                }
                
                contador++;
            }
        }

        //Devolver la matriz generada
        return matrizOriginal;
    }

    public static String[][] calcularMatrizTranspuesta(String[][] matrizOriginal){
        int dimension = matrizOriginal.length; //Devolver la cantidad de filas
        //int cantidad_columnas = matrizOriginal[0].length; //Devuelve la cantidad de columnas
        String[][] matrizTranspuesta = new String[dimension][dimension];

        for (int i = 0; i < dimension; i++){
            for (int j = 0; j < dimension; j++){
                matrizTranspuesta[i][j] = matrizOriginal[j][i];
            }
        }

        return matrizTranspuesta;
    }

    private static int obtenerTamanio(String message){
        int i = 0;
        do{
            i++;        
        }while ((i*i) < message.length());
        return i;
    }

    private static String obtenerCadenaCodificada(String[][] matrizTranspuesta){
        String mensaje = "";
        for (int i = 0; i < matrizTranspuesta.length; i++){
            for (int j = 0; j < matrizTranspuesta.length; j++){
                mensaje += "" + matrizTranspuesta[i][j];
            }
        }
        return mensaje;
    }
}
