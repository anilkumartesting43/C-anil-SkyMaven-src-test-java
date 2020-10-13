package EST_SeleniumTme;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SadbasicsExp21 {
	WebDriver driver;
	Actions actobj;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//handle the pop-box using Actions method
		driver.manage().window().maximize();
		actobj=new Actions(driver);
		//press escape key from keybord
		actobj.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(2000);
	}
	public void GettitleTc01()
	{
		String ftitle=driver.getTitle();
		System.out.println("the title is:"+ftitle);
		String Eftitle="Welcome to Flipkart";
		if(ftitle.equalsIgnoreCase(Eftitle))
		{
			System.out.println("the test case is pass");
		}
		else
		{
		System.out.println("the test case is faild");	
		}
	}
		public void SearchTc02() throws InterruptedException
		{
			//sending some data using traditional way
			//driver.findElement(By.name("q")).sendKeys("Iphone");
			//i need to send some data using actions
			WebElement we=driver.findElement(By.name("q"));
			//using actions 
			actobj.sendKeys(we, "iphone").perform();
			Thread.sleep(2000);
			//WebElement we1=driver.findElement(By.xpath(" //button[@class='vh79eN']//*[local-name()='svg']"));
		    actobj.sendKeys(Keys.ENTER).perform();
			//driver.findElement(By.xpath(" //button[@class='vh79eN']//*[local-name()='svg']")).click();
			String act_title=driver.getTitle();
			if(act_title.contains("iphone"))
			{
				System.out.println("the test case is pass");
			}
			else
			{
				System.out.println("the test case is faild");
			}
				
			}
		public void CloseAUT()
		{
			driver.close();
		}
	
	

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp21 obj =new SadbasicsExp21();
		obj.LaunchAUT();
		obj.GettitleTc01();
		obj.SearchTc02();
		//obj.CloseAUT();

	}

}
