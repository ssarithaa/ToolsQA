package com.toolsqa.selenium.test;

import org.openqa.selenium.WebDriver;

import com.toolsqa.selenium.SeleniumImpl;

public class Mainflow {

	public Mainflow() {
	}

	public Mainflow(String browser) {
	}

	public static void main(String[] args) {
		Mainflow obj = new Mainflow();
		obj.startExec();
	}

	public void startExec() {
		SeleniumImpl seleniumInterface = SeleniumImpl.getInstance("chrome");
		String url = "http://toolsqa.wpengine.com/automation-practice-form/";
		String femalexpath = "//input[@id='sex-1']";
		WebDriver driver = seleniumInterface.getDriver();
		driver.get(url);
		System.out.println("Page Title and Length :");
		System.out.println(driver.getTitle() + "    " + driver.getTitle().length());
		if (driver.getCurrentUrl().equals(url)) {
			System.out.println("Expected site loaded : " + url);
		} else {
			System.out.println("Incorrect website loaded");
		}
		// if(driver.findElement(By.xpath(femalexpath).
		// driver.navigate().to("https://www.google.com");
		// driver.navigate().back();
		// Point p = driver.findElement(By.xpath("//a[@title='My
		// Account']")).getLocation();
		// System.out.println(p.x + " " + p.y);

	}
}
