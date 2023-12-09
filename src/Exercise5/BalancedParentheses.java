import java.util.Stack;

public class BalancedParentheses {

    public static boolean isBalanced2(String parentheses) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : parentheses.toCharArray()) {
            if (isOpeningBracket(bracket)) {
                stack.push(bracket);
            } else {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), bracket)) {
                    return false;
                }
            }
        }

        return stack.isEmpty(); // Stack should be empty for a balanced sequence
    }

    private static boolean isOpeningBracket(char bracket) {
        return bracket == '(' || bracket == '[' || bracket == '{';
    }

    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '[' && closing == ']') ||
                (opening == '{' && closing == '}');
    }

    public static void main(String[] args) {
        System.out.println(isBalanced2("{([])}")); // true
        System.out.println(isBalanced2("()[]{}")); // true
        System.out.println(isBalanced2("(]"));     // false
        System.out.println(isBalanced2("[(])"));   // false
    }
}

