import java.util.ArrayList;
import java.util.Collections;

public class StudentMarks {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(78);
        marks.add(92);
        marks.add(65);
        marks.add(88);
        marks.add(74);
        System.out.println("Student Marks:");
        for (int mark : marks) {
            System.out.println(mark);
        }
        int highest = Collections.max(marks);
        int lowest = Collections.min(marks);
        System.out.println("\nHighest Mark: " + highest);
        System.out.println("Lowest Mark: " + lowest);

        /*
        Sample Output:
        Student Marks:
        78
        92
        65
        88
        74

        Highest Mark: 92
        Lowest Mark: 65
        */
    }
}
