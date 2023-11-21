class Continue{

    public static void main(String[] args) {
        // Example of using continue in a loop
        iterateNumbers();
    }

    // Method that demonstrates the use of continue in a loop
    public static void iterateNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Iterating through numbers:");

        for (int number : numbers) {
            // Skip the iteration if the number is even
            if (number % 2 == 0) {
                System.out.println("Skipping even number: " + number);
                continue; // Skip the rest of the code and move to the next iteration
            }

            // Process only odd numbers
            System.out.println("Processing odd number: " + number);
        }

        System.out.println("Loop finished.");
    }
}