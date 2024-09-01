package com.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestDDMethods {
	@Test
	public void setUp() throws InterruptedException {	
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php");
		driver.manage().window().maximize();
		WebElement month=driver.findElement(By.id("month"));
		Select month_dd=new Select(month);
		WebElement option=month_dd.getFirstSelectedOption();
		String opt=option.getText();
		System.out.println(opt);
		
		month_dd.selectByIndex(11);
		WebElement option1=month_dd.getFirstSelectedOption();
		String opt1=option1.getText();
		System.out.println(opt1);
		Thread.sleep(2000);
		driver.quit();
		

}
}
