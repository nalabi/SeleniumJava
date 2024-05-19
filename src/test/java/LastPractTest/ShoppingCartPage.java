package LastPractTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;

public class ShoppingCartPage {
    WebDriver driver;

    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath ="(//input[contains(@type,'button')])[5]")
    private WebElement AddtoCart;

    @FindBy(xpath = "//span[@class='cart-label'][contains(.,'Shopping cart')]")
    private WebElement vwShoppingCart;

    @FindBy(xpath = "//select[@class='country-input valid']")
    private WebElement CountryDrop;

    @FindBy(xpath = "//select[contains(@class,'state-input valid')]")
    private WebElement StateDrop;

    @FindBy(xpath = "//input[contains(@name,'termsofservice')]")
    private WebElement radioTerms;

    @FindBy(xpath = "//button[@type='submit'][contains(.,'Checkout')]")
    private WebElement btnCheckOut;
    public void LinkLogin(){
        AddtoCart.click();
    }



    public void SelectCountry(String country){
        Select select = new Select(CountryDrop);
        select.selectByVisibleText(country);

    }

    public String getSelectedCountry(){
        Select select = new Select(CountryDrop);
        return select.getFirstSelectedOption().getText();
    }

    public void SelectState(String state){
        Select select = new Select(StateDrop);
    }
    public String getSelectedState(){
        Select select = new Select(StateDrop);
        return select.getFirstSelectedOption().getText();
    }

    public void SelectTerms(String terms){

    }

   public void open(){
        driver.get("https://demowebshop.tricentis.com/");
   }

}
