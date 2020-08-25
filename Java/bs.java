import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bs {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/trillons/Proj_Training/chromedriver");
		WebDriver driver = new ChromeDriver();				
		
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetrrot"};
	
		//Implicit wait
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			Thread.sleep(3000);
		
		//Invoke utility
		addItems(driver,itemsNeeded);
		
		bs base = new bs();
		base.addItems(driver,itemsNeeded);
		
	}


	//
	public static void addItems(WebDriver driver, String[] itemNeeded)
	{
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		int j = 0;
		
		for(int i = 0; i < products.size(); i++)
		{
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			List itemNeededList = Arrays.asList(itemNeeded);
	
		}
	}

}
