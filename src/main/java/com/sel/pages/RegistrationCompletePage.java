package com.sel.pages;


import com.sel.helper.DriverContext;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationCompletePage extends BasePage {

    @AndroidFindBy(xpath = "//android.widget.TextView[@index='2')]")
    public static WebElement registrationSuccessMessage;

    public RegistrationCompletePage SelectLoginButton() {

        WebDriverWait wait = new WebDriverWait(DriverContext.Driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@text='Log in']")));
        DriverContext.Driver.findElementByXPath("//android.widget.Button[@text='Log in']").click();
        return this;
    }

    public String GetRegistrationSuccessMessage() {
        return registrationSuccessMessage.
                getText();
    }
}
