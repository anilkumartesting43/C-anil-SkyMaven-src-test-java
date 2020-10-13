package EST_SeleniumTme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeAUT {

	public static void main(String[] args) {
		//this is driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		//create object for webdriver interface
		WebDriver driver=new ChromeDriver();

	}

}
