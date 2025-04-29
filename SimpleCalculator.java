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

        // Power: num1 raised to the power of num2
        double power = Math.pow(num1, num2);
        System.out.println("Power (" + num1 + " raised to " + num2 + "): " + power);

        // Square root of num1
        if (num1 >= 0) {
            double squareRoot = Math.sqrt(num1);
            System.out.println("Square root of " + num1 + ": " + squareRoot);
        } else {
            System.out.println("Square root: Cannot compute square root of a negative number.");
        }

        // Cube root of num1
        double cubeRoot = Math.cbrt(num1);
        System.out.println("Cube root of " + num1 + ": " + cubeRoot)

    }
}
