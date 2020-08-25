
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setup {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "/Users/trillons/Proj_Training/chromedriver");
		WebDriver driver = new ChromeDriver();
		//Test Page
		driver.get("https://google.com");
		
	}
	
}
		
