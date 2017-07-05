import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","chromedriver");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://accounts.google.com/SignUp");
			driver.findElement(By.xpath("//a[@href='https://support.google.com/accounts/answer/1733224?hl=en']")).click();
	        System.out.println(driver.getTitle());//always fetches main window title
	       Set<String>ids=driver.getWindowHandles();
	        Iterator<String> it=ids.iterator();
	        String parentid=it.next();
	        String childid=it.next();
	        driver.switchTo().window(childid);
	        System.out.println(driver.getTitle());
	        driver.switchTo().window(parentid);
	        System.out.println(driver.getTitle());
	        
	}

}
