class VotingApp {
    static void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        }

        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {

        int[] ages = {16, 18, 25};

        for (int age : ages) {
            System.out.println("Checking age: " + age);

            try {
                checkEligibility(age);
            }

            catch (IllegalArgumentException e) {
                System.out.println("Exception: " + e.getMessage());
            }

            finally {
                System.out.println("Validation process completed\n");
            }
        }
    }
}

/*
Sample Output:

Checking age: 16
Exception: Age must be 18 or above to vote
Validation process completed

Checking age: 18
Eligible to vote
Validation process completed

Checking age: 25
Eligible to vote
Validation process completed
*/
