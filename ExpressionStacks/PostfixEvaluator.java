package ExpressionStacks;
import java.util.Stack;

// Postfix expression evaluator
class PostfixEvaluator {
    public static int evaluate(String expression) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expression.split("\\s+");

        for (String token : tokens) {
            if (isNumber(token)) {
                stack.push(Integer.valueOf(token));
            } else {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Insufficient operands for operation: " + token);
                }
                int secondOperand = stack.pop();
                int firstOperand = stack.pop();
                int result = calculate(token, firstOperand, secondOperand);
                stack.push(result);
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("The user input has too many values.");
        }

        return stack.pop();
    }

    private static boolean isNumber(String str) {
        return str.matches("-?\\d+");
    }

    private static int calculate(String operator, int a, int b) {
        switch (operator) 
        {
            case "+":
                return a + b;

            case "-":
                return a - b;

            case "*":
                return a * b;

            case "/":
                if (b == 0) throw new ArithmeticException("Division by zero.");
                return a / b;

            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}