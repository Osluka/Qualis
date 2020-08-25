import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class as1 {


		public static void main(String[] args) {
			//Driver setup
			System.setProperty("webdriver.chrome.driver", "/Users/trillons/Proj_Training/chromedriver");
			WebDriver driver = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			//Input string
			String text = "Manne";
			driver.findElement(By.id("name")).sendKeys(text);
			
			//Locate and click Alert box
			driver.findElement(By.id("alertbtn")).click();
				System.out.println(driver.switchTo().alert().getText());
			
				//Click alert and retrive text
			driver.switchTo().alert().accept();
			driver.findElement(By.id("confirmbtn")).click();
				System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().dismiss();

		}

	}

