package com.toolsqa.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	private WebDriver driver;

	public WebDriver setDriver(String browser) {
		switch (browser.toLowerCase()) {
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:/Users/saritha.pattathil/geckodriver.exe");
			this.driver = new FirefoxDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:/Users/saritha.pattathil/chromedriver.exe");
			this.driver = new FirefoxDriver();
			break;

		}
		return this.driver;
	}

	public WebDriver getDriver(String browser) {
		if (this.driver == null) {
			this.setDriver(browser);
		}

		return this.driver;
	}

}
