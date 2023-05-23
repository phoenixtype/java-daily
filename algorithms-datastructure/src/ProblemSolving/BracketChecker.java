package ProblemSolving;

import java.util.Stack;

public class BracketChecker {
    public static boolean isBalanced(String brackets) {
        Stack<Character> characterStack = new Stack<>();

        for (char ch: brackets.toCharArray()) {
            if (ch == '(') {
                characterStack.push(ch);
            } else if (ch == ')') {
                if (characterStack.isEmpty() || characterStack.pop() != '(') {
                    return false;
                }
            }
        }
        return characterStack.isEmpty();
    }

    public static void main(String[] args) {
        String balancedBrackets = "(()())()";
        System.out.println("Is \"" + balancedBrackets + "\" balanced? " + isBalanced(balancedBrackets));

        String unbalancedBrackets = "(()(";
        System.out.println("Is \"" + unbalancedBrackets + "\" balanced? " + isBalanced(unbalancedBrackets));
    }
}
