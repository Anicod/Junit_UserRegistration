package com.uservalidation;

import java.util.regex.Pattern;
public class UserRegistration {
    private static final String FIRST_NAME_PATTERN = "[A-Z][a-z]{3,}";
    boolean validateFirstName;
    public boolean firstNameValidator(String fName){
        validateFirstName = Pattern.matches(FIRST_NAME_PATTERN, fName);
        return validateFirstName;

    }
}
