package Automation;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\architkumar\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		
	       Actions builder = new Actions(driver);	       
	       driver.get("http://10.0.1.86/tatoc/basic/drag");
	       WebElement from = driver.findElement(By.id("dragbox"));
	       WebElement to = driver.findElement(By.id("dropbox"));
	 	   Action dragAndDrop = builder.clickAndHold(from).moveToElement(to).release(to).build();
	 	   dragAndDrop.perform();
	 	   driver.findElement(By.linkText("Proceed")).click();
	}

}
