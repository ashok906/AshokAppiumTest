
package com.sel.app;

import com.sel.pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class FloowDriveApplicationTest extends BaseTest {


    @Test
    public void CreateAccount() throws MalformedURLException, InterruptedException {


        LandingPage landingPage = new LandingPage();
        String expectedMessage = landingPage.AcceptTermsAndConditions().
                CreateAnAccount().SubmitRegistrationDetails().GetRegistrationSuccessMessage();
        Assert.assertEquals("Registration successful, please login.", expectedMessage);

    }

}
