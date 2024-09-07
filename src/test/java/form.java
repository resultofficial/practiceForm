import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class form {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000; // default 4000
    }

    @Test
    void fillFormTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Nasty");
        $("#lastName").setValue("Ermolaeva");
        $("#userEmail").setValue("nasty@mail.com");
        $("[for='gender-radio-2']").click();
        $("#userNumber").setValue("89109117561");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption("December");
        $(".react-datepicker__year-select").selectOption("1994");
        $(".react-datepicker__week").$(byText("3")).click();
        $("#subjectsInput").setValue("c");
        $("#react-select-2-option-1").click();
        $("#hobbiesWrapper").$(byText("Music")).click();
        File fileToUpload = new File("src/test/resources/upscaled.jpeg");
        $("#uploadPicture").uploadFile(fileToUpload);
        $("#currentAddress").setValue("молодец");
        $("#state").scrollTo().click();
        $("#react-select-3-option-0").click();
        $("#city").scrollTo().click();
        $("#react-select-4-option-2").click();
        $("#submit").click();
        $("#closeLargeModal").click();

    }
}

