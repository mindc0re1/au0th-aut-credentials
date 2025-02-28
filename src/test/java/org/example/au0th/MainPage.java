package org.example.au0th;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://www.jetbrains.com/
public class MainPage {


    @Test
    void successfulLoginTest() {
        Configuration.holdBrowserOpen = true;

        open("https://auth0.daxtra.com");
        $("a[href='https://auth0.daxtra.com/token/action.pl']").click();
        $("a[href='action.pl?action=signin&default=signin']").click();
        $("a[href='action.pl?action=signin&default=signout']").click();
        $("a[href='action.pl?action=signin&default=outlunch']").click();
        $("a[href='action.pl?action=signin&default=backlunch']").click();
        $("[name=user_yubi]").setValue("rtyh56u7rut5r5u");
        $("button.btn.btn-success.btn-large[type='submit']").click();
        $(".container-fluid").shouldHave(text("System Message: Authentication Error"));

    }
}