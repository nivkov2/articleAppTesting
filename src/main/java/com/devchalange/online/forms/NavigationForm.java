package com.devchalange.online.forms;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NavigationForm {

    private SelenideElement articleSubMenu = $(By.xpath("//span[contains(text(), \"Article\")]/parent::a"));
    private SelenideElement newSubMenu = $(By.xpath("//span[contains(text(), \"New\")]/parent::a"));
    private SelenideElement hotelMenu = $(By.xpath("//span[text()=\"Hotel\"]/parent::a"));

    public void navigateToNewHotelPage(){
        articleSubMenu.hover();
        newSubMenu.hover();
        hotelMenu.hover().click();
    }

}
