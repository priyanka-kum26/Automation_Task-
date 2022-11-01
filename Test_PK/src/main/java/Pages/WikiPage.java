package Pages;

import lib.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiPage extends BaseTest {

    @FindBy(xpath = "//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[12]/th/div/../../td/div/ul/li")
    private WebElement getDate;

    @FindBy(xpath = "//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[14]/td")
    private WebElement getCountry;

    public WikiPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public String getDate() {
        String getDateInfo = getDate.getText();
        return getDateInfo;
    }

    public String getCountry() {
        String getCountryInfo = getCountry.getText();
        return getCountryInfo;
    }


}
