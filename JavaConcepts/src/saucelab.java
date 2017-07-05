
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class saucelab {
			
		public void setup() throws MalformedURLException
		{
			DesiredCapabilities dc=DesiredCapabilities.firefox();
			dc.setCapability("version", "5");
			dc.setCapability("platform", "XP");
			WebDriver driver=new RemoteWebDriver(new URL("http://septa:d8e5e4ac-bfde-45c6-a0d5-fbde878fc7f4@ondemand.saucelabs.com:80/wd/hub"), dc);
		   driver.get("http://www.google.com");
		   System.out.println(driver.getTitle());
		
		}

	}


