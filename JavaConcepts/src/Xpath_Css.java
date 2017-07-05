import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Css {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","chromedriver");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://login.salesforce.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getPageSource());
    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("lalitha@gmail.com");
    driver.findElement(By.cssSelector("input[id='password']")).sendKeys("password");
    driver.findElement(By.xpath("//input[@value='Log In']")).click();
    System.out.println(driver.getCurrentUrl());
	
    
    
}
}
