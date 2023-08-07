

/**
 * @author MAAG
 * Class generated ChatGPT
 * Prompt utilizado> En código java quiero una clase llamada "Analizer" con un método estático
llamado "Analize" el cuál recibe un parámetro llamado "allWords" de tipo ArrayList
de Strings, que contiene varias palabras, el método debe recorrer todo el ArrayList
buscando las palabras palíndromas, cada palabra palíndroma la guarda en otro ArrayList
de Strings el cual deberá devolver al final del método.
 */
import java.util.ArrayList;

public class Analyzer {
	
    public static ArrayList<String> analyze(ArrayList<String> allWords) {
        ArrayList<String> palindromeWords = new ArrayList<>();
        
        for (String word : allWords) {
            if (isPalindrome(word)) {
                palindromeWords.add(word);
            }
        }
        
        return palindromeWords;
    }
    
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    
}