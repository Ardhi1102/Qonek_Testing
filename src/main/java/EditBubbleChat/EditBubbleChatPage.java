package EditBubbleChat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditBubbleChatPage {
    public static WebDriver driver;
    public EditBubbleChatPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//button[@id='chattemplate_btn_createnew']")
    private WebElement newTemplateButton;
    public void clickNewTemplateButton(){
        newTemplateButton.click();
    }
    @FindBy(xpath = "//button[@id='addnewtemplatechat_btn_loadexisting']")
    private WebElement loadExistingButton;
    public void clickLoadExistingButton(){
        loadExistingButton.click();
    }
    @FindBy(xpath = "(//*[@role='menuitem'])[2]")
    private WebElement selectTemplateExisting;
    public void clickSelectTemplateExisting(){
        selectTemplateExisting.click();
    }
    @FindBy(xpath = "//div[@class='ql-editor']")
    private WebElement clearChatText;
    public void setClearChatText(){
        clearChatText.clear();
    }
    @FindBy(xpath = "//div[@data-placeholder='Input Chat Text']")
    private WebElement editChatText;
    public void setEditChatText(String cText){
        editChatText.sendKeys(cText);
    }
    @FindBy(xpath = "//input[@id='inputlabel_textinput_hotkey']")
    private WebElement clearHotkey;
    public void setClearHotkey(){
        clearHotkey.clear();
    }
    @FindBy(xpath = "//input[@id='inputlabel_textinput_hotkey']")
    private WebElement editHotkey;
    public void setEditHotkey(String hotkey){
        editHotkey.sendKeys(hotkey);
    }
    @FindBy(xpath = "//button[@id='addnewtemplate_buble_btn_createtemplate']")
    private WebElement editTemplateButton;
    public void clickEditTemplateButton(){
        editTemplateButton.click();
    }
}
