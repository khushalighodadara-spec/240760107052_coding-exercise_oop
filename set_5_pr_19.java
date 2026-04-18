package student;
public class Student {
    protected int rollNo;
    protected String name;
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    public void displayStudent() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
    }
}
package exam;
import student.Student;
public class Result extends Student {
    private int marks1, marks2, marks3;
    public Result(int rollNo, String name, int marks1, int marks2, int marks3) {
        super(rollNo, name);
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
    public void displayResult() {
        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("----- Mark Sheet -----");
        displayStudent();
        System.out.println("Marks 1 : " + marks1);
        System.out.println("Marks 2 : " + marks2);
        System.out.println("Marks 3 : " + marks3);
        System.out.println("Total   : " + total);
        System.out.println("Average : " + average);
    }
    public static void main(String[] args) {
        Result r = new Result(52, "Khushali Ghodadara", 85, 78, 92);
        r.displayResult();
    }
}
/*
Output:

----- Mark Sheet -----
Roll No : 52
Name    : Khushali Ghodadara
Marks 1 : 85
Marks 2 : 78
Marks 3 : 92
Total   : 255
Average : 85.0
*/
