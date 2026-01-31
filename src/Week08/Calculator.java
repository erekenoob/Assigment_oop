package Week08;

public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calculator <num1> <operator> <num2>");
            return;
        }

        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[2]);
            String op = args[1];

            int result;

            switch (op) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
                    break;
                default:
                    System.out.println("Unknown operator: " + op);
                    return;
            }

            System.out.println(a + " " + op + " " + b + " = " + result);

        } catch (NumberFormatException e) {
            System.out.println("Wrong Input: " + e.getMessage());
        }
    }
}
