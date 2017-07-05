import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class formmethods {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.makemytrip.com/");

		System.out.println(" Before clikcing on Multi city Radio button");
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='hp-widget__return']")).isDisplayed());

		System.out.println(driver.findElement(By.xpath("//*[@id='hp-widget__return']")).isDisplayed());

		driver.findElement(By.xpath("//*[@for='switch__input_3']")).click();

		driver.findElement(By.xpath("//*[@for='switch__input_3']")).isEnabled();//whether control is enabled or disabled on UI

		System.out.println(" After clikcing on Multi city Radio button");
		 
		//Assert.assertFalse(driver.findElement(By.xpath("//*[@id='hp-widget__return']")).isDisplayed());
		
		System.out.println(driver.findElement(By.xpath("//*[@id='hp-widget__return']")).isDisplayed());
		
		
		System.out.println(driver.findElements(By.xpath("//*[@for='switch__inpu']")).size());
		

		  
		int count=driver.findElements(By.xpath("//*[@for='switch__inpu']")).size();
	
		
		if(count==0)
		{
			System.out.println("verified");
		}

	

		
		Thread.sleep(3000L);
		

		//System.out.println(driver.findElement(By.xpath(".//*[@id='responsive_bottom']/div[2]/div[1]/div/div/h3")).getText());

		


	}

}
