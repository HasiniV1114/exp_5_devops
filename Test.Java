public class Test {
    public static void main(String[] args) {
        System.out.println("=== Simple Java Calculator ===");

        // Check if arguments are provided
        if (args.length < 3) {
            System.out.println("Error: Please provide numbers and an operator as arguments.");
            System.out.println("Usage Example: java Test 10 + 5");
            return;
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            char operator = args[1].charAt(0);
            double num2 = Double.parseDouble(args[2]);

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
                    System.out.println("Error: Invalid operator! Use +, -, *, or /");
                    validOperation = false;
                    break;
            }

            if (validOperation) {
                System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers.");
        }
    }
}
