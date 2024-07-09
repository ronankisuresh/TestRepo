package gitFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setting the driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
		
		//Creating WebDriver instance
		WebDriver driver = new ChromeDriver();
		
		//Navigate to web page
		driver.get("https://demoqa.com/login");
		
		//Maximizing window
		driver.manage().window().maximize();
		driver.quit();
	}

}
