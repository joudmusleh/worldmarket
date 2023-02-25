import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OutdoorPageTest {
    BaseTest baseTest = new BaseTest();
    ChromeDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        driver = baseTest.setUp("https://www.worldmarket.com/category/outdoor.do");
    }
    @Test (priority = 2)
    public void verifyThatDisplayedShopAllOutdoorButtonOpensThePage() {
        WebElement newRugs = driver.findElement(By.xpath("//*[@id=\"leftNavContainer\"]/div/div/div/ul/li[1]/a"));
        newRugs.isDisplayed();}
    @Test (priority = 3)
    public void verifyThatClickingShopAllOutdoorButtonOpensThePage() {
        WebElement newRugs = driver.findElement(By.xpath("//*[@id=\"leftNavContainer\"]/div/div/div/ul/li[1]/a"));
        newRugs.click();}

    @Test(priority = 1)
    public void verifyThatJoinedButtonDisplayed() {
        WebElement joinButton = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/button"));
        joinButton.isDisplayed();
    }

    @AfterClass
    public void tearDown() {
        baseTest.tearDown();
    }
}