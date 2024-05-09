package step_definitions.Login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginPage;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import step_definitions.Hooks;

public class LoginStep {
    public WebDriver webDriver;

    public LoginStep(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User allready login with valid {string} and {string}")
    public void userAllreadyOnHomePage(String userId, String password) throws InterruptedException {
        Thread.sleep(5000);
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verLoginPage());
        loginPage.setUserId(userId);
        loginPage.setPassword(password);
        loginPage.clickBtnLogin();
        Thread.sleep(5000);
        Assert.assertTrue(loginPage.verHomePage());
        Thread.sleep(2000);
    }

    @Then("User allready on HomePage")
    public void userAllreadyOnHomePage() {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verHomePage2());
    }
}
