package ProblemSolving;


public class PatternPrinter {

    private static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+[]{};:,.<>?";
    public static void printPattern(String pattern) {
        for (char ch: pattern.toCharArray()) {
            switch (ch) {
                case 'U' -> System.out.print("Uppercase ");
                case 'L' -> System.out.print("Lowercase ");
                case 'N' -> System.out.print("Number ");
                case 'S' -> System.out.print("Special Character ");
                default -> System.out.print(ch + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printPattern("ULNSN");
    }
}
