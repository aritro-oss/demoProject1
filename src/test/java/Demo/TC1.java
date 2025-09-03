package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 {
    public WebDriver driver;

    @BeforeMethod
    public void launchDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void test1(){
        driver.navigate().to("https://www.google.com/");
        System.out.println(driver.getTitle());
    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
}
