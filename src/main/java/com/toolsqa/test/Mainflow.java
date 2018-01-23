package com.toolsqa.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.toolsqa.selenium.SeleniumInterfaceImpl;

public class Mainflow {
	public static void main(String[] args) {
		Mainflow obj = new Mainflow();
		obj.StartExec();

	}

	public void StartExec() {
		String browser = "firefox";
		// String url = "http://store.demoqa.com/";
		String url = "http://toolsqa.wpengine.com/automation-practice-form/";
		String url1 = "http://toolsqa.com/automation-practice-table/";
		String genderxpath = "//input[@type='radio' and @value='Female']";
		String expyrsoptionsxpath = "//input[@type='radio' and @name='exp']";
		String continentid = "continents";
		String commands = "selenium_commands";
		// String tabelvaluexpath = "//*[@id='content']/table/tbody/tr[1]/td[2]";
		String tablexpath = "//*[@id='content']/table/tbody/";
		int row = 4;
		int col = 6;

		SeleniumInterfaceImpl instanceobj = SeleniumInterfaceImpl.getInstance();
		instanceobj.setDriver(browser);
		WebDriver driver = instanceobj.getDriver();
		driver.get(url);

		// ****Coordinates
		// Point p =
		// driver.findElement(By.xpath("//a[@title='MyAccount']")).getLocation();
		// System.out.println(p.x + " " + p.y);
		System.out.println("Page Title and Length :");
		System.out.println(driver.getTitle() + "    " + driver.getTitle().length());
		if (driver.getCurrentUrl().equals(url)) {
			System.out.println("Expected site loaded : " + url);
		} else {
			System.out.println("Incorrect website loaded");
		}
		// *****Radiobuttons and Checkboxes
		instanceobj.click(genderxpath);
		List<WebElement> expyrs = driver.findElements(By.xpath(expyrsoptionsxpath));
		instanceobj.selectradiobutton(expyrs);

		// *********drop downs and selectboxes

		WebElement selectbutton = driver.findElement(By.id(commands));
		System.out.println(selectbutton);
		Select selobj = new Select(selectbutton);
		instanceobj.selectoption(selobj);
		// ********Table passing row and colum
		driver.navigate().to(url1);
		System.out.println(driver.findElement(By.xpath(tablexpath + "/tr[" + row + "]/td[" + col + "]")).getText());
		// ********Table-return row based on key
		for (int i = 1; i < col; i++) {
			String str = (driver.findElement(By.xpath(tablexpath + "/tr[" + i + "]/td[1]")).getText());

			if (str.equalsIgnoreCase("china")) {
				for (int j = 1; j < col; j++) {
					System.out.print("      "
							+ driver.findElement(By.xpath(tablexpath + "/tr[" + i + "]/td[" + j + "]")).getText());

				}
				break;

			}

		}

	}
}
