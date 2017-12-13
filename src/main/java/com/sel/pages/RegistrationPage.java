package com.sel.pages;


import com.sel.helper.DriverContext;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class RegistrationPage extends BasePage {

    public static final String Data = "0123456789abcdefghijklmnopqrstuvwxyz";
    public static Random RandomValue = new Random();


    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'First name']")
    public static WebElement firstNameElement;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Surname']")
    public static WebElement secondNameElement;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Date of birth (at least 17 years old)']")
    public static WebElement dateOfBirthElement;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'OK']")
    public static WebElement confirmDateOfBirthElement;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'E-mail address']")
    public static WebElement emailElement;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Postcode']")
    public static WebElement postcodeElement;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Company name']")
    public static WebElement companyElement;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Choose a password (min 8 characters)']")
    public static WebElement passwordElement;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Repeat password to confirm']")
    public static WebElement confirmPasswordElement;

    @AndroidFindBy(xpath = "//android.widget.Button[@text = 'Submit']")
    public static WebElement submitELement;


    public void EnterRegistrationDetails() {

        firstNameElement.sendKeys("testfirstname");
        secondNameElement.sendKeys("testsurname");
        String email = GetRandomValue(5);
        emailElement.sendKeys(email + "@abc.com");
        postcodeElement.sendKeys("BS14DE");
        companyElement.sendKeys("flowdrive");
        DriverContext.Driver.hideKeyboard();
        String password = GetRandomValue(8);
        passwordElement.sendKeys(password);
        DriverContext.Driver.hideKeyboard();
        confirmPasswordElement.sendKeys(password);
        DriverContext.Driver.hideKeyboard();
    }

    public RegistrationCompletePage SubmitRegistrationDetails()
    {
        EnterRegistrationDetails();
        submitELement.click();
        return  new RegistrationCompletePage();
    }

    private String GetRandomValue(int len) {
        StringBuilder sb = new StringBuilder(len);

        for (int i = 0; i < len; i++) {
            sb.append(Data.charAt(RandomValue.nextInt(Data.length())));
        }

        return sb.toString();
    }
}

