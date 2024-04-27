package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.LogoutPageObject;
import io.cucumber.java.en.When;

public class LogoutStepDefinition {
	
	private LogoutPageObject logoutPageObject;
	
	public LogoutStepDefinition() {
		logoutPageObject = new LogoutPageObject();	
	}
	
	@When("je clique sur le bouton logout")
	public void jeCliqueSurLeBoutonLogout() {
		logoutPageObject.clickMenu();
		logoutPageObject.clickBtt ();     
	}
	@When("je me redirige vers la page authentification")
	public void jeMeRedirigeVersLaPageAuthentification() {
		
	    
	}




}
