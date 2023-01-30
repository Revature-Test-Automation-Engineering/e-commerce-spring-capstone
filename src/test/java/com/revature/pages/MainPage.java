package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends Page
{
    private WebDriver driver;

    public MainPage(WebDriver driver)
    {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div/div[2]/div/div/input")
    public WebElement searchBar;

    @FindBy(xpath = "/html/body/div/div[2]/div/button[2]/svg")
    public WebElement clearButton;
}
