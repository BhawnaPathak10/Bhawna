package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex_Actions_MoveToElement {

	@Test
	public void test() throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.yatra.com/");
		driver.manage().timeouts().pageLoadTimeout(45,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(10000);
		//WebElement csmenu=driver.findElement(By.xpath("//[@id='customerSupportNav']"));
		 WebElement csmenu = driver.findElement(By.linkText("Customer Support"));
		Actions actns=new Actions(driver);
		WebElement submenu=driver.findElement(By.xpath(".//*[@id='customerSupportNav']/div/ul/li[5]/a"));
		actns.moveToElement(csmenu).moveToElement(submenu).click().build().perform();
		driver.quit();
	}

}
