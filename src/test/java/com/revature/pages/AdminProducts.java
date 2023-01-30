package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AdminProducts extends Page {

    public WebDriver driver;

    public  AdminProducts(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h4[contains(text(), 'Edit Products')]")
    public WebElement bodyHeaderText;

    @FindBy(xpath = "//button[contains(text(), 'Create New Product')]")
    public WebElement createNewProductButton;

    //relates to helperfunctions class 'returnProductButtonValues' function which takes a single button and returns a map of all the values inside it
    @FindBy(xpath="//div[@class='sc-gXmSlM jUbOKS']//img/..")
    public List<WebElement> allProductButtons;

}
