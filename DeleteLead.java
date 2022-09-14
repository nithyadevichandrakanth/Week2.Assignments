package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		WebElement click = driver.findElement(By.className("decorativeSubmit"));
		driver.executeScript("arguments[0].click()", click);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("98");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		WebElement firstLead = driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]"));
		String ID = firstLead.getText();
		System.out.println(ID);
		firstLead.click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		WebElement leadID = driver.findElement(By.xpath("//input[@name='id']"));
		leadID.sendKeys(ID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement finalMessage = driver.findElement(By.xpath("//div[text()='No records to display']"));
		String text = finalMessage.getText();
		System.out.println(text);
		if(text.equals("No records to display")) {
			System.out.println("correctvalue");
		}
		else
			System.out.println("wrong value");
		driver.close();
		
		
		
		
		
		
		 	

	}

}
