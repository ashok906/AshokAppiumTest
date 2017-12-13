package com.sel.pages;


import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {


    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Create an account now']")
    public static WebElement createAnAccountNow;


    public RegistrationPage CreateAnAccount() {
        createAnAccountNow.click();
        return  new RegistrationPage();
    }
}
