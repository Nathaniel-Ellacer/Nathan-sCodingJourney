package ExpressionStacks;
public class ExpressionEvaluatorTest {
    public static void main(String[] args) {
        
        String postfixExpression1 = "5 3 2 * +";
        int evaluationResult1 = PostfixEvaluator.evaluate(postfixExpression1);
        System.out.println("Output1: " + evaluationResult1); // Output1: 11

        // Simple: "3 4 +"
        String postfixExpression2 = "3 4 +";
        int evaluationResult2 = PostfixEvaluator.evaluate(postfixExpression2);
        System.out.println("Output2: " + evaluationResult2); // Output2: 7

        // Complex: "5 3 2 * + 4"
        String postfixExpression3 = "5 3 2 * + 4 -";
        int evaluationResult3 = PostfixEvaluator.evaluate(postfixExpression3);
        System.out.println("Output3: " + evaluationResult3); // Output3: 7

        // With parentheses (for infix): "(5 + 3) * 2"
        String infixExpression4 = "(5 + 3) * 2";
        String convertedPostfix = InfixToPostfixConverter.convertToPostfix(infixExpression4);
        int evaluationResult4 = PostfixEvaluator.evaluate(convertedPostfix);
        System.out.println("Output4: " + evaluationResult4); // Output4: 16
    }
}