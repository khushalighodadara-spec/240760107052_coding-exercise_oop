import java.io.*;

public class StudentFileDemo {
    public static void main(String[] args) {
        String fileName = "students.txt";
        FileWriter writer = null;
        BufferedReader reader = null;

        try {
            writer = new FileWriter(fileName);

            writer.write("101 John 85\n");
            writer.write("102 Alice 92\n");
            writer.write("103 Bob 78\n");

            System.out.println("Student records written to " + fileName);

        } catch (IOException e) {
            System.out.println("Error while writing file: " + e.getMessage());

        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Error while closing writer: " + e.getMessage());
            }
        }

        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;

            System.out.println("\nStudent Records:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error while reading file: " + e.getMessage());

        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error while closing reader: " + e.getMessage());
            }
        }

        /*
        Sample Output:
        Student records written to students.txt

        Student Records:
        101 John 85
        102 Alice 92
        103 Bob 78
        */
    }
}
