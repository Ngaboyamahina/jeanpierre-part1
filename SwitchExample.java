class SwitchExample {

    public static void main(String[] args) {
        // Example usage of the performOperation method
        double result = performOperation(5, 3, '+');
        System.out.println("Result: " + result);
    }

    // Method to perform different operations based on the operation code
    public static double performOperation(double num1, double num2, char operation) {
        double result = 0.0;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("Error: Unsupported operation.");
        }

        return result;
    }
}