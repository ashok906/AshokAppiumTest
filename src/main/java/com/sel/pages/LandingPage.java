package com.sel.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;


public class LandingPage extends BasePage {


    @AndroidFindBy(xpath = "//android.widget.Button[@text = 'I Agree']")
    public static WebElement iAgreeElement;


    public LoginPage AcceptTermsAndConditions() {
        iAgreeElement.click();
        return new LoginPage();
    }
}