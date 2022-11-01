package Pages;

import lib.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImdbPage extends BaseTest {

    @FindBy(xpath = "//a[contains(.,'Release date')]/../div/ul/li/a")
    private WebElement getDate;

    @FindBy(xpath = "//span[contains(.,'Country of origin')]/../div/ul/li/a")
    private WebElement getCountry;

    public ImdbPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;

    }

    public String getDate() {
        String getDateInfo=getDate.getText();
        return getDateInfo;
    }

    public String getCountry(){
        String getCountryInfo=getCountry.getText();
        return getCountryInfo;
    }
}
