package ru.yandex.practicum.selenium.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    private WebDriver driver;

    private By pageTitle = By.xpath(".//div[text() = 'Для кого самокат']");
    // Заголовок страницы
    private By scooter = By.xpath(".//a[@class= 'Header_LogoScooter__3lsAR']");
    //Поле с названием самокат

    private By name = By.xpath(".//input[@placeholder= '* Имя']");
    //Поле имя
    private By surname = By.xpath(".//input[@placeholder= '* Фамилия']");
    //Поле фамилия
    private By address = By.xpath(".//input[@placeholder= '* Адрес: куда привезти заказ']");
    //Поле адрес
    private By metro = By.xpath(".//input[@placeholder= '* Станция метро']");
    //Поле станция метро
    private By phone = By.xpath(".//input[@placeholder= '* Телефон: на него позвонит курьер']");
    //* Телефон: на него позвонит курьер
    private By next = By.xpath(".//button[@class= 'Button_Button__ra12g Button_Middle__1CSJM']");
    //Кнопка далее

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    //Страница создания заказа отображается
    public void isOrderPageDisplayed() {
        driver.findElement(pageTitle).isDisplayed();
    }
    //Клик на поле самокат
    public void clickScooter() {
        driver.findElement(scooter).click();
    }
    //Заполнение поля имя
    public void setName(String text){
        driver.findElement(name).sendKeys(text);
    }
    //Заполнение поля фамилия
    public void setSurname(String text){
        driver.findElement(surname).sendKeys(text);
    }
    //Заполнение поля адрес
    public void setAddress(String text){
        driver.findElement(address).sendKeys(text);
    }
    //Заполнение поля метро
    public void setMetro(String text){
        driver.findElement(metro).sendKeys(text);
        driver.findElement(By.xpath(".//div[text()='"+ text +"']")).click();
    }
    //Заполнение поля телефон
    public void setPhone(String text){
        driver.findElement(phone).sendKeys(text);
    }
    //Клик на поле далее
    public void clickNext() {
        driver.findElement(next).click();
    }
}






