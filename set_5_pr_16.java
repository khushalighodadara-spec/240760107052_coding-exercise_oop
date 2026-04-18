interface Classify {
    String getDivision(double average);
}
class Result implements Classify {
    @Override
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "No First Division";
        }
    }

    public static void main(String[] args) {
        Result r = new Result();

        double avg1 = 75.5;
        double avg2 = 45.0;

        System.out.println("Average: " + avg1 + " -> " + r.getDivision(avg1));
        System.out.println("Average: " + avg2 + " -> " + r.getDivision(avg2));
    }
}

/*
Output:
Average: 75.5 -> First Division
Average: 45.0 -> No First Division
*/
