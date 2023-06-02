package ProblemSolving;

import java.security.SecureRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PasswordGenerator {
    //create a string of the elements that will be contained in the password - upper case. lower case, numbers, symbols
    private static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+[]{};:,.<>?";

    //main method for running the code
    public static void main(String[] args) {
        String generatedPassword1 = declarativeGeneratePassword();
        System.out.println("Generated password: " + generatedPassword1);

        String generatedPassword2 = imperativeGeneratePassword();
        System.out.println("Generated password: " + generatedPassword2);
    }

    //
    public static String declarativeGeneratePassword() {
        //create a string builder object for the password
        StringBuilder password = new StringBuilder();
        //create a secure random object to randomize the characters for the password generator
        SecureRandom random = new SecureRandom();
        // define the minimum length of the password and a range to randomize the size of the password starting form the defined minimum
        int passwordLength = 8 + random.nextInt(13);

        System.out.println("passwordLength " + passwordLength);

        password.append(getRandomCharacter(UPPERCASE_LETTERS, random));
        password.append(getRandomCharacter(LOWERCASE_LETTERS, random));
        password.append(getRandomCharacter(NUMBERS, random));
        password.append(getRandomCharacter(SPECIAL_CHARACTERS, random));

        System.out.println("password.length() " + password.length());

        int start = passwordLength - password.length();

        System.out.println("start = " + start);

        for (int i = password.length() ; i < passwordLength; i++) {
            String characterSet = UPPERCASE_LETTERS + LOWERCASE_LETTERS + NUMBERS + SPECIAL_CHARACTERS;
            password.append(getRandomCharacter(characterSet, random));
        }
        return password.toString();
    }

    private static char getRandomCharacter(String characterSet, SecureRandom random) {
        int randomIndex = random.nextInt(characterSet.length());
        return characterSet.charAt(randomIndex);
    }


    public static String imperativeGeneratePassword() {
        SecureRandom random = new SecureRandom();

        String requiredCharacters = String.join("",
                getRandomCharacterString(UPPERCASE_LETTERS, random),
                getRandomCharacterString(LOWERCASE_LETTERS, random),
                getRandomCharacterString(NUMBERS, random),
                getRandomCharacterString(SPECIAL_CHARACTERS, random)
        );

        int passwordLength = 8 + random.nextInt(13);
        String remainingCharacters = Stream.generate(() -> {
            String characterSet = UPPERCASE_LETTERS + LOWERCASE_LETTERS + NUMBERS + SPECIAL_CHARACTERS;
            return getRandomCharacterString(characterSet, random);
        }).limit(passwordLength - 4).collect(Collectors.joining());

        return requiredCharacters + remainingCharacters;
    }

    private static String getRandomCharacterString(String characterSet, SecureRandom random) {
        int randomIndex = random.nextInt(characterSet.length());
        return characterSet.substring(randomIndex, randomIndex + 1);
    }
}
