package com.sel.pages;

import com.sel.helper.DriverContext;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;


public class BasePage {


    public BasePage() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverContext.Driver), this);

    }

}
