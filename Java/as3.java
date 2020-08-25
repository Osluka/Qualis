import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class As3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/trillons/Proj_Training/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
		driver.findElement(By.cssSelector("a[href*='loadAjax']")).click();
		WebDriverWait Od = new WebDriverWait(driver,20);
		Od.until(ExpectedConditions.elementToBeClickable(By.id("results")));
			System.out.println(driver.findElement(By.id("results")).getText());
	
		}
}


