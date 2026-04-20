import java.util.LinkedList;
public class GenericSearch {
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);
        rollNumbers.add(104);

        System.out.println("Searching in roll numbers:");
        System.out.println("103 exists? " + searchElement(rollNumbers, 103));
        System.out.println("110 exists? " + searchElement(rollNumbers, 110));
        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        System.out.println("\nSearching in names:");
        System.out.println("Bob exists? " + searchElement(names, "Bob"));
        System.out.println("John exists? " + searchElement(names, "John"));

        /*
        Sample Output:
        Searching in roll numbers:
        103 exists? true
        110 exists? false

        Searching in names:
        Bob exists? true
        John exists? false
        */
    }
}
