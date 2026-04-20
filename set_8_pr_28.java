import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileStatistics {
    public static void main(String[] args) {
        String fileName = "data.txt";

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                lineCount++;
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
                charCount += line.replace(" ", "").length();
            }

            bufferedReader.close();

            System.out.println("File Name: " + fileName);
            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters (excluding spaces): " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File '" + fileName + "' not found.");
        } catch (IOException e) {
            System.out.println("Error while reading the file: " + e.getMessage());
        }

        /*
        Sample Output:
        File Name: data.txt
        Total Lines: 3
        Total Words: 12
        Total Characters (excluding spaces): 56
        */
    }
}
