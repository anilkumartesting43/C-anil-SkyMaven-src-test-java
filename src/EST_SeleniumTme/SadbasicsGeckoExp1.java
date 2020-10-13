package EST_SeleniumTme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SadbasicsGeckoExp1 {

	public static void main(String[] args) {
		//create driver path
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ANIL CH\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//create object for webdriver interface
		WebDriver driver=new FirefoxDriver();

	}

}
