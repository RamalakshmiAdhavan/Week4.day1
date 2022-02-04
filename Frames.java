package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();

	driver.switchTo().frame("frameResult");

	driver.findElement(By.xpath("//button[text()='Try it']")).click();

	
	Alert set = driver.switchTo().alert();
	set.sendKeys("RRR");
	set.accept();
}
	}


