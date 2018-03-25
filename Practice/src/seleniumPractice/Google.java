package seleniumPractice;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Google {

	@Test
	public void test() {
		
		//WebDriver driver=new FirefoxDriver();chromedriver.exeC:\Users\User\Downloads\Software
		System.setProperty("webdriver.chrome.driver","C:/Users/User/Downloads/Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("lst-ib")).sendKeys(new String []{"Gwalior"});
	    driver.findElement(By.name("btnK")).submit();
	    driver.quit();
	   
	}

}
