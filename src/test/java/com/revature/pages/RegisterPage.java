package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Page {
    public WebDriver driver;

    public RegisterPage(WebDriver driver){
        this.driver = driver;
        super(driver);
        PageFactory.initElements(driver, this);
    }


    // first name input field
    @FindBy(xpath = "//input[@name = 'firstName']");
    public WebElement firstNameField;

    // last name input field
    @FindBy(xpath = "//input[@name = 'lastName']");
    public WebElement lastNameField;

    // email input field
    @FindBy(xpath = "//input[@name = 'email']");
    public WebElement emailField;

    // password input field
    @FindBy(xpath = "//input[@name = 'password']");
    public WebElement passwordField;

    // sign up button
    @FindBy(xpath = "//button");
    public WebElement signUpButton;

    // link to sign in if you already have an account
    @FindBy(xpath = "//a");
    public WebElement signInLink;










}
