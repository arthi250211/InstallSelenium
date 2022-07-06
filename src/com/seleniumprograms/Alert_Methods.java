package com.seleniumprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Methods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\InstallSelenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Alert.html");	
		WebElement simple = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		simple.click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		driver.switchTo().alert().dismiss();

		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Java & Selenium");
		prompt.accept();
		
		WebElement linebreak = driver.findElement(By.xpath("//button[text()='Line Breaks?']"));
	    linebreak.click();
	    driver.switchTo().alert().accept();
	}
}
