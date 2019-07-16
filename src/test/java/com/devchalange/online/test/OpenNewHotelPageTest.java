package com.devchalange.online.test;

import com.devchalange.online.pages.WelcomePage;
import org.testng.annotations.Test;

public class OpenNewHotelPageTest extends BaseTest {

    @Test
    public void verifyNewHotelPageOpens(){
        WelcomePage.open()
                .navigateToNewHotelPage()
                .verifyMainLabelIsDisplayed()
                .verifyDataSectionIsDisplayed()
                .verifySaveButtonIsDisplayed();
    }
}
