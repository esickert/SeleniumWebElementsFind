package seleniumTestPackage;

//import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindElementByClassName extends MoreSeleniumTestClass {
	
	WebDriver tracy;
	
	FindElementByClassName(WebDriver x)	{
		tracy = x;
	}
	
	public void findByClassName()	{
		
		int num = 3;
		
//		WebDriver tracy = new FirefoxDriver();
		tracy.get("http://www.bing.com");
		System.out.println(dateTime() + " Successfully opened Bing"); 
		toSleep(num);
		WebElement searchBox = tracy.findElement(By.className("b_searchbox")); //this checks by class (className) for search in bing
//		WebElement searchBox = tracy.findElement(By.name("q")); //this is a test to check by name!!
		toSleep(num);
		searchBox.sendKeys("microsoft");
		toSleep(num);
		searchBox.submit();
		toSleep(num);
		tracy.navigate().to("http://www.yahoo.com");
		toSleep(num);
		tracy.close();
		System.out.println(dateTime() + " Successfully found web element via By.className() in Bing 1234");
	}
}
