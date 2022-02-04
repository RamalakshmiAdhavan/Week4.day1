package week4.day1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundframs {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.switchTo().frame(0); 
		WebElement click = driver.findElement(By.id("Click"));
		//Screenshot of the product
		File exactlocation = click.getScreenshotAs(OutputType.FILE);
		File endpoint = new File("./images/SortByLowToHigh.png");
		FileUtils.copyFile(exactlocation, endpoint); 
		click.click();
		
		driver.switchTo().defaultContent();
		//Looped/nested frame
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click1")).click();
		driver.switchTo().defaultContent();
		
		//Total number of frames
		List<WebElement> tags = driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of Frames : " +tags.size());
		

		
		
	}
	}


