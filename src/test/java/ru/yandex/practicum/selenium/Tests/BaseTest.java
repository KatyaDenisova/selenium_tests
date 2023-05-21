package ru.yandex.practicum.selenium.Tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import ru.yandex.practicum.selenium.helper.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver webDriver;
    @Before
    public void init() {
        webDriver = WebDriverFactory.get();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    @After
    public void clean(){
        webDriver.quit();

    }
}
