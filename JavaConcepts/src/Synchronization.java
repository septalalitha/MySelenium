import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver ","geckodriver");
			
			WebDriver driver=new FirefoxDriver();
			/*driver.get("https://www.goibibo.com/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//i[@class='icon-hotels db blue ico28 lh1-2 padT2 padB3']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Enter City name, Area name or Hotel name']")).sendKeys("Delhi");
			driver.findElement(By.xpath("//li[@id='react-autosuggest-1-suggestion--1']")).click();
            //driver.findElement(By.xpath("//button[@class='width100 button orange xlarge']")).click();
            driver.findElement(By.id("hm_srch_srp")).click();
           // driver.findElement(By.id("hm_srch_srp")).sendKeys(Keys.ENTER); to press enter keys*/
            
           
            // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
            driver.findElement(By.id("H-destination")).sendKeys("nyc");
            driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
            driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);

            WebDriverWait d=new WebDriverWait(driver,20);
            d.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='resultsContainer']/section/article[1]")));
            //Thread.sleep(5000L);

            driver.findElement(By.xpath("//div[@id='resultsContainer']/section/article[1]")).click();
	}

}