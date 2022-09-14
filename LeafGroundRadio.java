package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundRadio {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> defaultRadio = driver.findElements(By.xpath("//table[@id='j_idt87:console2']//tr//td//label"));
		for (int i = 0; i < defaultRadio.size(); i++) {
			String text = defaultRadio.get(i).getText();
			// System.out.println(text);
			// String SelectedButtonStatus = "(Unselected)";
			List<WebElement> RadioButton = driver.findElements(By.xpath("//table[@id='j_idt87:console2']//tr//td//div"));
			boolean selected = RadioButton.get(i).isSelected();
			if (selected) {
				// SelectedButtonStatus = "(Selected)";
				
			}
			System.out.println("selected button is: " + text);
		}

	}

}
