package com.toolsqa.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface SeleniumInterface {
	WebDriver setDriver(String browser);

	WebDriver getDriver();

	void click(WebElement element);

}
