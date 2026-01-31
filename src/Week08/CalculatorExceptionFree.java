package Week08;

public class CalculatorExceptionFree {

    public static boolean isInteger(String s) {
        if (s == null || s.isEmpty()) return false;

        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c) && c != '-') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java CalculatorExceptionFree <num1> <operator> <num2>");
            return;
        }

        if (!isInteger(args[0])) {
            System.out.println("Wrong Input: " + args[0]);
            return;
        }

        if (!isInteger(args[2])) {
            System.out.println("Wrong Input: " + args[2]);
            return;
        }

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
    }
}

