package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {

		public static WebDriver driver;
		public String homeURL = "https://bonigarcia.dev/selenium-webdriver-java/web-form.html";
		
		public void openApplication() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(homeURL);
			driver.manage().window().maximize();
			
		}
}
		
		