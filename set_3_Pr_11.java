import java.util.Scanner;

class College {
    
    private String collegeName;
    public College(String collegeName) {
        this.collegeName = collegeName;
    }
    class Admission {
        private String studentName;
        private String course;
        public void acceptDetails() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();

            System.out.print("Enter Course Name: ");
            course = sc.nextLine();
        }
        public void displayDetails() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College Name : " + collegeName);
            System.out.println("Student Name : " + studentName);
            System.out.println("Course       : " + course);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter College Name: ");
        String cname = sc.nextLine();
        College college = new College(cname);
        College.Admission admission = college.new Admission();
        admission.acceptDetails();
        admission.displayDetails();
    }
}

/*
Sample Output:

Enter College Name: GTU College
Enter Student Name: Khushali
Enter Course Name: Computer Science

--- Admission Details ---
College Name : GTU College
Student Name : Khushali
Course       : Computer Science
*/
