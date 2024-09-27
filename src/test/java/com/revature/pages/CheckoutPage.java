package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckoutPage extends Page
{
	private WebDriver driver;

	public CheckoutPage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button")
	public WebElement nextButton;

	@FindBy(xpath = "//input[@name='firstName']")
	public WebElement firstNameInput;

	@FindBy(xpath = "//input[@name='lastName']")
	public WebElement lastNameInput;

	@FindBy(xpath = "//input[@name='address1']")
	public WebElement addressLine1Input;

	@FindBy(xpath = "//input[@name='address2']")
	public WebElement addressLine2Input;

	@FindBy(xpath = "//input[@name='city']")
	public WebElement cityInput;

	@FindBy(xpath = "//input[@name='state']")
	public WebElement stateInput;

	@FindBy(xpath = "//input[@name='zip']")
	public WebElement zipInput;

	@FindBy(xpath = "//input[@name='country']")
	public WebElement countryInput;

	@FindBy(xpath = "//input[@name=':r11:']")
	public List<WebElement> cardRadioButtons;

	@FindBy(xpath = "//li//div")
	public List<WebElement> summaryItems;

	@FindBy(xpath = "//li[not(@role)][last()]//h6")
	public WebElement total;

	@FindBy(xpath = "//button[2]")
	public WebElement placeOrderButton;

	@FindBy(xpath = "//button[1]")
	public WebElement backButton;

	@FindBy(xpath = "//h6")
	public WebElement confirmationBody;
}
