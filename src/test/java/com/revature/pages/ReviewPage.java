package com.revature.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ReviewPage extends Page {

    public WebDriver driver;

    public ReviewPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//button[contains(text(), 'Back to Products')]")
    public WebElement backToProductsButton;

    @FindBy(xpath="//img[@alt='product.name']")
    public WebElement productImage;

    @FindBy(xpath="//h4[contains(text(), 'Leave a Review')]/..")
    public WebElement leaveAReviewContainer;

    @FindBy(xpath="//h4[contains(text(), 'Leave a Review')]")
    public WebElement leaveAReviewHeaderText;

    @FindBy(xpath="//input[@id='rating']/..")
    public WebElement starReviewContainer; // contains all radio buttons for product star rating

    @FindBy(xpath = "//textarea[@id='outlined-multiline-flexible']")
    public WebElement reviewTextBox;

    @FindBy(xpath = "//button[contains(text(), 'Submit Review')]")
    public WebElement submitReviewButton;

    @FindBy(xpath="//div[@class='MuiGrid-root MuiGrid-container css-11lq3yg-MuiGrid-root']/div")
    public WebElement productOverviewDisplay;

    @FindBy(xpath="//div[@class='MuiGrid-root MuiGrid-container css-11lq3yg-MuiGrid-root']/div/h1")
    public WebElement productName;

    @FindBy(xpath="//div[@class='MuiGrid-root MuiGrid-container css-11lq3yg-MuiGrid-root']/div/span[@aria-label]")
    public WebElement productStarRating;

    @FindBy(xpath="//div[@class='MuiGrid-root MuiGrid-container css-11lq3yg-MuiGrid-root']/div/p")
    public WebElement productDescription;

    @FindBy(xpath = "//h4[contains(text(), 'Product Reviews')]/..")
    public WebElement productReviewsContainer;

    @FindBy(xpath="//h4[contains(text(), 'Product Reviews')]")
    public WebElement productReviewsContainerHeader;

    @FindBy(xpath = "//h4[contains(text(), 'Product Reviews')]/../div/span")
    public WebElement sortReviewsByStarsElem;

    @FindBy(xpath = "//h4[contains(text(), 'Product Reviews')]/../div/div")
    public List<WebElement> reviewsContainers;

    // Only one visible to each user, because only one review per user
    @FindBy(xpath = "//h4[contains(text(), 'Product Reviews')]/..//button[contains(text(), 'Delete')]")
    public List<WebElement> reviewDeleteButton;

    //do we want a map to associate these details to the other elements in the review form?
    @FindBy(xpath = "//h4[contains(text(), 'Product Reviews')]/../div/div/div/p[1]")
    public List<WebElement> reviewsAllReviewerNames;

    @FindBy(xpath = "//h4[contains(text(), 'Product Reviews')]/../div/div/div/p[2]/span")
    public List<WebElement> reviewsAllStarRatings;

    @FindBy(xpath = "//h4[contains(text(), 'Product Reviews')]/../div/div/div/p[3]")
    public List<WebElement> reviewsAllTexts;
    //

}
