import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		
		//SetUp
				System.setProperty("webdriver.chrome.driver", "/Users/trillons/Proj_Training/chromedriver");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
		        driver.get("https://amazon.com");
		        
		        Actions acn = new Actions(driver);
		        WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));

		        acn.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("R8 Spider");
		        //Move specific elemnts 
		        acn.moveToElement(move).contextClick().build().perform();
		        
	}

}
