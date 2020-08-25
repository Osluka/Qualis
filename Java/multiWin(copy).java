import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multinWin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/trillons/Proj_Training/chromedriver");
		WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup");
        driver.findElement(By.xpath("//*[@id=\"view_container\"]/form/div[2]/div/div[2]/div[2]/div")).click();
        System.out.println(driver.getTitle());
        
        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        
		String parentid = it.next();
		
		driver.switchTo().window(childid);
        
		String childid = it.next();
		System.out.println(driver.getTitle());
	}

}
