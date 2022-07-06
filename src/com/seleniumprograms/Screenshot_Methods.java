package com.seleniumprograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Methods {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\InstallSelenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tnesevai.tn.gov.in/");

		TakesScreenshot ts=(TakesScreenshot) driver;	
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\DELL\\eclipse-workspace\\InstallSelenium\\Screenshot\\image.jpg");
		FileUtils.copyFile(src, des);
	}}
