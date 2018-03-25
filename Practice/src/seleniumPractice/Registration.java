package seleniumPractice;

import java.sql.Driver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class Registration {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String baseUrl = "http://newtours.demoaut.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testRegistration() throws Exception {
		selenium.open("/");
		selenium.type("name=userName", "aa");
		selenium.type("name=password", "aa");
		selenium.click("name=login");
		selenium.waitForPageToLoad("60000");
		selenium.click("name=tripType value=oneway");
		selenium.select("name=passCount", "2");
		selenium.select("name=fromPort", "London");
		selenium.select("name=fromMonth", "February");
		selenium.select("name=fromDay", "2");
		selenium.select("name=toPort", "Paris");
		selenium.select("name=toMonth", "February");
		selenium.select("name=toDay", "5");
		selenium.click("name=servClass value=First");
		selenium.click("name=findFlights");
		selenium.waitForPageToLoad("60000");
		selenium.click("xpath=(//input[@name='outFlight'])[3]");
		selenium.click("xpath=(//input[@name='inFlight'])[2]");
		selenium.click("name=reserveFlights");
		selenium.waitForPageToLoad("60000");
		selenium.type("name=passFirst0", "vini");
		selenium.type("name=passLast0", "modi");
		selenium.type("name=passFirst1", "vinita");
		selenium.type("name=passLast1", "modi");
		selenium.type("name=creditnumber", "123455689");
		selenium.click("name=buyFlights");
		selenium.waitForPageToLoad("60000");
		selenium.click("//td[3]/a/img");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
