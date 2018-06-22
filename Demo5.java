package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\architkumar\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://10.0.1.86/tatoc/basic/cookie#");
		driver.findElement(By.linkText("Generate Token")).click();
		String Text = driver.findElement(By.id("token")).getText();
		System.out.println(Text);
		String subText = Text.substring(7,Text.length());
		System.out.println(subText);
		 Cookie name = new Cookie("Token",subText);
         driver.manage().addCookie(name);
         driver.findElement(By.linkText("Proceed")).click();
	}

}
