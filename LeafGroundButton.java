package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String oldTitle = driver.getTitle();
		driver.findElement(By.id("j_idt88:j_idt90")).click();
		String newTitle = driver.getTitle();
		if (oldTitle.equals(newTitle)) {
			System.out.println("Changes not happened");

		} else
			System.out.println("Changes happened");
		driver.navigate().back();
		boolean enabled = driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
		System.out.println(enabled);
		Point location = driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
		System.out.println(location.getX());
		System.out.println(location.getY());
		String color = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background");
		System.out.println(color);
		Dimension size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());

	}

}
