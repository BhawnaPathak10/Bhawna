package seleniumPractice;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration1 {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://newtours.demoaut.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testRegistration1() throws Exception {
		driver.get(baseUrl + "/");
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys("aa");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("aa");
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.name("tripType value=oneway")).click();    incorrect code
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		new Select(driver.findElement(By.name("passCount")))
				.selectByVisibleText("2");
		new Select(driver.findElement(By.name("fromPort")))
				.selectByVisibleText("London");
		new Select(driver.findElement(By.name("fromMonth")))
				.selectByVisibleText("February");
		new Select(driver.findElement(By.name("fromDay")))
				.selectByVisibleText("2");
		new Select(driver.findElement(By.name("toPort")))
				.selectByVisibleText("Paris");
		new Select(driver.findElement(By.name("toMonth")))
				.selectByVisibleText("February");
		new Select(driver.findElement(By.name("toDay")))
				.selectByVisibleText("5");
	//	driver.findElement(By.name("servClass value=First")).click();    incorrect code
		driver.findElement(By.xpath("//input[@value='First']")).click();
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.xpath("(//input[@name='outFlight'])[3]")).click();
		driver.findElement(By.xpath("(//input[@name='inFlight'])[2]")).click();
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("passFirst0")).clear();
		driver.findElement(By.name("passFirst0")).sendKeys("vini");
		driver.findElement(By.name("passLast0")).clear();
		driver.findElement(By.name("passLast0")).sendKeys("modi");
		driver.findElement(By.name("passFirst1")).clear();
		driver.findElement(By.name("passFirst1")).sendKeys("vinita");
		driver.findElement(By.name("passLast1")).clear();
		driver.findElement(By.name("passLast1")).sendKeys("modi");
		driver.findElement(By.name("creditnumber")).clear();
		driver.findElement(By.name("creditnumber")).sendKeys("123455689");
		driver.findElement(By.name("buyFlights")).click();
		driver.findElement(By.xpath("//td[3]/a/img")).click();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
