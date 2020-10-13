package EST_SeleniumTme;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp5 {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc =new Scanner(System.in);
		System.out.println("Mr.pawan please enter your working time");
		int work_time=sc.nextInt();
		for(int i=0;i<work_time;i++)
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.travolook.in/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			driver.close();
		}
		System.out.println("mr.pawan your working time is over");
	}

}
