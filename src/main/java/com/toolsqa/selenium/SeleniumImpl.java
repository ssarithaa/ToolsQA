package com.toolsqa.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumImpl implements SeleniumInterface {
	private static WebDriver driver;
	private static SeleniumImpl instance;

	private SeleniumImpl() {

	}

	public static SeleniumImpl getInstance(String browser) {
		if (instance == null) {
			instance = new SeleniumImpl();

			instance.setDriver(browser);
		}

		return instance;
	}

	public WebDriver setDriver() {
		return setDriver(null);
	}

	@SuppressWarnings("static-access")
	public WebDriver setDriver(String browser) {
		switch (browser.toLowerCase()) {
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:/Users/saritha.pattathil/geckodriver.exe");
			this.driver = new FirefoxDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:/Users/saritha.pattathil/chromedriver.exe");
			this.driver = new ChromeDriver();
			break;

		default:
			System.setProperty("webdriver.chrome.driver", "C:/Users/saritha.pattathil/chromedriver.exe");
			this.driver = new ChromeDriver();
		}
		return driver;
	}

	@SuppressWarnings("static-access")
	public WebDriver getDriver() {
		if (this.driver == null) {
			setDriver();
		}

		return this.driver;
	}

	@Override
	public void click(WebElement element) {
		// TODO Auto-generated method stub

	}

}
