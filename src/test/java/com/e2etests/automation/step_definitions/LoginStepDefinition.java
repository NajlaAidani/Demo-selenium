package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.LoginPageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

private LoginPageObject loginPageObject;

public LoginStepDefinition() {
	loginPageObject=new LoginPageObject();
}

	@Given("j accede à l application SwagLabs")
	public void jAccedeÀLApplicationSwagLabs() {
		loginPageObject.connectToApp();
	}
	@When("je saisi le username {string}")
	public void jeSaisiLeUsername(String string) {
		loginPageObject.fillUsername(string);
	}
	@When("je saisi le mot de passe {string}")
	public void jeSaisiLeMotDePasse(String string) {
		loginPageObject.fillPassword(string);
	}
	@When("je clique sur le bouton de connexion")
	public void jeCliqueSurLeBoutonDeConnexion() {
		loginPageObject.clickBtn();
	   
	}
	@Then("je me redirige vers la page d acceuil {string}")
	public void jeMeRedirigeVersLaPageDAcceuil(String msg) {
	    String titlePage=LoginPageObject.title.getText();
	    Assert.assertEquals(msg, titlePage);
	   
	}
	
	@Then("un message d erreur s affiche {string}")
	public void unMessageDErreurSAffiche(String m) {
		String msg=LoginPageObject.msgErreur.getText();
		Assert.assertEquals(m, msg);
		
		   
	   
	}






}
