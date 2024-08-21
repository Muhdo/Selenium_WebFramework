package Pages;

import BaseClasses.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {
    public LoginPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginBtn;

    public void inputUsername(String text){
        enterText(username, text);
    }

    public void inputPassword(String text){
        enterText(password, text);
    }

    public void clickLoginBtn(){
        click(loginBtn);
    }
}
