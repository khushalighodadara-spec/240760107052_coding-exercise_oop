class Employee {
    String name;
    String department;
    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    void displayDetails() {
        System.out.println("Employee Name : " + name);
        System.out.println("Department    : " + department);
    }
}
class Manager extends Employee {
    int teamSize;
    String projectName;
    Manager(String name, String department, int teamSize, String projectName) {
        super(name, department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }
    @Override
    void displayDetails() {
        System.out.println("Manager Name  : " + name);
        System.out.println("Department    : " + department);
        System.out.println("Team Size     : " + teamSize);
        System.out.println("Project Name  : " + projectName);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Rahul Sharma", "HR");
        Employee mgr = new Manager("Priya Patel", "IT", 12, "Online Banking System");

        System.out.println("Employee Details:");
        emp.displayDetails();

        System.out.println("\nManager Details:");
        mgr.displayDetails();   
    }
}

/*
Output:

Employee Details:
Employee Name : Rahul Sharma
Department    : HR

Manager Details:
Manager Name  : Priya Patel
Department    : IT
Team Size     : 12
Project Name  : Online Banking System
*/
