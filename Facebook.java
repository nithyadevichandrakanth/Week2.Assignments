package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement create = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		driver.executeScript("arguments[0].click()", create);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nithya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Devi");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9898989898");
		driver.findElement(By.id("password_step_input")).sendKeys("test");
		WebElement dd1 = driver.findElement(By.id("day"));
		Select drop1= new Select(dd1);
		drop1.selectByValue("6");
		WebElement dd2 = driver.findElement(By.id("month"));
		Select drop2= new Select(dd2);
		drop2.selectByValue("3");
		WebElement dd3 = driver.findElement(By.id("year"));
		Select drop3= new Select(dd3);
		drop3.selectByValue("2017");
		driver.findElement(By.xpath("(//span[@data-name='gender_wrapper']//input)[1]")).click();
		
		

	}

}
