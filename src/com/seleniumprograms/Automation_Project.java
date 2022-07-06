package com.seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Project {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\InstallSelenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.id("email")).sendKeys("arthi2502@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("ArthiKasthuri");
		driver.findElement(By.xpath("//i[@class='icon-lock left']")).click();
		driver.findElement(By.linkText("Women")).click();
		driver.findElement(By.linkText("Tops")).click();
		driver.findElement(By.linkText("Blouses")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@title='Blouse']")).click();
		Thread.sleep(1000);
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("(//button[@name='Submit'])[1]")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[2]")).click();
		driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")).click();
		driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[7]	")).click();
		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span/i")).click();
		driver.findElement(By.xpath("(//a[@class='bankwire'])")).click();
		driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
		driver.close();
}}

