package com.seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Methods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\InstallSelenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		WebElement frame = driver.findElement(By.xpath("//button[@id='Click']"));
		frame.click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement nestedframe = driver.findElement(By.xpath("//button[@id='Click1']"));
		nestedframe.click();	
		driver.switchTo().defaultContent();

		List<WebElement> total = driver.findElements(By.xpath("/html/body"));
		int size = total.size();
		System.out.println(size);
	}}