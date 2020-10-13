package EST_SeleniumTme;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadbasicsExp6 {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("hi Manisha please enter your faviorite URL");
		String out_url=sc.nextLine();
		System.out.println("hi shwetha what is your exp output");
		String exp_out=sc.nextLine();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL CH\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get(out_url);
        driver.manage().window().maximize();
        String act_title=driver.getTitle();
        System.out.println("the title name is:"+act_title);
        if(act_title.equalsIgnoreCase(exp_out))
        {
        	System.out.println("title test is pass");
        }
        else
        {
        	System.out.println("title test is faild");
        	Thread.sleep(2000);
        }
        driver.close();

	}

}
