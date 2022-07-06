package com.seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_Webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\InstallSelenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/table.html");
		
        System.out.println("---------------All Data------------");
        List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
        for (WebElement all : alldata) {
        	System.out.println(all.getText());
		}
        
        System.out.println("-------------Rowdata--------------");
        List<WebElement> rowData = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
        for (WebElement row : rowData) {
        	System.out.println(row.getText());
        }
        
        
        System.out.println("-----------column data---------");
        List<WebElement> columnData = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
	    for (WebElement column : columnData) {
	    	System.out.println(column.getText());
		}
	    
	    System.out.println("------------single data------------");
	    WebElement single = driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]"));
	    System.out.println(single.getText());
	}}
