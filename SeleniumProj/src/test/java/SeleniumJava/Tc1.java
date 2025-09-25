package SeleniumJava;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tc1 {		
	public WebDriver driver;
             
	        @BeforeMethod
	        public void launchDriver() {
	        	 driver = new ChromeDriver();
	        }

		    @Test
		    public void test1(){
		        driver.navigate().to("https://www.google.com/");
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		        System.out.println(driver.getTitle());
		    }

		    @AfterMethod
		    public void closeBrowser(){
		        driver.close();
		    }
	}

