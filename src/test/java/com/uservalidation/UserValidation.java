package com.uservalidation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class UserValidation{
    @Test
    void testeValidateFistNameReturnFalse() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.firstNameValidator("an");
        Assertions.assertFalse(result);
    }

    @Test
    void inputProperFirstNameReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.firstNameValidator("Animesh");
        Assertions.assertTrue(result);
    }
}

