package EST_SeleniumTme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.army.mil/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//fetch sourcecod
		String page_src=driver.getPageSource();
		System.out.println("the src is:"+page_src);
		Thread.sleep(2000);
		driver.close();

	}

}
