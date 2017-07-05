import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class captcha {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	        System.setProperty("webdriver.chrome.driver","chromedriver");
		
		    WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/recaptcha/api2/demo");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.switchTo().frame(0);
			driver.findElement(By.id("recaptcha-anchor")).click();
			driver.switchTo().defaultContent();
			Thread.sleep(1000);
			driver.switchTo().frame(driver.findElement(By.xpath("//*[@title='recaptcha challenge']")));
			Thread.sleep(2000);
			WebElement ele=driver.findElement(By.cssSelector("button[id='recaptcha-verify-button']"));
			ele.click();
			if(!ele.getText().equals("Verify")&&ele.isDisplayed())
			{
			Thread.sleep(2000);
			ele.click();
			Thread.sleep(2000);
			ele=driver.findElement(By.cssSelector("button[id='recaptcha-verify-button']"));
			ele.click();
			}

			}

	}
 /*package basics;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriverException;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Day extends Day1{

public static void main(String[] args) {

// TODO Auto-generated method stub

WebDriver driver=new FirefoxDriver();

WebDriverWait wd=new WebDriverWait(driver,7);

driver.get("https://fantasycricket.dream11.com/IN/");

driver.manage().window().maximize();

int m=gotoframe(driver,By.xpath(".//*[@id='recaptcha-anchor']"));

driver.switchTo().frame(m);

driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();

driver.switchTo().defaultContent();

wd.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("I1_1441700500937")));

int j=gotoframe(driver,By.xpath(".//*[@id='recaptcha-verify-button']"));

if(j!=-1)

{

driver.switchTo().frame(j);

//WebDriverWait wd=new WebDriverWait(driver,5);

//wd.until(ExpectedConditions.(By.xpath(".//*[@id='recaptcha-verify-button']")));

driver.findElement(By.xpath(".//*[@id='recaptcha-verify-button']")).click();

}

else{

System.out.println("ops");

}

}

}







// Code



package basics;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriverException;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Day1 {

public static int gotoframe(WebDriver driver1,By by)

{

driver1.switchTo().defaultContent();

int i;

int num = -1;

int a=driver1.findElements(By.tagName("iframe")).size();

for(i=0;i<a;i++)

{

driver1.switchTo().defaultContent();

driver1.switchTo().frame(i);

int b=driver1.findElements(by).size();

if(b>0)

{

num=i;

break;

}

}

driver1.switchTo().defaultContent();

return num;

}}

*/
