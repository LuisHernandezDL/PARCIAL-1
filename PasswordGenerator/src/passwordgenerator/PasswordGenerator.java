/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luishernandez
 * 
 */

package passwordgenerator;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PasswordGenerator {
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()-_+=<>?/";
    private static final SecureRandom RANDOM = new SecureRandom();


    public static String generatePassword(int length) {
        if (length < 8) {
            throw new IllegalArgumentException("La longitud mínima es 8 caracteres.");
        }
        
        List<Character> password = new ArrayList<>();
        password.add(LOWERCASE.charAt(RANDOM.nextInt(LOWERCASE.length())));
        password.add(UPPERCASE.charAt(RANDOM.nextInt(UPPERCASE.length())));
        password.add(DIGITS.charAt(RANDOM.nextInt(DIGITS.length())));
        password.add(SPECIAL_CHARS.charAt(RANDOM.nextInt(SPECIAL_CHARS.length())));
        
        String allChars = LOWERCASE + UPPERCASE + DIGITS + SPECIAL_CHARS;
        while (password.size() < length) {
            password.add(allChars.charAt(RANDOM.nextInt(allChars.length())));
        }
        
        Collections.shuffle(password);
        
        StringBuilder sb = new StringBuilder();
        for (char c : password) {
            sb.append(c);
        }
        return sb.toString();
    }
    

    public static String generatePassword(PasswordConfigDTO config) {
    if (config.minLength < 8) {
        throw new IllegalArgumentException("La longitud mínima es 8 caracteres.");
    }

    List<Character> password = new ArrayList<>();
    StringBuilder allCharsBuilder = new StringBuilder();

    if (!config.restrictMinLowerCaseLetters || config.minLowerCaseLetters > 0) {
        allCharsBuilder.append(LOWERCASE);
    }
    if (!config.restrictMinUpperCaseLetters || config.minUpperCaseLetters > 0) {
        allCharsBuilder.append(UPPERCASE);
    }
    if (!config.restrictMinDigits || config.minDigits > 0) {
        allCharsBuilder.append(DIGITS);
    }
    if (!config.restrictMinNonAlphanumericCharacters || config.minNonAlphanumericCharacters > 0) {
        allCharsBuilder.append(SPECIAL_CHARS);
    }

    String allChars = allCharsBuilder.toString();
    if (allChars.isEmpty()) {
        throw new IllegalArgumentException("Debe haber al menos un tipo de carácter permitido.");
    }


    if (config.restrictMinDigits) {
        for (int i = 0; i < config.minDigits; i++) {
            password.add(DIGITS.charAt(RANDOM.nextInt(DIGITS.length())));
        }
    }
    if (config.restrictMinUpperCaseLetters) {
        for (int i = 0; i < config.minUpperCaseLetters; i++) {
            password.add(UPPERCASE.charAt(RANDOM.nextInt(UPPERCASE.length())));
        }
    }
    if (config.restrictMinLowerCaseLetters) {
        for (int i = 0; i < config.minLowerCaseLetters; i++) {
            password.add(LOWERCASE.charAt(RANDOM.nextInt(LOWERCASE.length())));
        }
    }
    if (config.restrictMinNonAlphanumericCharacters) {
        for (int i = 0; i < config.minNonAlphanumericCharacters; i++) {
            password.add(SPECIAL_CHARS.charAt(RANDOM.nextInt(SPECIAL_CHARS.length())));
        }
    }

    while (password.size() < config.minLength) {
        password.add(allChars.charAt(RANDOM.nextInt(allChars.length())));
    }

    Collections.shuffle(password);

    StringBuilder sb = new StringBuilder();
    for (char c : password) {
        sb.append(c);
    }
    
    return sb.toString();
}

}
