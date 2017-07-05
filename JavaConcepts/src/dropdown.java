import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://book2.spicejet.com/");
		Select s=new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")));
		s.selectByValue("2");
		s.selectByIndex(5);
	    s.selectByVisibleText("3");
	    driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).click();;
	    driver.findElement(By.xpath("//a[@value='IXA']")).click();
	    
	    driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT']")).click();;
	    
	   driver.findElement(By.xpath("(//*[@value='CJB'])[2]")).click();
	   
	   System.out.println(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen")).isSelected());
	   
	   driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen")).click();
	   
	  System.out.println(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen")).isSelected());
	   /*
	    * WebDriver driver=new ChromeDriver();

driver.get("http://spicejet.com/");

/*

driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

driver.findElement(By.xpath("//a[@value='GOI']")).click();

*/

// If you want to accees any methods in class ,create object for that class and access methods

//using object.method

/*Select dropdown=new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));

dropdown.selectByIndex(4);

dropdown.selectByVisibleText("9 Adults");

dropdown.selectByValue("8");

System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();

System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();

System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

*/

	    
	    	    
	   }

}
