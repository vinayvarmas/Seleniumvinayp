package generic;

import org.openqa.selenium.WebDriver;

public class UtilityMethods {
	
	public static WebDriver driver;

	public String get_url() {
		String CurrentURL=driver.getCurrentUrl();
		return CurrentURL;
		
	}
}
