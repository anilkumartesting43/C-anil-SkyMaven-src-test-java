
package EST_SeleniumTme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp15 {
	WebDriver driver;
public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
}
public void Navigate() throws InterruptedException
{
	driver.navigate().to("https://www.youtube.com/");
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
}
public void CloseAUT()
{
	driver.close();
}
	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp15 obj=new SadbasicsExp15();
		obj.LaunchAUT();
		obj.Navigate();
		obj.CloseAUT();

	}

}
