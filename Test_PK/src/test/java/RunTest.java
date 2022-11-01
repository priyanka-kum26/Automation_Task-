import Pages.ImdbPage;
import Pages.WikiPage;
import lib.BaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RunTest extends BaseTest {

    String dateIMDB;
    String countryIMDB;
    String dateWiki;
    String countryWiki;

    @Test
    public void TC_01() {

        ImdbPage im = new ImdbPage(driver);
        driver.get("https://www.imdb.com/title/tt9389998/");
        dateIMDB = im.getDate();
        countryIMDB = im.getCountry();

        System.out.println(dateIMDB);
        System.out.println(countryIMDB);
    }

    @Test
    public void TC_02() {

        WikiPage wiki = new WikiPage(driver);
        driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
        dateWiki = wiki.getDate();
        countryWiki = wiki.getCountry();

        System.out.println(dateWiki);
        System.out.println(countryWiki);
    }

    @Test
    public void TC_03() {

        // Using Soft Assert to compare Date and Country
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(dateIMDB, dateWiki, "Date Assertion Failed");
        soft.assertEquals(countryIMDB, countryWiki, "Country Assertion Failed");
        soft.assertAll();
    }
}
