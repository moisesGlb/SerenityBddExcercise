package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.ExpectedConditions;
import resources.GlobalConfig;

public class LoginPage extends PageObject {

    @FindBy(id = "user-name")
    private WebElementFacade userName;

    @FindBy(id="password")
    private WebElementFacade password;

    @FindBy(id = "login-button")
    private WebElementFacade loginBtn;

    @FindBy(xpath = "//div[@class=\"error-message-container error\"]//h3")
    private WebElementFacade errorMessage;

    @FindBy(xpath = "//div[@class=\"error-message-container error\"]//button")
    private WebElementFacade closeErrorMessage;

    public void getLoginPage(){
        getDriver().get(GlobalConfig.MAIN_URL);
    }

    public void clickLoginBtn(){
        waitFor(ExpectedConditions.visibilityOf(loginBtn));
        loginBtn.click();
    }

    public String getErrorMessage(){
        waitFor(ExpectedConditions.visibilityOf(errorMessage));
        return errorMessage.getText();
    }

    public void enterUserName(String usrNme){
        waitFor(ExpectedConditions.visibilityOf(userName));
        userName.sendKeys(usrNme);
    }

    public void enterPassword(String pswd){
        waitFor(ExpectedConditions.visibilityOf(password));
        password.sendKeys(pswd);
    }

    public boolean isErrorDisplayed(){
         waitFor(ExpectedConditions.visibilityOf(errorMessage));
         return errorMessage.isDisplayed();
    }

    public void closeErrorMessage(){
        waitFor(ExpectedConditions.visibilityOf(closeErrorMessage));
        closeErrorMessage.click();
    }

    public boolean isErrorClosed(){
        return errorMessage.isVisible();
    }

}
