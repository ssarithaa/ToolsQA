package com.toolsqa.selenium;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public interface ISeleniumInterface {

	WebDriver setDriver(String browser);

	WebDriver getDriver();

	void click(String elementxpath);

	void selectradiobutton(List<WebElement> optionslist);

	void selectoption(Select selobj);
}
