package com.devchalange.online.test;

import com.codeborne.selenide.Selenide;

public class BaseTest {

    public <T> T at(Class<T> className){
        return Selenide.page(className);
    }
}
