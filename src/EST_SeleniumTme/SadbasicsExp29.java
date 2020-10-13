package EST_SeleniumTme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp29 {
	WebDriver driver;

	public  void launchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_disabled");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	public void inputData() throws InterruptedException
	{
		driver.switchTo().frame("iframeResult");
		WebElement we1 = driver.findElement(By.xpath("//input[@name='fname']"));
		// verify the element is enabled or not
		if(we1.isEnabled())
		{
			we1.clear();

			we1.sendKeys("Mind Q");
		}
		else
		{
			System.out.println("Element is disabled! Cannot enter data");
		}
	
		WebElement we2 = driver.findElement(By.xpath("//input[@name='lname']"));
		// validate lastname field is enabled or not
		if(we2.isEnabled())
		{
			we2.clear(); 
			we2.sendKeys("Hyderabad");
		}
		else
		{
			System.out.println("Element is disabled! Cannot enter data");
		}
		
		
		Thread.sleep(3000);
	}
	public void closeAUT()
	{
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException 
	{
		
		SadbasicsExp29 obj = new SadbasicsExp29();
		obj.launchAUT();
		obj.inputData();
		//obj.closeAUT();
	}

}



