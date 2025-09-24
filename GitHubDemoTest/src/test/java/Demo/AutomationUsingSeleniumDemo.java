package Demo;

public class AutomationUsingSeleniumDemo {

	public static void main(String[] args) {
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

}
