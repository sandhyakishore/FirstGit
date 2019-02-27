package MavenPac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {

	public WebDriver driver;

	@Test

	public void mavenProject() {

		System.setProperty("webdriver.chrome.driver", "H:\\Softwares\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ghmc.gov.in/");
		System.out.println("going to navigate url");
		System.out.println("This is fourth commit");
		System.out.println("This is fifth commit");

	}

}
