package ProblemSolving;

import java.util.Stack;

public class BracketChecker {

    public static boolean isBalanced(String bracket) {
        Stack<Character> characterStack = new Stack<>();
        for (char ch:
             bracket.toCharArray()) {
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
    
    public static boolean isBalancedDeclarative(String bracket){
        Stack<Character> characterStack = new Stack<>();
        bracket.chars()
                .mapToObj(ch -> (char) ch)
                .forEach(ch -> {
                    if (ch == '(') {
                        characterStack.push(ch);
                    } else if (ch == ')') {
                        if (characterStack.isEmpty() || characterStack.pop() != '(') {
                            throw new IllegalArgumentException("Unbalanced brackets");
                        }
                    }
                });
        return characterStack.isEmpty();
    }

    public static void main(String[] args) {
        String balancedBrackets = "(()())()";
        System.out.println("Is \"" + balancedBrackets + "\" balanced? " + isBalanced(balancedBrackets));        
        
        String balancedBracketsDeclarative = "(()())()";
        System.out.println("Is \"" + balancedBracketsDeclarative + "\" balanced? " + isBalancedDeclarative(balancedBracketsDeclarative));

        String unbalancedBrackets = "(()(";
        System.out.println("Is \"" + unbalancedBrackets + "\" balanced? " + isBalanced(unbalancedBrackets));
    }
}

