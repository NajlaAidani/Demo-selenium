package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.PanierPageObject;

import io.cucumber.java.en.Then;

public class PanierStepDefinition {

	private PanierPageObject panierPageObject;
	
		
		public  PanierStepDefinition() {
		panierPageObject= new PanierPageObject();
	}
	
	

	@Then("je commande un article")
	public void jeCommandeUnArticle() {
		panierPageObject.clickBtnpack();

	}

	@Then("je verifie le nombre article dans le panier")
	public void jeVerifieLeNombreArticleDansLePanier() {
		String mayar=PanierPageObject.NbrP.getText();
	    Assert.assertEquals("1",mayar );
	}

}
