import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class searchTestpage {
    BaseTest baseTest= new BaseTest();
    ChromeDriver driver;
    @BeforeClass
    public void setUp(){
        driver=  baseTest.setUp("https://www.worldmarket.com/");
    }



       @Test(priority = 1)
       public void verifysearchBox() {

           WebElement searchBox;
           driver.findElement(By.id("navsearchbox")).sendKeys("chair");
           //driver.findElement(By.xpath("//*[@id=\"itemtable_container\"]/div[2]/div/div/div/div[1]/div[1]/div[2]/div[1]/div[1]/a")).click();
           driver.findElement(By.xpath("//*[@id=\"addToBasket458602\"]")).click();
           driver.findElement(By.xpath("//*[@id=\"ml-bpMainHeading\"]/h1")).equals("Cart (2 Items)");

           //Select quantity = new Select(driver.findElement(By.id("qty_458602")));
           //driver.findElement(By.id("increase-quantity"));
       //    driver.get("//https.ggg.com");

       }


    @AfterClass
    public void tearDown(){
        baseTest.tearDown();
    }
}
