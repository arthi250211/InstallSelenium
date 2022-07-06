package com.seleniumprograms;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Adactin_Project {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\InstallSelenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.findElement(By.id("username")).sendKeys("arthi2502");
		driver.findElement(By.id("password")).sendKeys("SI0PW8");
		driver.findElement(By.id("login")).click();
		WebElement location = driver.findElement(By.id("location"));
		Select s=new Select(location);
		s.selectByVisibleText("Paris");

		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1=new Select(hotel);
		s1.selectByValue("Hotel Sunshine");

		WebElement room = driver.findElement(By.id("room_type"));
		Select s2=new Select(room);
		s2.selectByValue("Deluxe");

		WebElement number = driver.findElement(By.id("room_nos"));
		Select s3=new Select(number);
		s3.selectByVisibleText("2 - Two");

		WebElement checkin = driver.findElement(By.id("datepick_in"));
		checkin.clear();
		checkin.sendKeys("24/06/2022");

		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.clear();
		checkout.sendKeys("27/06/2022");

		WebElement adult = driver.findElement(By.id("adult_room"));
		Select c=new Select(adult);
		c.selectByValue("2");

		WebElement child = driver.findElement(By.id("child_room"));
		Select c1=new Select(child);
		c1.selectByVisibleText("1 - One");

		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("first_name")).sendKeys("Arthi");
		driver.findElement(By.id("last_name")).sendKeys("Yugesh");
		driver.findElement(By.id("address")).sendKeys("Thiyagaraja Nagar,Woraiyur,Trichy");
		driver.findElement(By.id("cc_num")).sendKeys("1317347471414810");
		WebElement cc = driver.findElement(By.id("cc_type"));
		Select c2=new Select(cc);
		c2.selectByValue("VISA");

		WebElement month = driver.findElement(By.id("cc_exp_month"));
		Select c3=new Select(month);
		c3.selectByVisibleText("February");

		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select c4=new Select(year);
		c4.selectByVisibleText("2012");

		driver.findElement(By.id("cc_cvv")).sendKeys("1234");
		driver.findElement(By.id("book_now")).click();
        Thread.sleep(5000);
        
		driver.findElement(By.xpath("//input[@value='My Itinerary']")).click();
		driver.findElement(By.xpath("//input[@value='Logout']")).click();
	}}
