import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.os.WindowsUtils;


public class miscelaneous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//WindowsUtils.findTaskKill() To kill the process of excel or notepad etc
		//WindowsUtils.killByName("notepad.exe");
		    System.setProperty("webdriver.gecko.driver ","geckodriver");
			
			WebDriver driver=new FirefoxDriver();
			driver.get("http://www.google.com/");
			
			/* driver.manage mainly used for 3 below functions
			driver.manage().deleteAllCookies();
			driver.manage().timeouts();
			driver.manage().window().fullscreen();*/
			
			/* for accepting untrusted certificates in firefox and for chrome n IE we dont get as 
			 * execute .exe file
			FirefoxProfile prof=new FirefoxProfile();
			prof.setAcceptUntrustedCertificates(false);
			Set<E>Driver driver=new FirefoxDriver(prof);*/
			
			Set<Cookie>abc= driver.manage().getCookies();
			System.out.println(abc.size());
			driver.manage().deleteAllCookies();
			Set<Cookie>abc1= driver.manage().getCookies();
			System.out.println(abc1.size());
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("/Users/bunty/Documents/workspace/screenshot.png"));
			
			// //input[contains(@name,'firstname')]
			// //input[start-with(@name,'firstname')]
			// //input[ends-with(@name,'firstname')]
			
			
			

	}

}
