package EST_SeleniumTme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SadbasicsExp18 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
    String[]browser= {"chrome","Firefox"};
    for(String browsers:browser)
    {
    	if(browsers.equals("chrome"))
    	{
    		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
    		driver=new ChromeDriver();
    		
    	}
    	else if(browsers.equals("Firefox"))
    	{
    		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ANIL CH\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
    		driver=new FirefoxDriver();
    	
    	}
    	else
    	{
    		System.out.println("the browser not found");
    	}
    	driver.get("https://www.amazon.in/");
    	Thread.sleep(2000);
    	driver.manage().window().maximize();
    	driver.close();
    }
	}
    public void CloseAUT()
    {
    	driver.close();
    }

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp18 obj =new SadbasicsExp18();
		obj.LaunchAUT();
		//obj.CloseAUT();

	}

}
