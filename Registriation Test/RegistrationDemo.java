package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationDemo {
	static WebDriver driver; 
	
	public static void launch() throws Throwable{
		System.setProperty("webdriver.chrome.driver","E:\\testing\\1. webdrivers\\chrome\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();	
		//driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public static void openWebSite() throws Throwable{
		driver.get("http://demoqa.com/");
		Thread.sleep(2000);
		
	}
	public static void accestitle(){
		String s=driver.findElement(By.xpath(".//*[@id='nav_menu-6']/div[1]/h3")).getText();
		String text="Registration";
		if(s.equals(text)==true){
			System.out.println("title test is pass");
		}
		else {
			System.out.println("title test is fail");
		}
	}
		public static void registration() throws Throwable{
			
			driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("name_3_firstname")).sendKeys("avinash");
			driver.findElement(By.id("name_3_lastname")).sendKeys("Oguri");
			driver.findElement(By.xpath(".//*[@id='pie_register']/li[2]/div/div/input[1]")).click();
			driver.findElement(By.xpath(".//*[@id='pie_register']/li[3]/div/div/input[2]")).click();
			new Select(driver.findElement(By.xpath(".//*[@id='dropdown_7']"))).selectByIndex(2);
			new Select(driver.findElement(By.xpath(".//*[@id='mm_date_8']"))).selectByIndex(3);
			new Select(driver.findElement(By.xpath(".//*[@id='dd_date_8']"))).selectByIndex(3);
			new Select(driver.findElement(By.xpath(".//*[@id='yy_date_8']"))).selectByIndex(2);
			driver.findElement(By.id("phone_9")).sendKeys("8985156465");
			driver.findElement(By.id("username")).sendKeys("avinash0");
			driver.findElement(By.id("email_1")).sendKeys("avinashoguri86@gmail.com");
			driver.findElement(By.id("description")).sendKeys("hi this is avinash");
			driver.findElement(By.id("password_2")).sendKeys("avinash86");
			driver.findElement(By.id("confirm_password_password_2")).sendKeys("avinash86");
			
			driver.findElement(By.xpath(".//*[@id='pie_register']/li[14]/div/input")).click();
			Thread.sleep(2000);
			
			String result=driver.findElement(By.xpath(".//*[@id='post-49']/div/p")).getText();
			String act="Thank you for your registration";
			if(result.equals(act)==true){
				System.out.println("test pass");
			}
			else{
				System.out.println("test fail");
			}
			driver.close();
			
		}
	

	public static void main(String[] args) throws Throwable {
		launch();
		openWebSite();
		accestitle();
		registration();
		

	}
}



















