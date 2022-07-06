package com.seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple {
public static void main(String[] args) {
	
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\InstallSelenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));
		
		Select s=new Select(multiple);	
		s.selectByIndex(1);
		s.selectByValue("2");
		s.selectByVisibleText("UFT/QTP");
	
		boolean b = s.isMultiple();
		System.out.println("Multiple dropdown:"+b);
		
		s.deselectByIndex(2);

		List<WebElement> options = s.getOptions();
		for (WebElement allOptions : options) {
			System.out.println(allOptions.getText());
		}
	
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement selected : allSelectedOptions) {
		System.out.println(selected.getText());
			}
	
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());

		s.deselectAll();
}}
