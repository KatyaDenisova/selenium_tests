package ru.yandex.practicum.selenium.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RentPage {
    private WebDriver driver;
    private By pageTitle = By.xpath(".//div[text() = 'Про аренду']");
    // Заголовок страницы
    private By fieldCalendar = By.xpath(".//div[@class='react-datepicker__input-container']");
    //Поле кадендарь
    private By calendar = By.xpath(".//div[contains(@class,'react-datepicker__day--today')]");
    //Поле дата
    private By rentPeriod = By.xpath(".//div[@class='Dropdown-placeholder']");
    //Поле срок аренды
    private By oneDay = By.xpath(".//div[@role='option'][1]");
    //Выбор из списка
    private By colorScooter = By.xpath(".//input[@id='black']");
    //Чекбокс цвет самоката черный
    private By comment = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
    //Коментарий
    private By order = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //Кнопка заказать
    public RentPage(WebDriver driver) {
        this.driver = driver;
    }

    //Страница аренды
    public void isRentPageDisplayed() {
        driver.findElement(pageTitle).isDisplayed();
    }
    //Клик на поле календарь
    public void clickCalendar() {
        driver.findElement(fieldCalendar).click();
        driver.findElement(calendar).click();
    }

    //Клик на поле период
    public void clickPeriod() {
        driver.findElement(rentPeriod).click();
        driver.findElement(oneDay).click();

    }
    //Клик на поле цвет
    public void clickColour() {
        driver.findElement(colorScooter).click();
    }
    //Заполнение поля коммент
    public void setComment(String text){
        driver.findElement(comment).sendKeys(text);
    }
    //Нажать кнопку заказать
    public void clickOrder() {
        driver.findElement(order).click();

    }
}
