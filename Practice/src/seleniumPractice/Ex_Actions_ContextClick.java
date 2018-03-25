package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Ex_Actions_ContextClick {
	@Test
	public void test(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().timeouts().pageLoadTimeout(45,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions actns=new Actions(driver);
		actns.contextClick(driver.findElement(By.xpath(".//*[@id='_eEe']/a[1]")))
		.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build()
		.perform();
System.out.println("hi");
driver.close();
	}

}