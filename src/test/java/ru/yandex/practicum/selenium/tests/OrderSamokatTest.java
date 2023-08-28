package ru.yandex.practicum.selenium.tests;

import org.junit.Test;
import ru.yandex.practicum.selenium.pages.*;

public class OrderSamokatTest extends BaseTest{

    @Test
    public void checkOrder() {

      // переход на страницу тестового приложения
        webDriver.get("https://qa-scooter.praktikum-services.ru/");

        //Объект главной страницы
        MainPage objMainPage = new MainPage(webDriver);
        //Объект страницы создания заказа
        OrderPage objOrderPage = new OrderPage(webDriver);
        //Объект страницы аренды
        RentPage objRentPage = new RentPage(webDriver);
        //Объект страницы оформление заказа
        FinalOrder objFinalOrder = new FinalOrder(webDriver);
        //Объект готового заказа
        OrderDone objOrderDone = new OrderDone(webDriver);
        //Ожидание прогрузки главной страницы
        objMainPage.waitForLoadPage();
        //Принять куки
        objMainPage.clickCookie();
        //Клик на кнопку заказа в хедере
        objMainPage.clickOrderButton();
        //Отображается страница создания заказа
        objOrderPage.isOrderPageDisplayed();
        //Клик на поле скутер для перехода на главную страницу
        objOrderPage.clickScooter();
        //Клик на кнопку заказа 2
        objMainPage.clickOrderButtonSecond();
        //Отображается страница создания заказа
        objOrderPage.isOrderPageDisplayed();
        //Заполнить поле имя
        objOrderPage.setName("Гена");
        //Заполнить поле фамилия
        objOrderPage.setSurname("Букин");
        //Заполнить поле адрес
        objOrderPage.setAddress("Москва проспект Мира д 7 к 667");
        //Заполнить поле метро
        objOrderPage.setMetro("Преображенская площадь");
        //Заполнить поле телефон
        objOrderPage.setPhone("+79998776655");
        //Клик на кнопку далее
        objOrderPage.clickNext();
        //Отображается страница аренды
        objRentPage.isRentPageDisplayed();
        //Клик на поле календарь
        objRentPage.clickCalendar();
        //Заполнить поле календарь
        objRentPage.clickColour();
        //Заполнить поле период
        objRentPage.clickPeriod();
        //Заполнить поле период
        objRentPage.clickColour();
        //Заполнить поле коммент
        objRentPage.setComment("Привет курьер");
        //Нажать кнопку заказать
        objRentPage.clickOrder();
        //Отображается страница оформления заказа
        objFinalOrder.isFinalOrderDisplayed();
        //Нажать кнопку да
        objFinalOrder.clickButtonYes();
        //Отображается готового заказа
        objOrderDone.isDoneOrderDisplayed();
    }
}
