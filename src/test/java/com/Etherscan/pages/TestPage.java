
package com.Etherscan.pages;

import com.Etherscan.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract class TestPage {

    public TestPage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(name = "ctl00$ContentPlaceHolder1$txtUserName")
    public WebElement UserNameBox;

    @FindBy(name = "ctl00$ContentPlaceHolder1$txtEmail")
    public WebElement EmailBox;

    @FindBy(xpath = "//div/input[@name='ctl00$ContentPlaceHolder1$txtPassword']")
    public WebElement passwordBox;

    @FindBy(xpath = "//div/input[@name='ctl00$ContentPlaceHolder1$txtPassword2']")
    public WebElement confirmPasswordBox;

    @FindBy(name = "ctl00$ContentPlaceHolder1$MyCheckBox")
    public WebElement ConditionsCheckBox;

    @FindBy(name = "ctl00$ContentPlaceHolder1$SubscribeNewsletter")
    public WebElement SubscribeCheckBox;


    @FindBy(id = "ContentPlaceHolder1_btnRegister")
    public WebElement CreateButton;

    @FindBy(id = "ContentPlaceHolder1_txtUserName-error")
    public WebElement UserNameError;

    @FindBy(id = "ContentPlaceHolder1_txtEmail-error")
    public WebElement EmailError;

    @FindBy(id = "passstrength")
    public WebElement passwordError;

    @FindBy(id = "ContentPlaceHolder1_txtPassword-error")
    public WebElement passwwordError2;

    @FindBy(id = "ContentPlaceHolder1_txtPassword2-error")
    public WebElement confirmPasswordError;

    @FindBy(id = "ctl00$ContentPlaceHolder1$MyCheckBox-error")
    public WebElement conditionsCheckBoxError;

    @FindBy(xpath = "//main/div/form/div[4]")
    public WebElement congMessage;


    /**
     * @return page name: Register a New Account
     */
    public String PageHeadName() {

        return Driver.get().getTitle();
    }

    /**
     * click() method does not work in this case
     * so that ı use JVS executor and it works.
     * ı have to create this method for click the checkBox
     */
    public void clickCheckbox(WebElement checkBox) {

        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].click();", checkBox);

    }
}

