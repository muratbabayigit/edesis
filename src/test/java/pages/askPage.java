package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class askPage {

    public askPage(){PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy (xpath = "//*[@name='userNameOrEmailAddress']")
    public WebElement user;

    @FindBy (xpath = "//*[@name='password']")
    public WebElement pass;

     @FindBy (xpath = "//*[@alt='user']")
    public WebElement userpic;

    @FindBy (xpath = "(//*[@class='menu-icon'])[13]")
    public WebElement logout;


    @FindBy (xpath = "(//*[@type='submit'])")
    public WebElement giris;

    @FindBy (xpath = "((//*[@class='flaticon-line-graph'])[1])")
    public WebElement sinavs;

    @FindBy (xpath = "((//*[@class='flaticon-list-3'])[2])")
    public WebElement odevs;






}
