package tests;

import Page.RegistrationPage;
import Page.components.CalendarComponent;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static tests.TestData.*;


public class Formated extends BaseTest {


    RegistrationPage registrationPage = new RegistrationPage();
    CalendarComponent calendarComponent = new CalendarComponent();
//    Faker faker = new Faker(new Locale("ru"));

    @Test
    @Tag("anketa")
    @Feature("Форма анкеты")
    @Story("Анкета")
    @Owner("AErmolaeva")
    @DisplayName("Заполнение анкеты студента положительный кейс")
    void fillFormTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

//        String name = faker.name().name();
//        String lastName = faker.name().lastName();
//        String userEmail = faker.internet().emailAddress();


        registrationPage.openPage("/automation-practice-form")
                .setFirstNameInput(name)
                .setLastNameInput(lastName)
                .setUserEmailInput(userEmail)
                .setClickButten()
                .setUserNumberInput(Number);
        calendarComponent.setMonthYearDay(month, year, day);
        registrationPage.setSubjectsInput(Subjects)
                .setHobbies(hobbies)
                .setuploadPicture()
                .setAddress(comment)
                .setStatusAndCity()
                .actionSumbit()
                .closePhorm();
    }

    @Test
    void minProverca() {
        //open("/automation-practice-form");
        registrationPage.openPage(open)
                .setFirstNameInput(name)
                .setLastNameInput(lastName)
                .setUserEmailInput(userEmail)
                .setClickButten()
                .setUserNumberInput(Number)
                .actionSumbit()
                .closePhorm();
    }

    @Test
    void negativProverca() {
        // open("/automation-practice-form");
        registrationPage.openPage(open)
                .setUserNumberInput("123456789")
                .actionSumbit();
    }
}