package ProblemSolving;

import java.security.SecureRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PasswordGenerator {
    private static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+[]{};:,.<>?";

    public static void main(String[] args) {
        String generatedPassword1 = declarativeGeneratePassword();
        System.out.println("Generated password: " + generatedPassword1);

        String generatedPassword2 = imperativeGeneratePassword();
        System.out.println("Generated password: " + generatedPassword2);
    }

    public static String declarativeGeneratePassword() {
        StringBuilder password = new StringBuilder();
        SecureRandom random = new SecureRandom();

        int passwordLength = 8 + random.nextInt(13);

        password.append(getRandomCharacter(UPPERCASE_LETTERS, random));
        password.append(getRandomCharacter(LOWERCASE_LETTERS, random));
        password.append(getRandomCharacter(NUMBERS, random));
        password.append(getRandomCharacter(SPECIAL_CHARACTERS, random));

        for (int i = 4; i < passwordLength; i++) {
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
