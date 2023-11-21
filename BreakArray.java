class BreakArray {
    public static void main(String[] args) {
        int[] numbers = { 2, 7, 1, 9, 4, 6, 8, 3, 5, 10 };
        int targetNumber = 6;

        // Using a for loop to search for the targetNumber in the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Checking element at index " + i + ": " + numbers[i]);

            // Check if the current element is the targetNumber
            if (numbers[i] == targetNumber) {
                System.out.println("Target number found at index " + i + ".");
                // Using the break statement to exit the loop
                break;
            }

            // This code will not be reached if the target number is found
            System.out.println("This won't be printed for the target number.");
        }

        // This code will be reached after the loop
        System.out.println("Search finished.");
    }
}