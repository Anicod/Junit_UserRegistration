package com.uservalidation;

import java.util.regex.Pattern;
public class UserRegistration {
    private static final String NAME_PATTERN = "[A-Z][a-z]{2,}";
    private static final String CONTACT_NUMBER_PATTERN = "[0-9]{2}\\s[1-9][0-9]{9}$";
    boolean validateFirstName;
    boolean validateLastname;
    boolean validateContactNumber;
    public boolean firstNameValidator(String fName){
        validateFirstName = Pattern.matches(NAME_PATTERN, fName);
        return validateFirstName;
    }
    public boolean lastNameValidator(String lName){
        validateLastname = Pattern.matches(NAME_PATTERN, lName);
        return validateLastname;
    }
    public boolean contactNumberValidator(String number){
        validateContactNumber = Pattern.matches(CONTACT_NUMBER_PATTERN, number);
        return validateContactNumber;
    }
}
