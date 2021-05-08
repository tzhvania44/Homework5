import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;


public class FacebookRegistration {

    @Test
    public void test() {
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
        Configuration.startMaximized = true;

        Selenide.open("https://www.facebook.com/");

        $("._42ft", 3).click();
        $(byName("firstname")).setValue("Tako");
        $(byName("lastname")).setValue("Zhvania");
        $(byName("reg_email__")).setValue("995577467307");
        $("#password_step_input").setValue("Tako44Tako");
        $(byName("birthday_month")).selectOption("Jun");
        $("#day").selectOption(2);
        $(byName("birthday_year")).selectOption("1993");
        $("._58mt", 2).click();
        $("._7-16").shouldBe(Condition.visible);
        $(byName("custom_gender")).shouldBe(Condition.visible);
        $("._7-16").selectOption("She: \"Wish her a happy birthday!\"");
        sleep(1000);
        $("._58mt", 0).click();
        $("._7-16").shouldBe(Condition.disappear);
        $(byName("custom_gender")).shouldBe(Condition.disappear);
        sleep(5000);


    }
}



