package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\architkumar\\workspace\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://10.0.1.86/tatoc/basic/grid/gate");
driver.findElement(By.className("greenbox")).click();
//driver.quit();
	}

}
