package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		//Click the open home page button
		driver.findElement(By.xpath("//button[text()='Open Home Page']")).click();
		Set<String> window1 = driver.getWindowHandles();
		List<String> load1 = new ArrayList<String>(window1);
		driver.switchTo().window(load1.get(1));
		driver.findElement(By.xpath("//h5[text()='Window']")).click();
		driver.close();
		driver.switchTo().window(load1.get(0));
		// open multiple windows button
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		Set<String> window2 = driver.getWindowHandles();
		List<String> load2 = new ArrayList<String>(window2);
		driver.switchTo().window(load2.get(1));
		driver.close();
		driver.switchTo().window(load2.get(0));
		//Click the wait for 5 seconds button
		driver.findElement(By.xpath("//button[text()='Wait for 15 seconds']")).click();
		Thread.sleep(5000);
		Set<String> window3 = driver.getWindowHandles();
		List<String> load3 = new ArrayList<String>(window3);
		for(String links : load3 ) {
			System.out.println(links);
		}
		int size = load3.size();
		System.out.println("Size of the list is : "+size);
		driver.switchTo().window(load3.get(3));
		driver.close();
		driver.switchTo().window(load3.get(2));
		driver.close();
		driver.switchTo().window(load3.get(1));
		driver.close();
		driver.switchTo().window(load3.get(0));
		driver.close();
		
	}
	}


