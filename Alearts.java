package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Alearts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='AlertBox']")).click();
		driver.findElement(By.xpath("//button[text()='ConfirmBox']")).click();
		driver.findElement(By.xpath("//button[text()='PromptBox']")).click();
		Thread.sleep(3000);
		
		//Accept the alert
		Alert alert = driver.switchTo().alert();
		// getting alert text 
		String text = alert.getText();
		System.out.println (text);
		alert.accept();
		alert.sendKeys("ABC");
		alert.dismiss();

	}

}
