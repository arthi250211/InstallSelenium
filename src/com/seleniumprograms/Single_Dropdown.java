package com.seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\InstallSelenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");	
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Arthi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mahendran");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Data@123");
		WebElement day = driver.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByValue("25");

		WebElement month = driver.findElement(By.id("month"));
		Select  s1=new Select(month);
		s1.selectByIndex(1);

		WebElement year = driver.findElement(By.id("year"));
		Select  s2=new Select(year);
		s2.selectByVisibleText("1991");

		driver.findElement(By.xpath("//input[@value='1']")).click();

	}}
