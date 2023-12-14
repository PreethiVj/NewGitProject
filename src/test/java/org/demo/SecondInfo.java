package org.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SecondInfo {
	
	@Test
	private void openbrowser() {
System.setProperty("Webdriver.chrome.driver", "/home/preethi/Downloads/Eclipse/Work Space/org.demo/driver/chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.get("https://sit-uat.engage2serve.com/#/index/audienceTemplate/individual/alumni////");
	}
	


	

//	@Test(enabled=true,groups = "system")
//	private void system() {
//		System.out.println("run this system");
//
//	}
//	
//
//	@Test(enabled=true,groups="system")
//	private void system1() {
//		System.out.println("run this system1");
//
//	}
//	
//	@Test(enabled = true, groups="custom",dependsOnGroups = "system")
//	private void custom() {
//		System.out.println("run this custom");
//
//	}

}


