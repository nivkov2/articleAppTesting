package com.devchalange.online.test;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URI;

public class BaseTest {

    @BeforeSuite
    public void setup() throws MalformedURLException {

//        Configuration.headless = true;
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        WebDriverRunner.setWebDriver(initChromeDriver());
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("latest");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);

        RemoteWebDriver driver = new RemoteWebDriver(
                URI.create("http://host.docker.internal:4444/wd/hub/").toURL(),
                capabilities

        );

        WebDriverRunner.setWebDriver(driver);
    }

    public <T> T at(Class<T> className){
        return Selenide.page(className);
    }
}
