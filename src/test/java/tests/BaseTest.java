package tests;

import com.codeborne.selenide.Configuration;
import helpers.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

public class BaseTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";//игнорируем медленную загруз.стр
        Configuration.timeout = 5000; // default 4000
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
        //указываем что бы видео записывалось
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true //вкл выдео
        ));
        Configuration.browserCapabilities = capabilities;
    }
    @AfterEach
    void addAttachment(){
        Attach.screenshotAs("Last screenshot");
        Attach.browserConsoleLogs();
        Attach.pageSource();
        Attach.addVideo();
    }

}
