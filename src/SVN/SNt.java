package SVN;

public class SNt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Its been changed");
		System.setProperty("Webdriver.chrome.driver", "F:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com");
	}
