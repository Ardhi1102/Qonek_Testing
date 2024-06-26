package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class='main']")
    private WebElement loginPage;
    public boolean verLoginPage(){
        return loginPage.isDisplayed();
    }

    @FindBy(xpath = "//input[@id='sign_in_text_input_email']")
    private WebElement userName;
    public void setUserId(String usName){
        userName.sendKeys(usName);
    }

    @FindBy(xpath = "//input[@id='sign_in_text_input_password']")
    private WebElement password;
    public void setPassword(String passw){
        password.sendKeys(passw);
    }

    @FindBy(xpath = "//button[@id='sign_in_button_sign_in']")
    private WebElement btnLogin;
    public void clickBtnLogin(){
        btnLogin.click();
    }

    @FindBy(xpath = "//img[@src='/assets/logo-qonek.png']")
    private WebElement homePage;

    public boolean verHomePage(){
        return homePage.isDisplayed();
    }
    @FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-container NavigationMenu_Menu css-1d3bbye']")
    private WebElement homePage2;

    public boolean verHomePage2(){
        return homePage2.isDisplayed();
    }
}
