package ru.yandex.practicum.selenium.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderDone {
    private WebDriver driver;

    private By pageTitle = By.xpath(".//div[text() = 'Заказ оформлен']");
    // Заголовок страницы
    public OrderDone(WebDriver driver) {
        this.driver = driver;
    }

    //Отображается страница оформления заказа
    public void isDoneOrderDisplayed() {
        driver.findElement(pageTitle).isDisplayed();
    }
}
