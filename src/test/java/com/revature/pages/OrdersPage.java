package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrdersPage extends Page{

    public WebDriver driver;
    public OrdersPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath="//h2[contains(text(), 'Orders')]")
    public WebElement pageHeader;

    //use helper function "returnOrderInfo" to get back a map of values within each order (takes one order element from list as input)
    @FindBy(xpath = "//div[@class='MuiGrid-root']")
    public List<WebElement> allOrdersOnPage;

    @FindBy(xpath = "//ul")
    public List<WebElement> ordersPageButtons;

    @FindBy(xpath="//ul//button[@aria-label='Go to previous page']")
    public WebElement previousOrdersPageButton;

    @FindBy(xpath="//ul//button[@aria-label='Go to next page']")
    public WebElement nextOrdersPageButton;


}
