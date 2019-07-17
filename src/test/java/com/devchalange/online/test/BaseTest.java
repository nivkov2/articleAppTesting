package com.devchalange.online.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    @BeforeSuite
    public void setup(){
        Configuration.headless = true;
    }

    public <T> T at(Class<T> className){
        return Selenide.page(className);
    }
}
