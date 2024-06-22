package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class AuthenticationPage {

	private ConfigFileReader configFileReader;

	/* @FindBy */
	@FindBy(how = How.NAME, using = "userName")
	public static WebElement userName;
	@FindBy(how = How.NAME, using = "password")
	public static WebElement password;
	@FindBy(how = How.NAME, using = "submit")
	public static WebElement btnsubmit;
	@FindBy(how = How.TAG_NAME, using = "h3")
	public static WebElement welcomMessge;

	public AuthenticationPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
		
	}

	/* create Method */
	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
	}
	
	public void fillUserName(String name) {
		userName.sendKeys(name);
	}

	public void fillPssword(String passwordText) {
		password.sendKeys(passwordText);
	}

	public void clickOnSubmit() {
		btnsubmit.click();
	}

}