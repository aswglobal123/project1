package ecommerce.batch8testng;
	
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.support.FindBy;
		import org.openqa.selenium.support.PageFactory;

		public class HomeAmazon {
			// this is  under testng fram work   we  create 2  project  one amazon home  2nd registration 
			 //  we need to compile   testng class  helping with  home amazon .java class  we need to call from 
			// home amazon class  then function is complete.
			public static WebDriver driver;
			
			@FindBy(xpath="(//*[contains(text(),'Best Sellers')])[1]") WebElement BestSellers;
			@FindBy(xpath="(//*[contains(text(),'Amazon Basics')])[1]") WebElement AmazonBasics;

	
			
			public HomeAmazon(WebDriver driver) {
				HomeAmazon.driver=driver;
				PageFactory.initElements(driver, this);
				}

			
			public void bestSellersClick() {
				BestSellers.click();
			}
			
			public void amazonBasicsClick() {
				AmazonBasics.click();
			}	

			}
	
		

	


