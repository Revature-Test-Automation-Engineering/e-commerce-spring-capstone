package com.revature.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage extends Page{

    public WebDriver driver;
    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//h1[contains(text(),'Send a link to your email')]")
    public WebElement sendLinkBodyText;

    @FindBy(xpath="//form")
    public WebElement resetPasswordForm;

    @FindBy(xpath="//input[@id='email']")
    public WebElement emailInput;

    @FindBy(xpath="//button[contains(text(),'Reset Password') and @type='submit']")
    public WebElement resetPasswordButton;

    @FindBy(xpath="//a[@href='login' and contains(text(), 'Return to Login')]")
    public WebElement returnToLoginLink;



}
