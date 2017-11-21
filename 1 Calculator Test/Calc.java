package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calc {

	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\testing\\1. webdrivers\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver obj=new ChromeDriver();

		obj.get("http://www.way2automation.com/angularjs-protractor/calc/");
		Thread.sleep(2000);
		

		for(int i=0;i<=4;i++){
		double a[]={15,2,0,50,5};
			//String x=Float.toString(a[i]);
			
			obj.findElement(By.xpath("html/body/div[3]/div/form/input[1]")).sendKeys("10");
			obj.findElement(By.xpath("html/body/div[3]/div/form/input[2]")).sendKeys("5");

			new Select(obj.findElement(By.xpath("html/body/div[3]/div/form/select"))).selectByIndex(i);
			obj.findElement(By.xpath(".//*[@id='gobutton']")).click();
			Thread.sleep(5000);
			String s=obj.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
			double value = Double.parseDouble(s);
			System.out.println(a[i]);
			System.out.println(s);
			if(a[i]==value){
				System.out.println(value+"="+s+"/n test pass");
			}
			else{
				System.out.println(" test fail");
			}
		}
		obj.close();


	}

}