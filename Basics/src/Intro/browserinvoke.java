package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.safari.SafariDriver;

public class browserinvoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver ","geckodriver");
		//System.setProperty("webdriver.chrome.driver","chromedriver");
		//WebDriver driver=new FirefoxDriver();
        //driver.get("https://www.google.com");
		//https://github.com/mozilla/geckodriver/releases/
		
		//WebDriver driver=new ChromeDriver();
        //driver.get("https://www.google.com");
        
      WebDriver driver=new FirefoxDriver();
        //driver.get("https://www.facebook.com");
       // driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input")).click();
        
        driver.get("http://www.qaclickacademy.com/interview.php");
        System.out.println(driver.getCurrentUrl());
        driver.getTitle();
        driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();
        

        driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();

        System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));

	}

}
