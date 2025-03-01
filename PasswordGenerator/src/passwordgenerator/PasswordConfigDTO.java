/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passwordgenerator;

/**
 */
public class PasswordConfigDTO {
    public int minLength = 8;
    public boolean restrictMinDigits = false;
    public int minDigits = 1;
    public boolean restrictMinUpperCaseLetters = false;
    public int minUpperCaseLetters = 1;
    public boolean restrictMinLowerCaseLetters = false;
    public int minLowerCaseLetters = 1;
    public boolean restrictMinNonAlphanumericCharacters = false;
    public int minNonAlphanumericCharacters = 1;

  
    public PasswordConfigDTO(int minLength, boolean restrictMinDigits, int minDigits, 
                             boolean restrictMinUpperCaseLetters, int minUpperCaseLetters, 
                             boolean restrictMinLowerCaseLetters, int minLowerCaseLetters, 
                             boolean restrictMinNonAlphanumericCharacters, int minNonAlphanumericCharacters) {
        this.minLength = minLength;
        this.restrictMinDigits = restrictMinDigits;
        this.minDigits = minDigits;
        this.restrictMinUpperCaseLetters = restrictMinUpperCaseLetters;
        this.minUpperCaseLetters = minUpperCaseLetters;
        this.restrictMinLowerCaseLetters = restrictMinLowerCaseLetters;
        this.minLowerCaseLetters = minLowerCaseLetters;
        this.restrictMinNonAlphanumericCharacters = restrictMinNonAlphanumericCharacters;
        this.minNonAlphanumericCharacters = minNonAlphanumericCharacters;
    }
}
