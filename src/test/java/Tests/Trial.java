package Tests;

import BaseClasses.TestBase;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Trial extends TestBase {

    LoginPage loginPage;

    public void initializer(){
        loginPage = new LoginPage(driver);
    }

    @Test(priority = 1, description = "Validate user is able to access the site")
    public void TC_01(){
        initializer();
        Assert.assertEquals(testData.getProperty("url"), "https://www.saucedemo.coms/");
    }


    @Test(priority = 2, description = "Validate that user cannot login with invalid details")
    public void TC_02 (){
        loginPage.inputUsername(testData.getProperty("username"));
        loginPage.inputPassword(testData.getProperty("password"));
        loginPage.clickLoginBtn();
        sleep(5);
    }

    //note to self, checkout to a new branch, maybe testng part and work there, when that works, i can then merge all the codes

}
