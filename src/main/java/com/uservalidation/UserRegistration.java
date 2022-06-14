package com.uservalidation;

import java.util.regex.Pattern;
public class UserRegistration {
    private static final String NAME_PATTERN = "[A-Z][a-z]{3,}";
    boolean validateFirstName;
    boolean validateLastname;
    public boolean firstNameValidator(String fName){
        validateFirstName = Pattern.matches(NAME_PATTERN, fName);
        return validateFirstName;
    }
    public boolean lastNameValidator(String lName){
        validateLastname = Pattern.matches(NAME_PATTERN, lName);
        return validateLastname;
    }
}
