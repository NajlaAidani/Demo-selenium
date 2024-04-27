package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.ProfilBouletPageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfilBouletStepDefinition {

	public ProfilBouletPageObject profilBouletPageObject;

	public ProfilBouletStepDefinition() {
		profilBouletPageObject = new ProfilBouletPageObject();
	}

	@Given("j accede a lapplication bouletcorp")
	public void jAccedeALapplicationBouletcorp() {
		profilBouletPageObject.connectToApp();

	}

	@When("je clique sur le boutton a propos")
	public void jeCliqueSurLeBouttonAPropos() {
		profilBouletPageObject.clickBtna();
	}

	@When("je decent au bas de page")
	public void jeDecentAuBasDePage() {

	}

	@When("je clique sur image sms bleu")
	public void jeCliqueSurImageSmsBleu() {
		profilBouletPageObject.clickBtns();

	}

	@Then("je me redirige vers le profil de boulet")
	public void jeMeRedirigeVersLeProfilDeBoulet() {

		String msg = ProfilBouletPageObject.profile.getText();
		Assert.assertEquals(msg,"Profile");

		// WebDriver new driver;
		// String URL = driver.getCurrentUrl(url); Assert.assertEquals(URL,
		// "https://octodon.social/@Bouletcorp" );
	}

}
