interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double average);
}

class Result implements Exam, Classify {
    @Override
    public boolean isPassed(int mark) {
        return mark >= 35;
    }
    @Override
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else if (average >= 45) {
            return "Second Division";
        } else if (average >= 35) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        Result result = new Result();

        int mark = 72;
        double average = 68.5;
        System.out.println("Mark: " + mark);
        System.out.println("Passed: " + result.isPassed(mark));
        System.out.println("Average: " + average);
        System.out.println("Division: " + result.getDivision(average));
    }
}

/*
Output:
Mark: 72
Passed: true
Average: 68.5
Division: First Division
*/
