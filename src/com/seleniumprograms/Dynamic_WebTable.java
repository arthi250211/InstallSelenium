package com.seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\InstallSelenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/coronavirus/");

		System.out.println("-------------India All Data--------------");
		List<WebElement> indiaData = driver.findElements(By.xpath("//table/tbody/tr[7]/td"));
		for (WebElement india : indiaData) {
			System.out.println(india.getText());
		}


		System.out.println("-----------All Countries List---------");
		List<WebElement> countriesData = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		for (WebElement country : countriesData) {
			System.out.println(country.getText());
		}

		System.out.println("------------Population of India------------");
		WebElement population = driver.findElement(By.xpath("//table/tbody/tr[7]/td[15]"));
		System.out.println(population.getText());
	}
}
