import Page.RegistrationPage;
import Page.components.CalendarComponent;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Form {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = false;
        Configuration.timeout = 5000; // default 4000
    }

    RegistrationPage registrationPage = new RegistrationPage();
    CalendarComponent calendarComponent = new CalendarComponent();

    @Test
    void fillFormTest() {
        registrationPage.openPage("/automation-practice-form")
                .setFirstNameInput("Nasty")
                .setLastNameInput("Ermolaeva")
                .setUserEmailInput("nasty@mail.com")
                .setClickButten()
                .setUserNumberInput("89109117561");
        calendarComponent.setMonthYearDay("December", "1994", "3");
        registrationPage.setSubjectsInput("c")
                .setHobbies("Music")
                .setuploadPicture()
                .setAddress("молодец")
                .setStatusAndCity()
                .actionSumbit()
                .closePhorm();
    }

    @Test
    void minProverca() {
        //open("/automation-practice-form");
        registrationPage.openPage("/automation-practice-form")
                .setFirstNameInput("Nasty")
                .setLastNameInput("Ermolaeva")
                .setUserEmailInput("nasty@mail.com")
                .setClickButten()
                .setUserNumberInput("89109117561")
                .actionSumbit()
                .closePhorm();
    }

    @Test
    void negativProverca() {
        // open("/automation-practice-form");
        registrationPage.openPage("/automation-practice-form")
                .setUserNumberInput("123456789")
                .actionSumbit();
    }
}