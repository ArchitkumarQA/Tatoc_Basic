package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\architkumar\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://10.0.1.86/tatoc/basic/frame/dungeon");
		driver.switchTo().frame("main");
		String original = driver.findElement(By.id("answer")).getAttribute("class");
		Boolean condi = true;
		while(condi)
		{
		
			driver.switchTo().frame("child");
			String newAnswer = driver.findElement(By.id("answer")).getAttribute("class");
			driver.switchTo().parentFrame();
			if(original.equals(newAnswer))
			{
				condi = false;
			}	
			else
			{
				driver.findElement(By.linkText("Repaint Box 2")).click();
			}
		}
		driver.findElement(By.linkText("Proceed")).click();

			}

		
	}


