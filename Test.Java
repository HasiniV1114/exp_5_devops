public class Test {
    public static void main(String[] args) {
        System.out.println("=== Simple Java Calculator (All Operations) ===");

        // Define your preset numbers
        double num1 = 10.0;
        double num2 = 5.0;

        // Array of operators to test all at once
        char[] operators = {'+', '-', '*', '/'};

        for (char operator : operators) {
            double result = 0;
            boolean validOperation = true;

            switch (operator) {
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
                        System.out.println("Error: Division by zero is not allowed.");
                        validOperation = false;
                    }
                    break;
                default:
                    validOperation = false;
                    break;
            }

            if (validOperation) {
                System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
            }
        }
    }
}
