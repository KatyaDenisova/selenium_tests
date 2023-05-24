package ru.yandex.practicum.selenium.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinalOrder {
    private WebDriver driver;

    private By pageTitle = By.xpath(".//div[text() = 'Хотите оформить заказ?']");
    // Заголовок страницы
    private By buttonYes = By.xpath(".//button[text()='Да']");
    //Кнопка да
    public FinalOrder(WebDriver driver) {
        this.driver = driver;
    }

    //Отображается страница оформления заказа
    public void isFinalOrderDisplayed() {
        driver.findElement(pageTitle).isDisplayed();
    }
    //Клик на поле самокат
    public void clickButtonYes() {
        driver.findElement(buttonYes).click();
    }
    //Заполнение поля имя
}
