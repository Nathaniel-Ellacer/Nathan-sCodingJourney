package ExpressionStacks;
import java.util.Stack;

public class ParenthesesBalanceChecker {
    public static boolean checkBalance(String input) {
        Stack<Character> charStack = new Stack<>();

        for (char character : input.toCharArray()) 
        {
            if (character == '(' || character == '[' || character == '{') 
            {
                charStack.push(character);
            } 
            else if (character == ')' || character == ']' || character == '}') 
            {
                if (charStack.isEmpty()) {
                    return false; 
                }

                char top = charStack.pop();
                if (!areMatchingPairs(top, character)) 
                {
                    return false; 
                }
            }
        }
        return charStack.isEmpty(); 
    }

    private static boolean areMatchingPairs(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }

    public static void main(String[] args) {
        String testExpression1 = "(3 + 4) * [2 / (1 - 5)]";
        String testExpression2 = "((3 + 4) * [2 / (1 - 5)]";
        System.out.println("Test Expression 1 is balanced: " + checkBalance(testExpression1));
        System.out.println("Test Expression 2 is balanced: " + checkBalance(testExpression2));
    }
}