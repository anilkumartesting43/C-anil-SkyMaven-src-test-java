package EST_SeleniumTme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp2 {

	public static void main(String[] args) {
		// create driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		//create obj for interface
		WebDriver driver=new ChromeDriver();
		//load the website
		driver.get("https://www.google.com/");

	}

}
