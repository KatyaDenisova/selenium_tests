package ru.yandex.practicum.selenium.Tests;

import org.junit.Test;
import ru.yandex.practicum.selenium.Pages.MainPage;

public class QuestionsAboutImportantTest extends BaseTest{

    @Test
    public void checkQuestionsAboutImportant() {

        // переход на страницу тестового приложения
        webDriver.get("https://qa-scooter.praktikum-services.ru/");

        //Объект главной страницы
        MainPage objMainPage = new MainPage(webDriver);

        //Ожидание прогрузки главной страницы
        objMainPage.waitForLoadPage();
        //Принять куки
        objMainPage.clickCookie();

        //Скролл к элементу о важном
        objMainPage.scrollToAboutImportant();

        //Отображение списка элементов раздела о важном
        objMainPage.waitForImportantList();
        //Клик по элементу 1
        objMainPage.clickImportantFirst();
        //Проверка текста в элементе 1
        objMainPage.displayedImportantFirst();
        //Клик по элементу 2
        objMainPage.clickImportantSecond();
        //Проверка текста в элементе 2
        objMainPage.displayedImportantSecond();
        //Клик по элементу 3
        objMainPage.clickImportantThird();
        //Проверка текста в элементе 3
        objMainPage.displayedImportantThird();
        //Клик по элементу 4
        objMainPage.clickImportantFourth();
        //Проверка текста в элементе 4
        objMainPage.displayedImportantFourth();
        //Клик по элементу 5
        objMainPage.clickImportantFifth();
        //Проверка текста в элементе 5
        objMainPage.displayedImportantFifth();
        //Клик по элементу 6
        objMainPage.clickImportantSixth();
        //Проверка текста в элементе 6
        objMainPage.displayedImportantSixth();
        //Клик по элементу 7
        objMainPage.clickImportantSeventh();
        //Проверка текста в элементе 7
        objMainPage.displayedImportantSeventh();
        //Клик по элементу 8
        objMainPage.clickImportantEighth();
        //Проверка текста в элементе 8
        objMainPage.displayedImportantEighth();
    }


}

