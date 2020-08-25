import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	public class Feby {
		
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "/Users/trillons/Proj_Training/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.spicejet.com/");
			
			//Click and Select 
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
			driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
			
			/*driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXTaction")).click();*/
			driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@text='Ajmer (KQH)'][contains(text(),'Ajmer (KQH)')]")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[5]/a[1]")).click();		

		}
}


