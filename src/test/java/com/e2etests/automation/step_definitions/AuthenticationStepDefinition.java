package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import com.e2etests.automation.page_objects.AuthenticationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStepDefinition {

	private AuthenticationPage authenticationPage;

	public AuthenticationStepDefinition() {
		this.authenticationPage = new AuthenticationPage();
	}

	@Given("Je me connecte sur l aplication Mercury")
	public void jeMeConnecteSurLAplicationMercury() {
		authenticationPage.goToUrl();
	}

	@When("Je saisie le User Name {string}")
	public void jeSaisieLeUserName(String name) {
		authenticationPage.fillUserName(name);
	}

	@When("je saisie le Password {string}")
	public void jeSaisieLePassword(String password) {
		authenticationPage.fillPssword(password);
	}

	@When("je click sur le boutton Submit")
	public void jeClickSurLeBouttonSubmit() {
		authenticationPage.clickOnSubmit();
	}

	@Then("je me redirige a la page home {string}")
	public void jeMeRedirigeALaPageHome(String Text) {
		String message = AuthenticationPage.welcomMessge.getText();
		Assert.assertEquals(message, Text);

	}

}
