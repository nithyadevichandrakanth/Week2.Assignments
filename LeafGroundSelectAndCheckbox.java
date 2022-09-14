package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundSelectAndCheckbox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement autTool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select DD= new Select(autTool);
		DD.selectByIndex(3);
		WebElement firstSelectedOption = DD.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[1]")).click();
		driver.findElement(By.xpath("//li[text()='Germany']")).click();
		driver.get("https://leafground.com/checkbox.xhtml");
		WebElement clickBasic = driver.findElement(By.xpath("//span[text()='Basic']//preceding-sibling::div[1]"));
		driver.executeScript("arguments[0].click()", clickBasic);
		WebElement clickAjax = driver.findElement(By.xpath("//span[text()='Ajax']//preceding-sibling::div[1]"));
		driver.executeScript("arguments[0].click()", clickAjax);
		driver.close();

	}

}
