package com.seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\InstallSelenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Arthi");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Yugesh");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("arthi2502@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("ArthiKasthuri");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("ArthiKasthuri");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("arthi2502@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("ArthiKasthuri");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}}
