package SVN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Its been changed");
		System.setProperty("Webdriver.chrome.driver", "F:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com");
	}

}
