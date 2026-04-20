import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileCounter {
    public static void main(String[] args) {

        // Check if filename is provided
        if (args.length != 1) {
            System.out.println("Usage: java FileCounter <filename>");
            return;
        }

        String fileName = args[0];

        int characters = 0;
        int words = 0;
        int lines = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lines++;
                characters += line.length();
                String[] wordArray = line.trim().split("\\s+");

                // Handle empty lines
                if (!line.trim().isEmpty()) {
                    words += wordArray.length;
                }
            }

            System.out.println("File Name: " + fileName);
            System.out.println("Number of Lines: " + lines);
            System.out.println("Number of Words: " + words);
            System.out.println("Number of Characters: " + characters);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
/*
Sample Command:
java FileCounter sample.txt

Sample Output:
File Name: sample.txt
Number of Lines: 3
Number of Words: 10
Number of Characters: 52
*/
