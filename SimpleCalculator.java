public class SimpleCalculator {
    public static void main(String[] args) {
        // Predefined numbers
        double num1 = 12.0;
        double num2 = 4.0;

        // Perform arithmetic operations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient;

        // Check for division by zero
        if (num2 != 0) {
            quotient = num1 / num2;
            System.out.println("Division: " + quotient);
        } else {
            System.out.println("Division: Cannot divide by zero.");
        }

        // Display the results
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
    }
}
