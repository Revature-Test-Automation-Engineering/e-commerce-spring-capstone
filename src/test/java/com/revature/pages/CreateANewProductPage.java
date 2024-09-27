package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateANewProductPage extends Page
{
    private WebDriver driver;

    public CreateANewProductPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div/div[2]/div/div/div[1]/button")
    public WebElement returnToProduct;

    @FindBy (xpath = "/html/body/div/div[2]/div/div/div[2]/div/input")
    public WebElement productName;

    @FindBy(xpath = "/html/body/div/div[2]/div/div/div[3]/div/input")
    public WebElement productDescription;

    @FindBy(xpath = "/html/body/div/div[2]/div/div/div[4]/div/input")
    public WebElement imageUrl;

    @FindBy(xpath = "/html/body/div/div[2]/div/div/div[5]/div/input")
    public WebElement productPrice;

    @FindBy (xpath = "/html/body/div/div[2]/div/div/button")
    public WebElement createProduct;
}
