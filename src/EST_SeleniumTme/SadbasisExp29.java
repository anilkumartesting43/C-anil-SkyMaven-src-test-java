package EST_SeleniumTme;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasisExp29 {
	WebDriver driver;
	JavascriptExecutor jse;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void Scroll() throws InterruptedException
	{
		jse = (JavascriptExecutor)driver;
		// scroll to bottom
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		// scroll to top
		jse.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(2000);
		
	}
	public void RefreSh() throws InterruptedException
	{
		//driver.navigate().refresh();
		jse=(JavascriptExecutor)driver;
		jse.executeScript("history.go(0);");
		Thread.sleep(2000);
		
		
	}
	public void GetTitle() throws InterruptedException
	{
		//driver.gettitle();
		//using jse get title
		String str=jse.executeScript("return document.title;").toString();
		System.out.println("the title is:"+str);
		Thread.sleep(2000);
	}
	public void getInnerText()
	{
		String str1=jse.executeScript("return document.documentElement.innerText;").toString();
		System.out.println("the innertext:"+str1);
		
	}
	public void CloseAUT()
	{
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		SadbasisExp29 obj=new SadbasisExp29();
		obj.LaunchAUT();
		obj.Scroll();
		obj.RefreSh();
		obj.GetTitle();
		obj.getInnerText();
		//obj.CloseAUT();
	}

}
