package com.example.EventNowProject;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoginValidationsUnitTests {

    //Email Validating Unit Tests Here

    public Boolean getEmailValidator(String emailTxt) {
        boolean emailNotFilled = emailTxt.isEmpty();
        return emailNotFilled;
    }

    //Email not filled
    @Test
    public void EmailNotFilled() {
        LoginValidationsUnitTests activity = new LoginValidationsUnitTests();
        assertTrue(activity.getEmailValidator(""));
    }

    //Email Filled test passes
    @Test
    public void EmailFilled() {
        LoginValidationsUnitTests activity = new LoginValidationsUnitTests();
        assertTrue(!activity.getEmailValidator("test@gmail.com"));
    }

    //Email No Username
    @Test
    public void InvalidEmailNoUsername() {
        LoginValidationsUnitTests activity = new LoginValidationsUnitTests();
        assertFalse(activity.getEmailValidator("@email.com"));
    }


    //Password Checking Unit Tests Here
    public Boolean PasswordValidationTest(String passwordTxt){
        Login activity = new Login();

        boolean notEnteredPassword = passwordTxt.isEmpty();
        return notEnteredPassword;
    }

    @Test
    public void notEnteredPassword(){
        LoginValidationsUnitTests activity = new LoginValidationsUnitTests();
        assertFalse(activity.PasswordValidationTest("Password Has no text in field"));

    }

    @Test
    public void EnteredPassword(){
        LoginValidationsUnitTests activity = new LoginValidationsUnitTests();
        assertTrue(!activity.PasswordValidationTest("test1234"));

    }

}
