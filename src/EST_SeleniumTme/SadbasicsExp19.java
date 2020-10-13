
package EST_SeleniumTme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SadbasicsExp19 {
	WebDriver driver;
	String browsername1="chrome";
	public void Executemultibrow() throws InterruptedException
	{
		SadbasicsExp19 obj=new SadbasicsExp19();
		if(obj.browsername1.equals("Firefox"))
		{
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\ANIL CH\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		 driver=new FirefoxDriver();
		 System.out.println("this is browser 1");
		}
		else if(obj.browsername1.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			 driver=new ChromeDriver();
			 System.out.println("this is browser 2");
		}
		else
		{
			System.out.println("the browser is not found");
		}
		driver.get("https://www.army.mod.uk/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void closeAUT()
	{
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp19 obj1=new SadbasicsExp19();
		obj1.Executemultibrow();
		obj1.closeAUT();

	}

}
