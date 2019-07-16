package com.devchalange.online.pages;

import com.codeborne.selenide.Selenide;
import com.devchalange.online.forms.NavigationForm;

public class BasePage {

    protected NavigationForm navigationForm = new NavigationForm();

    public <T> T at(Class<T> className){
        return Selenide.page(className);
    }

}
