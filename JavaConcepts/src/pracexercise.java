import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pracexercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.ebay.com/");
		//count of the links in the webpage
		System.out.println(driver.findElements(By.tagName("a")).size());
		//links in the footor section of the webpage
		WebElement footer= driver.findElement(By.id("glbfooter"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		//links present in the column
	    WebElement col=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
	    System.out.println(col.findElements(By.tagName("a")).size());
	    String Beforeclicking = null;
	    String Afterclicking;
	    int count=col.findElements(By.tagName("a")).size();
	for(int i=0; i<count; i++)
	{
	
		if(col.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
		{
			Beforeclicking = driver.getTitle();
		
			col.findElements(By.tagName("a")).get(i).click();
			break;
			}
	}
	Afterclicking =driver.getTitle();
	if(Beforeclicking!=Afterclicking)
	{
		if(driver.getPageSource().contains("sitemap"))
	
			System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
	      

	}

}
