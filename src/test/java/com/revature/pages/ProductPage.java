package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage extends Page
{
	private WebDriver driver;

	public ProductPage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/div/div[2]/div[3]/div[1]/div[1]/button")
	public WebElement removeItemButton;

	@FindBy(xpath = "/html/body/div/div[2]/div[3]/div[1]/div[2]/p")
	public WebElement itemQuantity;

	@FindBy(xpath = "/html/body/div/div[2]/div[3]/div[1]/div[3]/button")
	public WebElement addItemButton;

	@FindBy(xpath = "/html/body/div/div[2]/div[3]/div[1]/div[5]/h5")
	public WebElement price;

	@FindBy(xpath = "/html/body/div/div[2]/div[3]/div[2]/div[1]/div/textarea[1]")
	public WebElement reviewInput;

	@FindBy(xpath = "/html/body/div/div[2]/div[3]/div[2]/div[2]/button")
	public WebElement submitReviewButton;

	@FindBy(xpath = "/html/body/div/div[2]/div[3]/div[3]/div/div/div/div/p[3]")
	public List<WebElement> reviewBodies;

	@FindBy(xpath = "/html/body/div/div[2]/div[3]/div[3]/div/div/div/div/div/button")
	public List<WebElement> deleteReviewButtons;

	// 0 for 1 star, 4 for 5 stars
	@FindBy(xpath = "/html/body/div/div[2]/div[3]/div[2]/span/label")
	public List<WebElement> reviewStars;

}
