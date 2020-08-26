import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/manne/training-workspace/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://makemytrip.com");
        driver.findElement(By.className("userNameIcon whiteText makeFlex perfectCenter latoBlack appendRight10")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]")).click();
        //driver.findElement(By.id("fromCity")).click();
        
        driver.close();
       

	}

}

