import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class node_hub {

	public static void main(String[] args) throws MalformedURLException {
		
		// TODO Auto-generated method stub
		WebDriver driver;
		
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		capabilities.setCapability(FirefoxDriver.BINARY, new File ("firefox exe path").getAbsolutePath());
		 driver=new RemoteWebDriver(new URL("path of node(ip adress path)"), capabilities);
		 
		 driver.get("http://google.com/");
		 System.out.println(driver.getTitle());

	}

}
