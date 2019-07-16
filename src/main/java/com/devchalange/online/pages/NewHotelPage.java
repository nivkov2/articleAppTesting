package com.devchalange.online.pages;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class NewHotelPage extends BasePage {
    private SelenideElement newHotelLabel = $(By.xpath("//*[text()=\"Register new Hotel\"]"));
    private SelenideElement dataSection = $(By.xpath("//*[@id=\"add_hotel:j_idt40\"]"));
    private SelenideElement saveButton = $(By.xpath("//*[@id=\"add_hotel:j_idt62\"]"));
    private SelenideElement nameTextField = $(By.xpath("//*[@id=\"add_hotel:name\"]"));
    private SelenideElement nameTextFieldAsterisk = $(By.xpath("//*[@id=\"add_hotel:j_idt42\"]/span"));
    private SelenideElement nameTextFieldErrorLabel = $(By.xpath("//*[@id=\"add_hotel:j_idt43\"]/span[2]"));


    public NewHotelPage verifyMainLabelIsDisplayed(){
        newHotelLabel.shouldBe(visible);
        return this;
    }

    public NewHotelPage verifyDataSectionIsDisplayed(){
        dataSection.shouldBe(visible);
        return this;
    }

    public NewHotelPage verifySaveButtonIsDisplayed(){
        assertTrue(saveButton.isDisplayed());
        return this;
    }

    public NewHotelPage verifyNameFieldIsDisplayed(){
        assertTrue(nameTextField.isDisplayed());
        return this;
    }

    public NewHotelPage verifyNameFieldHasAsterisk(){
        assertTrue(nameTextFieldAsterisk.isDisplayed());
        nameTextFieldAsterisk.shouldHave(exactText("*"));
        return this;
    }

    public NewHotelPage verifyNameFieldIsEditable(){
        assertTrue(nameTextField.getAttribute("aria-readonly").equals("false"));
        return this;
    }

    public NewHotelPage verifyNameFieldAllowsAlphanumericInput(){
        Faker faker = new Faker();
        String randomVal = faker.bothify("?????#####");
        nameTextField.val(randomVal);
        assertEquals(nameTextField.getValue(), randomVal);
        return this;
    }

    public NewHotelPage verifyEmptyNameFieldErrorMessage(){
        nameTextField.clear();
        saveButton.click();
        assertTrue(nameTextFieldErrorLabel.isDisplayed());
        nameTextFieldErrorLabel.shouldHave(text("Name: Validation Error: Value is required."));
        return this;
    }



}
