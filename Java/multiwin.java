import java.util.Iterator;
import java.util.Set;

public class   multiwin {
    public  static  void main(String[], args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup");
        driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[2]/p/a")).click();
        System.out.println(driver.getTitle());
        
        Set<String> ids = driver.getWindowshandles();
        Iterator<String> it = ids.iterator();
        
        String parentid = it.next();
        String childid = it.next();

        driver.switchTo().windows(childid);
        System.out.println(driver.getTitle());
    }
}