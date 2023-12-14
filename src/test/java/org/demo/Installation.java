package org.demo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Installation implements ITestListener{

	WebDriver driver;

	@BeforeSuite
	private void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Selectable.html");

	}

	/*
	 * @Test public void searchterm() throws InterruptedException { WebElement
	 * searchterm= driver.findElement(By.id("APjFqb"));
	 * searchterm.sendKeys("https://demo.automationtesting.in/Selectable.html" +
	 * Keys.ENTER); Thread.sleep(5000);
	 * driver.findElement(By.linkText("Selectable")).click();
	 * 
	 * }
	 */

	@Test
	public void listitemsselection() {

		List<WebElement> allitems = driver.findElements(By.xpath("//*[@class='deaultFunc']/li"));
		int sizeoflist = allitems.size();
		System.out.println(sizeoflist);

		String text = driver.findElement(By.xpath("(//*[text()='Sakinalium - Cross Browser Testing'])[1]")).getText();

		for (WebElement webElemenitems : allitems) {

			if (text.equals(webElemenitems))
				System.out.println(webElemenitems);
			break;
		}

	}

	@Test

	public void run3() {

		// file selection

		System.out.println("run this third");
	}

	@AfterSuite
	public void Quitbrowser() {
		driver.close();

	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
