import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class prac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.gecko.driver ","geckodriver");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/recaptcha/api2/demo");
		
	}
		
		public void switchtoframe(WebDriver driver)
		{
			int framecount=driver.findElements(By.tagName("iframe")).size();
			
			for(int i=0;i <framecount;i++)
			{
				driver.switchTo().frame(i);
				
			}
		}
		
}
