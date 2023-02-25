import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JoinWithEmail {

    BaseTest baseTest = new BaseTest();
    ChromeDriver driver;

    @BeforeClass
    public void setUp() {
        driver = baseTest.setUp("https://www.worldmarket.com/account/login.do");
    }


    @Test(priority = 1)
    public void verifyJoinIsDisplayed() {
        WebElement joinButton = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/form/div[2]/div/button"));
        Assert.assertTrue(joinButton.isDisplayed());
    }


    @Test(priority = 2)
    public void verifyClickingJoinButtonsSaveUser() {
        WebElement firstName = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/form/div[1]/fieldset[1]/div[1]/div/div/input"));
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(firstName));
        WebElement lastName = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/form/div[1]/fieldset[1]/div[2]/div/div/input"));
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(lastName));
        WebElement email = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/form/div[1]/fieldset[2]/div[1]/div/div/input"));
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(email));
        WebElement password = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/form/div[1]/fieldset[2]/div[2]/div/div/input[1]"));
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(password));
        WebElement mobile = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/form/div[1]/fieldset[2]/div[3]/div/div/input"));
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(mobile));
        WebElement month = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/form/div[1]/fieldset[3]/div/div[1]/div/div/select"));
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(month));
        WebElement day = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/form/div[1]/fieldset[3]/div/div[2]/div/div/select"));
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(day));
        WebElement zipCode = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/form/div[1]/fieldset[4]/div[4]/div/div/input"));
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(zipCode));
        firstName.sendKeys(testData.firstName);
        lastName.sendKeys(testData.lastName);
        mobile.sendKeys(testData.mobile);
        day.sendKeys(testData.day);
        month.sendKeys(testData.month);
        email.sendKeys(testData.gmail);
        password.sendKeys(testData.password);
        zipCode.sendKeys(testData.zipCode);
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/form/div[2]/div/button")).click();

    }

    public void tearDown() {
        baseTest.tearDown();
    }


}