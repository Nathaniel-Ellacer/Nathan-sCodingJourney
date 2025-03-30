package ExpressionStacks;
import java.util.Stack;

public class InfixToPostfixConverter {
    public static String convertToPostfix(String infix) {

        Stack<Character> operators = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        char[] characters = infix.toCharArray();

        for (char current : characters) {
            if (Character.isDigit(current)) {
                postfix.append(current).append(' ');
            } 
            
            else if (current == '(') {
                operators.push(current);
            } 
            
            else if (current == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    postfix.append(operators.pop()).append(' ');
                }
                operators.pop();
            } 
            else if (isOperator(current)) {
                while (!operators.isEmpty() && isOperator(operators.peek()) &&
                       getPrecedence(operators.peek()) >= getPrecedence(current)) {
                    postfix.append(operators.pop()).append(' ');
                }
                operators.push(current);
            }
        }
        while (!operators.isEmpty()) {
            postfix.append(operators.pop()).append(' ');
        }
        return postfix.toString().trim();
    }

    private static boolean isOperator(char symbol) {
        return symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/';
    }

    private static int getPrecedence(char operator) {
        switch (operator) {
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0;
        }
    }
}