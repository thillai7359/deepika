package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.systeminfo.SystemInfo;

public class launch {
	public static void main(String[] args) {
		
		//set the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\workspace\\Seleniumday1\\driver\\chromedriver.exe");
		//launching the browser
		WebDriver driver = new ChromeDriver();
		
		//go to url
		driver.get("https://www.facebook.com/");
		
		//to get title
		String title=driver.getTitle();
		System.out.println(title);
		
		//to get the url
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//to maxximize the webpage
		driver.manage().window().maximize();
		
		WebElement textusername = driver.findElement(By.id("email"));
		textusername.sendKeys("thillai");
		WebElement textpassword = driver.findElement(By.id("pass"));
		textpassword.sendKeys("1234");
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
	
		//to close the bowser
		driver.close();
		}
}
