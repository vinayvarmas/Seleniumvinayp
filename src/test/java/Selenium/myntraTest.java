package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class myntraTest {
	
	@Test
	public void amazon() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
	}

}
