/**
 * 
 */
package seleniumPractice;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author User
 *
 */
public class Ex_Actions_DragAndDrop_Trial {

	@Test
	public void test() {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		driver.manage().window().maximize();
		WebElement drag=driver.findElement(By.xpath(".//*[@id='block-1']"));
		WebElement drop=driver.findElement(By.xpath(".//*[@id='block-2']"));
		Actions actns=new Actions(driver);
		actns.dragAndDrop(drag, drop).perform();
		driver.quit();
	}

}
