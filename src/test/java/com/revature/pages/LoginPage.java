package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Page {
    public WebDriver driver;

    public LoginPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // email address input field
    @FindBy(xpath = "(//input)[2]")
    public WebElement emailField;

    // password input field
    @FindBy(xpath = "(//input)[3]")
    public WebElement passwordField;

    // sign in button
    @FindBy(xpath = "//button")
    public WebElement signInButton;

    // sign up link
    @FindBy(xpath = "//a[contains(text(), 'Sign Up')]")
    public WebElement signUpLink;

    // reset password link
    @FindBy(xpath = "//a[text() = 'Reset your password']")
    public WebElement resetPasswordLink;
}
