package Page.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    public static SelenideElement clickPole = $("#dateOfBirthInput");
    public static SelenideElement monthInput = $(".react-datepicker__month-select");
    public static SelenideElement yearInput = $(".react-datepicker__year-select");
    public static SelenideElement dayInput = $(".react-datepicker__week");


    public CalendarComponent setMonthYearDay (String month, String year, String day) {
        clickPole.click();
        monthInput.click();
        monthInput.selectOption(month);
        yearInput.selectOption(year);
        dayInput.$(byText(day)).click();
        return this;
    }

    public CalendarComponent setyear(String year) {
        yearInput.setValue(year);
        return this;
    }

    public CalendarComponent setday(String day) {
        dayInput.setValue(day);
        return this;
    }

}
