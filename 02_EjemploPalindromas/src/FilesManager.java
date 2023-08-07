/**
 * @author MAAG
 * Code Generated using ChatGPT
 */
import java.io.*;
import java.util.ArrayList;

public class FilesManager {
    public static ArrayList<String> readFiles(String path) {
        ArrayList<String> words = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] splitWords = line.split(",");
                for (String word : splitWords) {
                    words.add(word.trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return words;
    }
    
    public static void writeFiles(String path, ArrayList<String> words) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (String word : words) {
                writer.write(word);
                writer.write(",");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}