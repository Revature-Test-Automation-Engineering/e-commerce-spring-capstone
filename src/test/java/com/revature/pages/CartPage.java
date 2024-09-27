package com.revature.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage extends Page {

    private WebDriver driver;

    public CartPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //BUTTONS
    @FindBy(xpath="//*[@id='root']/div[2]/div/div[1]/button[contains(text(),'CONTINUE SHOPPING')]")
    public WebElement continueShoppingButton;

    @FindBy(xpath="//*[@id='root']/div[2]/div/div[2]/div[2]/button[contains(text(),'CHECKOUT NOW')]")
    public WebElement checkoutButton;

    //CART ELEMENTS - DYNAMIC BASED UPON HOW IT GETS POPULATED
    @FindBy(xpath="//body/div[@id='root']/div[2]/div[1]/div[2]/div[1]")
    public WebElement cartBody;

    //       -cartBody-                                            -row-       -2nd button/Garbage button-
    //xpath: body/div[@id='root']/div[2]/div[1]/div[2]/div[1]-----/div[1]/-----div[2]/div[2]/button[2]

    // BUTTON TO INCREASE AMOUNT OF EACH ITEM IN THE CART
    public WebElement increaseCartItemAmountButtonByRowNumber(int rowNumber) {
        List<WebElement> rows = cartBody.findElements(By.xpath("//div"));
        return rows.get(rowNumber).findElement(By.xpath("//button[text() = '+']"));
    }

    // BUTTON TO DECREASE AMOUNT OF EACH ITEM IN THE CART
    public WebElement decreaseCartItemAmountButtonByRowNumber(int rowNumber) {
        List<WebElement> rows = cartBody.findElements(By.xpath("//div"));
        return rows.get(rowNumber).findElement(By.xpath("//button[text() = '-']"));
    }

    // BUTTON TO DELETE ITEM IN CART - (APPEARS AS GARBAGE EMOJI IN BUTTON)
    public WebElement deleteCartItemButtonByRowNumber(int rowNumber) {
        List<WebElement> rows = cartBody.findElements(By.xpath("//div"));
        return rows.get(rowNumber).findElement(By.xpath("//div[2]/div[2]/button[2]"));
    }

    // GET PRICE OF ITEM IN THE CART
    public WebElement CartItemPriceByRowNumber(int rowNumber) {
        List<WebElement> rows = cartBody.findElements(By.xpath("//div"));
        return rows.get(rowNumber).findElement(By.xpath("//div[contains(text(),'$')]"));
    }

    // GIVES A LIST OF WEB ELEMENTS THAT INCLUDES ALL ROWS IN THE CART
    public List<WebElement> getCartRows() {
        return cartBody.findElements(By.xpath("//body/div[@id='root']/div[2]/div[1]/div[2]/div[1]/div"));
    }

    // more or less replaces the functionality of productNameByRowNumber in the block comment below.
    @FindBy(xpath="/html/body/div/div[2]/div/div[2]/div[1]/div/div[1]/div/span[1]")
    public List<WebElement> productNames;

    // more or less replaces the functionality of productIDByRowNumber in the block comment below.
    @FindBy(xpath="/html/body/div/div[2]/div/div[2]/div[1]/div/div[1]/div/span[2]")
    public List<WebElement> productIds;

    // The block comment below contains methods that unfortunately will probably not work.
    /*
    // GIVES THE ELEMENT CONTAINING THE PRODUCT NAME BASED UPON ROW NUMBER
    public WebElement productNameByRowNumber(int rowNumber) {
        List<WebElement> rows = cartBody.findElements(By.xpath("//body/div[@id='root']/div[2]/div[1]/div[2]/div[1]/div"));
        return rows.get(rowNumber).findElement(By.xpath("//div[1]/div[1]/span[1]"));
    }

    // GIVES THE ELEMENT CONTAINING THE PRODUCT ID # BASED UPON ROW NUMBER
    public WebElement productIDByRowNumber(int rowNumber) {
        List<WebElement> rows = cartBody.findElements(By.xpath("//body/div[@id='root']/div[2]/div[1]/div[2]/div[1]/div"));
        return rows.get(rowNumber).findElement(By.xpath("//div[1]/div[1]/span[2]"));
    }

    // GIVES THE ELEMENT THAT CONTAINS THE PRODUCT IMAGE
    public WebElement productImageByRowNumber(int rowNumber) {
        List<WebElement> rows = cartBody.findElements(By.xpath("//body/div[@id='root']/div[2]/div[1]/div[2]/div[1]/div"));
        return rows.get(rowNumber).findElement(By.tagName("img"));
    }
     */

    // GIVES THE NUMBER OF ITEMS IN THE CART/ NUMBER OF ROWS, RETURNS INTEGER
    public int amountOfCartRows() {
        List<WebElement> rows = cartBody.findElements(By.xpath("//body/div[@id='root']/div[2]/div[1]/div[2]/div[1]/div"));
        int rowNumber = rows.size();
        return rowNumber;
    }

    // ORDER SUMMARY BOX/DIV
    // THERE ARE 4 INFORMATION BOXES CONTAINING PRICE INFORMATION
    // THESE ARE THE 4 CORRESPONDING WEB ELEMENTS IN DESCENDING ORDER

    @FindBy(xpath="//body/div[@id='root']/div[2]/div[1]/div[2]/div[2]/div[1]/span[2]")
    public WebElement subtotalAmount;

    @FindBy(xpath="//body/div[@id='root']/div[2]/div[1]/div[2]/div[2]/div[2]/span[2]")
    public WebElement shippingAmount;

    @FindBy(xpath="//body/div[@id='root']/div[2]/div[1]/div[2]/div[2]/div[3]/span[2]")
    public WebElement shippingDiscountAmount;

    @FindBy(xpath="//body/div[@id='root']/div[2]/div[1]/div[2]/div[2]/div[4]/span[2]")
    public WebElement totalPriceAmount;
}
