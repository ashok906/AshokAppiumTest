package com.sel.app;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static com.sel.helper.DriverContext.Driver;

public class BaseTest {


    @BeforeTest
    public void Setup() throws MalformedURLException {


        File file = new File("src/main/java/com/sel/app");
        File app = new File(file, "floow.apk");


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.thefloow.flo");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.thefloow.flo.activity.LauncherActivity");

        // capabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, "com.thefloow.flo");

        Driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterTest
    public void tearDown() {
        Driver.quit();

    }
}
