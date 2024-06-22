package com.e2etests.automation.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class TearDown {
	/**
	 * this method is used to close browse. this method is called after the
	 * invocation of each test method in given class.
	 * 
	 * @After Method annotated with @After execute after every scenario.
	 */
	@After
	public void quitDriver(Scenario scenario) {
		if (scenario.isFailed()) {
			final byte [] screenshot = ((TakesScreenshot) Setup.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png","screenshot");
		}
		Setup.getDriver().quit();
		
	} 

}
