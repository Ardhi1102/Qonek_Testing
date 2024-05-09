package CreateNewChatTemplate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewChatTemplatePage {
    public static WebDriver driver;
    public CreateNewChatTemplatePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//div[@id='navmenu_navbtn_guidebook']")
    private WebElement roboButton;
    public void clickRoboButton(){
        roboButton.click();
    }
    @FindBy(xpath = "//div[@class='ContactListPage_breadcrumbs']")
    private WebElement chatTemplatePage;
    public boolean verChatTemplatePage(){
        return chatTemplatePage.isDisplayed();
    }
    @FindBy(xpath = "//button[@class='connect']")
    private WebElement createNewTemplateButton;
    public void clickCreateNewTemplateButton(){
        createNewTemplateButton.click();
    }
    @FindBy(xpath = "//div[@class='BCTemplateBody']")
    private WebElement modalNewTemplate;
    public boolean verModalNewTemplate(){
        return modalNewTemplate.isDisplayed();
    }
    @FindBy(xpath = "//input[@id='addnewtemplatechat_textinput_templatename']")
    private WebElement templateName;
    public void setTemplateName(String tName){
        templateName.sendKeys(tName);
    }
    @FindBy(xpath = "//div[@class='ql-editor ql-blank']")
    private WebElement chatText;
    public void setChatText(String cText){
        chatText.sendKeys(cText);
        chatText.clear();
    }

    @FindBy(xpath = "//button[@id='addnewtemplate_buble_btn_createtemplate']")
    private WebElement createTemplateButton;
    public void clickCreateTemplateButton(){
        createTemplateButton.click();
    }

    @FindBy(xpath = "//button[@id='addnewtemplate_buble_btn_addbublechat']")
    private WebElement addBubbleButton;
    public void clickAddBubbleButton(){
        addBubbleButton.click();
    }
    @FindBy(xpath = "//div[@class='ql-editor ql-blank']")
    private WebElement otherChat;
    public void setOtherChat(String oChat){
        otherChat.sendKeys(oChat);
    }
    @FindBy(xpath = "//img[@src='/assets/icons/paperclip-2.svg']")
    private WebElement iconUploadImageChat;
    public void clickIconAddBubbleButton(){
        iconUploadImageChat.click();
    }
    @FindBy(xpath = "//input[@id='inputFileImage']")
    private WebElement uploadImageChat;
    public void setUploadImageChat(String image){
        String path = System.getProperty("user.dir") + "/src/test/resources/images/" + image;
        uploadImageChat.sendKeys(path);
    }
}
