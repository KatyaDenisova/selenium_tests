package ru.yandex.practicum.selenium.Pages;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private WebDriver driver;

    private By pageTitle = By.xpath(".//div[text() = 'Учебный тренажер']");
    // Заголовок страницы
    private By cookie = By.xpath(".//button[@class='App_CookieButton__3cvqF']");
    //Куки


//Для теста 1
    private By buttonOrderInHeader = By.xpath(".//button[@class= 'Button_Button__ra12g']");
    //Кнопка заказать в заголовке
    private By buttonOrder = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");
    //Кнопка заказать внизу экрана
// Для теста 2
    private By aboutImportant = By.xpath(".//div[text()='Вопросы о важном']");
    //Раздел вопросы о важном
    private By aboutImportantList = By.xpath(".//div[@data-accordion-component = 'Accordion']");
    //Список раздела вопросы о важном
    private By aboutImportantFirst = By.xpath(".//div[@data-accordion-component = 'AccordionItem'][1]");
    //Вопросы о важном строка 1
    private By aboutImportantFirstText = By.xpath(".//div[@id= 'accordion__panel-0']");
    //Вопросы о важном строка 1 текст
    private By aboutImportantSecond = By.xpath(".//div[@data-accordion-component = 'AccordionItem'][2]");
    //Вопросы о важном строка 2
    private By aboutImportantSecondText = By.xpath(".//div[@id= 'accordion__panel-1']");
    //Вопросы о важном строка 2 текст
    private By aboutImportantThird = By.xpath(".//div[@data-accordion-component = 'AccordionItem'][3]");
    //Вопросы о важном строка 3
    private By aboutImportantThirdText = By.xpath(".//div[@id= 'accordion__panel-2']");
    //Вопросы о важном строка 3 текст
    private By aboutImportantFourth = By.xpath(".//div[@data-accordion-component = 'AccordionItem'][4]");
    //Вопросы о важном строка 4
    private By aboutImportantFourthText = By.xpath(".//div[@id= 'accordion__panel-3']");
    //Вопросы о важном строка 4 текст
    private By aboutImportantFifth = By.xpath(".//div[@data-accordion-component = 'AccordionItem'][5]");
    //Вопросы о важном строка 5
    private By aboutImportantFifthText = By.xpath(".//div[@id= 'accordion__panel-4']");
    //Вопросы о важном строка 5 текст
    private By aboutImportantSixth = By.xpath(".//div[@data-accordion-component = 'AccordionItem'][6]");
    //Вопросы о важном строка 6
    private By aboutImportantSixthText = By.xpath(".//div[@id= 'accordion__panel-5']");
    //Вопросы о важном строка 6 текст
    private By aboutImportantSeventh = By.xpath(".//div[@data-accordion-component = 'AccordionItem'][7]");
    //Вопросы о важном строка 7
    private By aboutImportantSeventhText = By.xpath(".//div[@id= 'accordion__panel-6']");
    //Вопросы о важном строка 7 текст
    private By aboutImportantEighth = By.xpath(".//div[@data-accordion-component = 'AccordionItem'][8]");
    //Вопросы о важном строка 8
    private By aboutImportantEighthText = By.xpath(".//div[@id= 'accordion__panel-7']");
    //Вопросы о важном строка 8 текст

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    //Метод ожидания прогрузки страницы
    public void waitForLoadPage() {
        new WebDriverWait(driver, 10).until(driver -> (driver.findElement(pageTitle)).isDisplayed());
    }
    //Принять куки
    public void clickCookie() {
        driver.findElement(cookie).click();
    }
//Для теста 1
    //Метод скролла к разделу о важном
    public void scrollToAboutImportant(){
        WebElement element = driver.findElement(aboutImportant);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);
    }
    //Метод проверки отображения эелементов раздела о важном
    public void waitForImportantList() {
        new WebDriverWait(driver, 10).until(driver -> (driver.findElement(aboutImportantList)).isDisplayed());
    }
    //Метод проверки клика по элементу в разделе о важном 1
    public void clickImportantFirst() {
        driver.findElement(aboutImportantFirst).click();
    }
    //Метод проверки отображения текста в разделе о важном в эелементе 1
    public void displayedImportantFirst() {
        driver.findElement(aboutImportantFirstText).isDisplayed();
    }
    //Метод проверки клика по элементу в разделе о важном 2
    public void clickImportantSecond() {
        driver.findElement(aboutImportantSecond).click();
    }
    //Метод проверки отображения текста в разделе о важном в эелементе 2
    public void displayedImportantSecond() {
        driver.findElement(aboutImportantSecondText).isDisplayed();
    }
    //Метод проверки клика по элементу в разделе о важном 3
    public void clickImportantThird() {
        driver.findElement(aboutImportantThird).click();
    }
    //Метод проверки отображения текста в разделе о важном в эелементе 3
    public void displayedImportantThird() {
        driver.findElement(aboutImportantThirdText).isDisplayed();
    }
    //Метод проверки клика по элементу в разделе о важном 4
    public void clickImportantFourth() {
        driver.findElement(aboutImportantFourth).click();
    }
    //Метод проверки отображения текста в разделе о важном в эелементе 4
    public void displayedImportantFourth() {
        driver.findElement(aboutImportantFourthText).isDisplayed();
    }
    //Метод проверки клика по элементу в разделе о важном 5
    public void clickImportantFifth() {
        driver.findElement(aboutImportantFifth).click();
    }
    //Метод проверки отображения текста в разделе о важном в эелементе 5
    public void displayedImportantFifth() {
        driver.findElement(aboutImportantFifthText).isDisplayed();
    }
    //Метод проверки клика по элементу в разделе о важном 6
    public void clickImportantSixth() {
        driver.findElement(aboutImportantSixth).click();
    }
    //Метод проверки отображения текста в разделе о важном в эелементе 6
    public void displayedImportantSixth() {
        driver.findElement(aboutImportantSixthText).isDisplayed();
    }
    //Метод проверки клика по элементу в разделе о важном 7
    public void clickImportantSeventh() {
        driver.findElement(aboutImportantSeventh).click();
    }
    //Метод проверки отображения текста в разделе о важном в эелементе 7
    public void displayedImportantSeventh() {
        driver.findElement(aboutImportantSeventhText).isDisplayed();
    }
    //Метод проверки клика по элементу в разделе о важном 8
    public void clickImportantEighth() {
        driver.findElement(aboutImportantEighth).click();
    }
    //Метод проверки отображения текста в разделе о важном в эелементе 8
    public void displayedImportantEighth() {
        driver.findElement(aboutImportantEighthText).isDisplayed();
    }

//Для теста 1
    // Метод для нажатия на заказать в хедере
    public void clickOrderButton() {
        driver.findElement(buttonOrderInHeader).click();
    }

    // Метод для нажатия на заказать внизу экрана
    public void clickOrderButtonSecond() {
        driver.findElement(buttonOrder).click();
    }

}
