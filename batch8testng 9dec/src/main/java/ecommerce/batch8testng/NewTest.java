package ecommerce.batch8testng;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

@Test/// using facebook  then  amazon then  now  
public class NewTest {
  public void f() {
  }
  @BeforeTest
  public void beforeMethod() throws InterruptedException{
	System.out.println("this is before test");  
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asif\\eclipse-workspace\\projectsalinum\\Drivers2\\chromedriver.exe");
        driver=new ChromeDriver();

         driver.get("https;//www.amazon.com/");
         driver.manage().window.maximize();
  
  @AfterTest
  public void afterTest() {
  }

}
