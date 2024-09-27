package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


// this class contains all of the elements on the navigation bar
public class Page {
	private WebDriver driver;

	public Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// congo logo button that takes you to the MainPage
	@FindBy(xpath = "//img")
	public WebElement logoNavButton;

	// dark/light theme selector on nav bar
	@FindBy(xpath = "//div[@class='sc-gsnTZi fiUFVv']//div[2]//input");
	public WebElement themeSelector;

	// edit product button on nav bar
	@FindBy(xpath = "//strong[contains(text(),'EDIT PRODUCTS')]")
	public WebElement editProductsNavButton;

	// profile button on nav bar
	@FindBy(xpath = "//strong[contains(text(),'PROFILE')]")
	public WebElement profileNavButton;

	// orders button on nav bar
	@FindBy(xpath = "//strong[contains(text(),'ORDERS')]")
	public WebElement ordersNavButton;

	// logout button on nav bar
	@FindBy(xpath = "//strong[contains(text(),'LOGOUT')]")
	public WebElement logoutNavButton;

	// cart button on nav bar
	@FindBy(xpath = "(//div[@class='sc-gsnTZi fiUFVv']//div)[last()]")
	public WebElement cartNavButton;

	public Page() {
	}
}
