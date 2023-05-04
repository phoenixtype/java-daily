package ProblemSolving;

import java.util.Scanner;

public class PasswordPolicy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter password: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("The password you entered is strong");
        } else {
            System.out.println("The password you entered is weak, please try another password. " +
                    "Kindly check out conditions for a strong password");
        }
    }

    public static boolean isValidPassword(String password) {
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()\\-+=~`{\\[\\]}\\\\|:;\"'<>,.?\\/])(?!.*password).{7,30}$";
        return password.matches(regex);
    }

}
