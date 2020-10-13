package EST_SeleniumTme;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SadbasicsExp12 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Manisha please enter your favorite browser");
		String browser=sc.nextLine();
		if(browser.equals("C"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("F"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\ANIL CH\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		else
		{
			System.out.println("Browser not found");
		}
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void CloseAUT()
	{
		driver.close();
	}

	
	

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp12 obj =new SadbasicsExp12();
		obj.LaunchAUT();
		obj.CloseAUT();
		
	}

}
