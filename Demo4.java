package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\architkumar\\workspace\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://10.0.1.86/tatoc/basic/windows");
String parentHandle = driver.getWindowHandle();
driver.findElement(By.linkText("Launch Popup Window")).click(); 
//driver.get("http://10.0.1.86/tatoc/basic/windows/popup");
for(String Popup : driver.getWindowHandles())
driver.switchTo().window(Popup);
driver.findElement(By.id("name")).sendKeys("archit");

driver.findElement(By.id("submit")).click();
driver.switchTo().window(parentHandle);
driver.findElement(By.linkText("Proceed")).click();
}
}