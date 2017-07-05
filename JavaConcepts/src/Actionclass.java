import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.gecko.driver ","geckodriver");
			
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
			Actions a=new Actions(driver);
			//WebElement move=driver.findElement(By.id("nav-link-accountList"));
			
			a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
			a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
			a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();
	}

}
