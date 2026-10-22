import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class SimpleParser {

    public static String parseTokens(String input) {
        List<String> tokens = new ArrayList<>();
        Scanner stringScanner = new Scanner(input);
        
        while (stringScanner.hasNext()) {
            tokens.add(stringScanner.next());
        }

        String[] expectedTokens = {
            "<data_type>",
            "<identifier>",
            "<assignment_operator>",
            "<value>",
            "<delimiter>"
        };

        if (tokens.size() != expectedTokens.length) {
            return "Syntax is Error!";
        }

        for (int i = 0; i < expectedTokens.length; i++) {
            if (!tokens.get(i).equals(expectedTokens[i])) 
            {
                return "Syntax is Error!";
            }
        }

        return "Syntax is Correct!";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Tokens: ");
        String userInput = scanner.nextLine();
        
        String result = parseTokens(userInput);
        System.out.println(result);
    }
}