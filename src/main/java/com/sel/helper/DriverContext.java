package com.sel.helper;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;


public  class DriverContext {

    public static AppiumDriver<WebElement> Driver;


    public static AppiumDriver<WebElement> Driver() {

        return Driver;
    }


}
