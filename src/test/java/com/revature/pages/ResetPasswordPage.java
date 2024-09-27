package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPasswordPage extends Page {

    public WebDriver driver;

    public ResetPasswordPage(WebDriver driver){
        this.driver = driver;
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // token status text
    @FindBy(xpath = "//h1[text()]")
    public WebElement tokenStatusInfo;

    // informational text about further navigation through listed links
    @FindBy("//h5")
    public WebElement furtherNavigationInfo;

    // new password input field
    @FindBy("(//input)[2]")
    public WebElement newPasswordInputField;

    // reset password button
    @FindBy(xpath = "//button")
    public  WebElement resetPasswordButton;

    // link to return to login page
    @FindBy(xpath = "//a[contains(text(),'Return to Login')]")
    public WebElement returnToLoginLink;

    // link to send another reset email
    @FindBy("//a[contains(text(),'Send another link to your email here')]")
    public WebElement sendAnotherEmailLink;

    // sign up for a new account link
    @FindBy("(//a)[2]")
    public WebElement signUpLink;






}
