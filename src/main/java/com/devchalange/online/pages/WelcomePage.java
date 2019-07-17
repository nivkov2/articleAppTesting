package com.devchalange.online.pages;

import com.codeborne.selenide.Selenide;

public class WelcomePage extends BasePage {

    public static WelcomePage open() {
        Selenide.open("https://www.google.com");
        return new WelcomePage();
    }

    public NewHotelPage navigateToNewHotelPage( ){
        navigationForm.navigateToNewHotelPage();
        return Selenide.page(NewHotelPage.class);
    }

}
