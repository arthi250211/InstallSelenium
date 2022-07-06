package com.seleniumprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\InstallSelenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		Actions ac=new Actions(driver);
		Robot rb= new Robot();

		WebElement mobiles = driver.findElement(By.linkText("Mobiles"));
		ac.contextClick(mobiles).build().perform();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

		WebElement customer = driver.findElement(By.linkText("Customer Service"));
		ac.contextClick(customer).build().perform();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

		WebElement fashion = driver.findElement(By.linkText("Fashion"));
		ac.contextClick(fashion).build().perform();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("windowHandles");
		for (String str : windowHandles) {
			String title = driver.switchTo().window(str).getTitle();
			System.out.println(title);
		}

		String mystring="Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids";
		for (String str : windowHandles) {
			if (driver.switchTo().window(str).getTitle().equals(mystring)) {
				break;
			}}

		String mystring1="Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids";
		String[] split = mystring1.split(" ");
		for (String str : split) {
			System.out.println(str);
		}}
}

