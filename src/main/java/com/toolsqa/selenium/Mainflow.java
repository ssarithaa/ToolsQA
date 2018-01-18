package com.toolsqa.selenium;

import org.openqa.selenium.WebDriver;

public class Mainflow extends Base {// to implement driver
	public static void main(String[] args) {
		new Mainflow().StartExec();

	}

	public void StartExec() {
		String browser = "firefox";
		String url = " “http://toolsqa.wpengine.com/automation-practice-form/";
		String femalexpath = "//input[@id='sex-1']";
		WebDriver driver = this.getDriver(browser);
		driver.get(url);
		System.out.println("Page Title and Length :");
		System.out.println(driver.getTitle() + "    " + driver.getTitle().length());
		if (driver.getCurrentUrl().equals(url)) {
			System.out.println("Expected site loaded : " + url);
		} else {
			System.out.println("Incorrect website loaded");
		}
		// driver.navigate().to("https://www.google.com");
		// driver.navigate().back();
		// Point p = driver.findElement(By.xpath("//a[@title='My
		// Account']")).getLocation();
		// System.out.println(p.x + " " + p.y);

	}
}
