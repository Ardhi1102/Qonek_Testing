package step_definitions.EditBubbleChat;

import CreateNewChatTemplate.CreateNewChatTemplatePage;
import EditBubbleChat.EditBubbleChatPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class EditBubbleChatStep {
    public WebDriver webDriver;

    public EditBubbleChatStep(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @When("User click on New Template button")
    public void userClickOnNewTemplateButton() {
        EditBubbleChatPage editBubbleChatPage = new EditBubbleChatPage(webDriver);
        editBubbleChatPage.clickNewTemplateButton();
    }

    @And("User click on Load Existing")
    public void userClickOnLoadExisting() {
        EditBubbleChatPage editBubbleChatPage = new EditBubbleChatPage(webDriver);
        editBubbleChatPage.clickLoadExistingButton();
    }

    @And("User select template existing")
    public void userSelectTemplateExisting() {
        EditBubbleChatPage editBubbleChatPage = new EditBubbleChatPage(webDriver);
        editBubbleChatPage.clickSelectTemplateExisting();
    }

    @And("User edit chat text with {string}")
    public void userEditChatTextWith(String edit) throws InterruptedException {
        EditBubbleChatPage editBubbleChatPage = new EditBubbleChatPage(webDriver);
        Thread.sleep(2000);
        editBubbleChatPage.setClearChatText();
        Thread.sleep(2000);
        editBubbleChatPage.setEditChatText(edit);
    }

    @And("User click on Edit Template")
    public void userClickOnEditTemplate() {
        EditBubbleChatPage editBubbleChatPage = new EditBubbleChatPage(webDriver);
        editBubbleChatPage.clickEditTemplateButton();
    }

    @And("User edit Hotkey with {string}")
    public void userEditHotkeyWith(String hKey) throws InterruptedException {
        EditBubbleChatPage editBubbleChatPage = new EditBubbleChatPage(webDriver);
        Thread.sleep(2000);
        editBubbleChatPage.setClearHotkey();
        Thread.sleep(2000);
        editBubbleChatPage.setEditHotkey(hKey);
    }

    @And("User edit Template Name with {string}")
    public void userEditTemplateNameWith(String tName) throws InterruptedException {
        EditBubbleChatPage editBubbleChatPage = new EditBubbleChatPage(webDriver);
        Thread.sleep(2000);
        editBubbleChatPage.setClearTemplateName();
        Thread.sleep(2000);
        editBubbleChatPage.setEditTemplateName(tName);
    }
}
