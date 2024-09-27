package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminIndividualProduct extends Page {

    public WebDriver driver;

    public AdminIndividualProduct(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(), 'Back to Products')]")
    public WebElement backToProductsButton;

    @FindBy(xpath = "//h3")
    public WebElement productName;

    @FindBy(xpath = "//h3/following-sibling::img")
    public WebElement productImage;

    @FindBy(xpath = "//h4")
    public WebElement productPrice;

    @FindBy(xpath = "//h5")
    public WebElement productDescription;

    //not sure if ID's stay constant when wrapped by colons, eg: ':idName:'. Located by labels instead
    @FindBy(xpath = "//label[contains(text(), 'Product Name')]/following-sibling::div/input")
    public WebElement productNameInput;

    @FindBy(xpath = "//label[contains(text(), 'Product Image URL')]/following-sibling::div/input")
    public WebElement productImageURLInput;

    @FindBy(xpath = "//label[contains(text(), 'Product Description')]/following-sibling::div/input")
    public WebElement productDescriptionInput;

    @FindBy(xpath = "//label[contains(text(), 'Product Price')]/following-sibling::div/input")
    public WebElement productPriceInput;
    //

    @FindBy(xpath = "//button[contains(text(), 'Update')]")
    public WebElement updateButton;

    @FindBy(xpath = "//button[contains(text(), 'Delete')]")
    public WebElement deleteButton;

}
