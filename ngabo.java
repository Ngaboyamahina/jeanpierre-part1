class ngabo {

    public static void main(String[] args) {
        // Example of using continue with strings
        printStringLengths();
    }

    // Method that demonstrates the use of continue with strings
    public static void printStringLengths() {
        String[] words = {"apple", "banana", "cherry", "date", "elderberry"};

        System.out.println("Printing string lengths:");

        for (String word : words) {
            // Skip the iteration if the word contains the letter 'a'
            if (word.contains("a")) {
                System.out.println("Skipping word with 'a': " + word);
                continue; // Skip the rest of the code and move to the next iteration
            }

            // Print the length of the word
            System.out.println("Length of '" + word + "': " + word.length());
        }

        System.out.println("Loop finished.");
    }
}