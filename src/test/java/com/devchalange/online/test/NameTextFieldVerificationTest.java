package com.devchalange.online.test;

import com.devchalange.online.pages.WelcomePage;
import org.testng.annotations.Test;

public class NameTextFieldVerificationTest extends BaseTest {

    @Test
    public void verifyNewHotelPageOpens(){
        WelcomePage.open()
                .navigateToNewHotelPage()
                .verifyNameFieldIsDisplayed()
                .verifyNameFieldHasAsterisk()
                .verifyNameFieldIsEditable()
                .verifyNameFieldAllowsAlphanumericInput()
                .verifyEmptyNameFieldErrorMessage();

    }
}
