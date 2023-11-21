class BreakExample {
    public static void main(String[] args) {
        int i = 1;

        // Using a while loop to iterate over numbers
        while (i <= 10) {
            System.out.println("Current number: " + i);

            // Check if the current number is 5
            if (i == 5) {
                System.out.println("Breaking out of the loop because the current number is 5.");
                // Using the break statement to exit the loop
                break;
            }

            // Increment the loop counter
            i++;

            // This code will not be reached for i == 5
            System.out.println("This won't be printed for i = 5");
        }

        // This code will be reached after the loop
        System.out.println("Loop finished.");
    }
}