import java.time.temporal.ChronoField;
import java.util.Stack;
public class ParenthesesChecker {

    //properties
    private Stack<String> stringStack;

    //constructor
    public ParenthesesChecker() {
        this.stringStack = new Stack<>();
    }

    //methods
    public boolean checkParentheses(String testString) {
        String testString1 = "(Hello)";
        stringStack = new Stack<>();
        stringStack.add(testString1);
        System.out.println(stringStack);
        char x = testString.charAt(0);
        for (int i = 0; i < testString.length(); i++)
            if (x == '(' || x == ')') {
                stringStack.pop();
            }
        if (stringStack.contains(x != '(' || x != ')')) {
            return true;
        }
        System.out.println(stringStack);
        return false;
    }
}

//        charStack = new Stack<Character>();
//        for (int i = 0; i < testString.length(); i++) {
//            char currentChar = testString.charAt(i);
//            char x = testString.charAt(i);
//            if (x == '(') {
//                charStack.pop();

//            for (int other = stack.size() - 1; other >= 0; other--) {
//                if (i == other) {
//                    return true;
//                }
//                return false;
//            }
//        } return true;
//    }
//}
