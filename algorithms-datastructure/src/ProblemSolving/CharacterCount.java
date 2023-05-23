package ProblemSolving;

public class CharacterCount {
    public static void main(String[] args) {
        declarativeCountCharacters("DetermineTheOrder112");
        imperativeCountCharacters("DetermineTheOrder112");
    }
    public static void declarativeCountCharacters(String input) {
        long uppercaseCount = input.chars().filter(Character::isUpperCase).count();
        System.out.println("DECLARATIVE");
        System.out.println("declarative uppercaseCount" + uppercaseCount);
        long lowercaseCount = input.chars().filter(Character::isLowerCase).count();
        System.out.println("declarative lowercaseCount" + lowercaseCount);
        long numberCount = input.chars().filter(Character::isDigit).count();
        System.out.println("declarative numberCount" + numberCount);
        System.out.println();
    }

    public static void imperativeCountCharacters(String input) {
        long uppercaseCount = 0;
        long lowercaseCount = 0;
        long numberCount = 0;

        for (char ch: input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            }
        }
        System.out.println("IMPERATIVE");
        System.out.println("imperative uppercaseCount" + uppercaseCount);
        System.out.println("imperative lowercaseCount" + lowercaseCount);
        System.out.println("imperative numberCount" + numberCount);
    }
}
