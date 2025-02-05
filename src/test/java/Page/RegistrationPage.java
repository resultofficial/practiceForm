package Page;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.io.File;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    public static SelenideElement firstNameInput = $("#firstName");
    public static SelenideElement lastNameInput = $("#lastName");
    public static SelenideElement userEmailInput = $("#userEmail");
    public static SelenideElement genderFemale = $("[for='gender-radio-2']");
    public static SelenideElement userNumber = $("#userNumber");
    public static SelenideElement subjectsInputIn = $("#subjectsInput");
    public static SelenideElement subjectsInput = $("#react-select-2-option-1");
    public static SelenideElement hobbiesWrapper = $("#hobbiesWrapper");
    public static SelenideElement uploadPicture = $("#uploadPicture");
    public static SelenideElement currentAddress = $("#currentAddress");
    public static SelenideElement stateInput = $("#react-select-3-option-0");
    public static SelenideElement scrolTo = $("#state");
    public static SelenideElement scrolTocity = $("#city");
    public static SelenideElement actionCity = $("#react-select-4-option-2");
    public static SelenideElement sumbitInput = $("#submit");
    public static SelenideElement closeLargeModal = $("#closeLargeModal");

@Step ("Открыть главную страницу")
    public RegistrationPage openPage(String endPoint) {
        open(endPoint);
        return this;
    }
@Step("Ввести имя")
    public RegistrationPage setFirstNameInput(String name) {
        firstNameInput.setValue(name);
        return this;
    }
    @Step("Ввести фамилию")
    public RegistrationPage setLastNameInput(String lastName) {
        lastNameInput.setValue(lastName);
        return this;
    }
    @Step("Ввести email")
    public RegistrationPage setUserEmailInput(String userEmail) {
        userEmailInput.setValue(userEmail);
        return this;
    }
    @Step("Выбрать женский пол")
    public RegistrationPage setClickButten() {
        genderFemale.click();
        return this;

    }
    @Step("Прописать номер телефона")
    public RegistrationPage setUserNumberInput(String Number) {
        userNumber.setValue(Number);
        return this;

    }
    @Step("Выбор предмета")
    public RegistrationPage setSubjectsInput(String Subjects) {
        subjectsInputIn.setValue(Subjects);
        subjectsInput.click();
        return this;

    }
    @Step("Выбор хобби")
    public RegistrationPage setHobbies(String hobbies) {
        hobbiesWrapper.$(byText(hobbies)).click();
        return this;

    }
    @Step("Загрузка картинки")
    public RegistrationPage setuploadPicture() {
        File fileToUpload = new File("src/test/resources/upscaled.jpeg");
        uploadPicture.uploadFile(fileToUpload);
        return this;
    }
    @Step("Добавление адресса")
    public RegistrationPage setAddress(String comment) {
        currentAddress.setValue(comment);
        return this;
    }
    @Step("Выбор штата и города")
    public RegistrationPage setStatusAndCity() {
        scrolTo.scrollTo().click();
        stateInput.click();
        scrolTocity.click();
        actionCity.click();
        return this;
    }
    @Step("Нажатие Sumbit")
    public RegistrationPage actionSumbit () {
        sumbitInput.scrollTo().click();
        return this;
    }
    @Step("Закрытие формы")
    public RegistrationPage closePhorm () {
        closeLargeModal.click();
        return this;
    }

}