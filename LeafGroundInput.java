package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundInput {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']")).sendKeys("Nithya");
		driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys("India");
		boolean enabled = driver.findElement(By.xpath("//input[@disabled='disabled']")).isEnabled();
		System.out.println(enabled);
		driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
		WebElement emailAndTab = driver.findElement(By.xpath("//input[@placeholder='Your email and tab']"));
		emailAndTab.sendKeys("123@gmail.com");
		emailAndTab.sendKeys(Keys.TAB, "test");
		

	}

}
