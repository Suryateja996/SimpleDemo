package SimpleProject.SimpleProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void setup() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("hhtps://www.google.com/");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		Thread.sleep(5000);

		driver.findElement(
		By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("suryatejagajavelly@gmail.com");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("suryua123456");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);

		driver.close();
	}
}
