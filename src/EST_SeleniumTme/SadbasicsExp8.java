package EST_SeleniumTme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp8 {
	 WebDriver driver;
 public void LaunchAUT() throws InterruptedException
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://www.salesforce.com/in/");
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
 }
 public void getTitle()
 {
	 String tie=driver.getTitle();
	 System.out.println("the title is:"+tie);
	 
 }
 public void Currenturl() 
 {
	 String cur_url=driver.getCurrentUrl();
	 System.out.println("the url is:"+cur_url);
}
 public void GetpageSrc()
 {
	 String page_src=driver.getPageSource();
	 System.out.println("the page page src is:"+page_src);
 }
 

	public static void main(String[] args) throws InterruptedException {
		SadbasicsExp8 obj=new SadbasicsExp8();
		obj.LaunchAUT();
		obj.getTitle();
		obj.Currenturl();
		//obj.GetpageSrc();
		

	}

}
