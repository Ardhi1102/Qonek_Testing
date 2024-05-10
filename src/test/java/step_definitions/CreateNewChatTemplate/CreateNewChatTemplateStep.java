package step_definitions.CreateNewChatTemplate;

import CreateNewChatTemplate.CreateNewChatTemplatePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class CreateNewChatTemplateStep {
    public WebDriver webDriver;
    public CreateNewChatTemplateStep(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("User click on robo button")
    public void userClickOnRoboButton() {
        CreateNewChatTemplatePage createNewChatTemplatePage = new CreateNewChatTemplatePage(webDriver);
        createNewChatTemplatePage.clickRoboButton();
    }

    @Then("User allready on Chat Template page")
    public void userAllreadyOnChatTemplatePage() throws InterruptedException {
        Thread.sleep(2000);
        CreateNewChatTemplatePage createNewChatTemplatePage = new CreateNewChatTemplatePage(webDriver);
        Assert.assertTrue(createNewChatTemplatePage.verChatTemplatePage());
    }

    @And("User click on Create New Template button")
    public void userClickOnCreateNewTemplateButton() {
        CreateNewChatTemplatePage createNewChatTemplatePage = new CreateNewChatTemplatePage(webDriver);
        createNewChatTemplatePage.clickCreateNewTemplateButton();
    }

    @Then("Modal create new template will appear")
    public void modalCreateNewTemplateWillAppear() throws InterruptedException {
        Thread.sleep(2000);
        CreateNewChatTemplatePage createNewChatTemplatePage = new CreateNewChatTemplatePage(webDriver);
        Assert.assertTrue(createNewChatTemplatePage.verModalNewTemplate());
    }

    @And("User input Template Name with {string}")
    public void userInputTemplateNameWith(String tempName) {
        CreateNewChatTemplatePage createNewChatTemplatePage = new CreateNewChatTemplatePage(webDriver);
        createNewChatTemplatePage.setTemplateName(tempName);
    }

    @When("User input Chat Text with {string}")
    public void userInputChatTextWith(String chText) {
        CreateNewChatTemplatePage createNewChatTemplatePage = new CreateNewChatTemplatePage(webDriver);
        createNewChatTemplatePage.setChatText(chText);
    }

    @And("User click on Create Template button")
    public void userClickOnCreateTemplateButton() {
        CreateNewChatTemplatePage createNewChatTemplatePage = new CreateNewChatTemplatePage(webDriver);
        createNewChatTemplatePage.clickCreateTemplateButton();
    }

    @And("User click on Add bubble chat")
    public void userClickOnAddBubbleChat() {
        CreateNewChatTemplatePage createNewChatTemplatePage = new CreateNewChatTemplatePage(webDriver);
        createNewChatTemplatePage.clickAddBubbleButton();
    }

    @When("User input Other Chat Text with {string}")
    public void userInputOtherChatTextWith(String otChat) {
        CreateNewChatTemplatePage createNewChatTemplatePage = new CreateNewChatTemplatePage(webDriver);
        createNewChatTemplatePage.setOtherChat(otChat);
    }

    @And("User upload image chat")
    public void userUploadImageChat() throws InterruptedException {
        CreateNewChatTemplatePage createNewChatTemplatePage = new CreateNewChatTemplatePage(webDriver);
        Thread.sleep(1000);
        createNewChatTemplatePage.clickIconAddBubbleButton();
        Thread.sleep(2000);
        createNewChatTemplatePage.setUploadImageChat("imageTest.jpg");
    }
    
}
