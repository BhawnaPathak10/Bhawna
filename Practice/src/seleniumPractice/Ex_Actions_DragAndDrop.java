package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex_Actions_DragAndDrop {

	@Test
	public void test() {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().timeouts().pageLoadTimeout(45,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement drag=driver.findElement(By.xpath(".//*[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath(".//*[@id='droppable']"));
		Actions actns=new Actions(driver);
	    actns.dragAndDrop(drag, drop).perform();
	    driver.close();
	}

}
