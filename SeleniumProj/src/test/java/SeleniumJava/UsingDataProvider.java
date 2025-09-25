package SeleniumJava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsingDataProvider {
	public WebDriver driver;
	
	@BeforeMethod
    public void launchDriver() {
    	 driver = new ChromeDriver();
    	 driver.manage().window().maximize();
         driver.navigate().to("https://practicetestautomation.com/practice-test-login");
    }
    
    @Test(dataProvider = "create", dataProviderClass=DataProviderSet.class)
    public void login(String username, String password) {
    	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    	driver.findElement(By.xpath("//button[@id='submit']")).click();
    }
    
    @Test    
    public void testTitle() {
         Assert.assertEquals(driver.getTitle(), "Logged In Successfully | Practice Test Automation");
    }
    
    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
}
