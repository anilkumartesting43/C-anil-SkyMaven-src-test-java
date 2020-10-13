package EST_SeleniumTme;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp4 {
	WebDriver driver;
	public void launchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		 driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
        //wait for some time
		Thread.sleep(2000);
	}
	public void GetTitle()
	{
		//fetch the title
		String act_out=driver.getTitle();
		//expected output
		String exp_out="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	    System.out.println("the title is:"+act_out);
		if(act_out.equalsIgnoreCase(exp_out))
		{
			System.out.println("title test is pass");
		}
		else
		{
			System.out.println("title test is faild");
		}
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp4 obj =new SadbasicsExp4();
		obj.launchAUT();
		obj.GetTitle();

	}

}
