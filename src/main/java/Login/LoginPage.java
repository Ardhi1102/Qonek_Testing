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

    @FindBy(xpath = "//p[.='Masuk ke Akun Anda']")
    private WebElement btnLogin;
    public void clickBtnLogin(){
        btnLogin.click();
    }

    @FindBy(xpath = "//img[@src='/assets/logo-qonek.png']")
    private WebElement homePage;

    public boolean verHomePage(){
        return homePage.isDisplayed();
    }
}
