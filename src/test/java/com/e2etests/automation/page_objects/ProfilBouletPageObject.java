package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class ProfilBouletPageObject {
	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/nav/ul/li[4]/a")
	public static WebElement Btnapropos;
	@FindBy(how = How.XPATH, using ="//*[@id=\"container\"]/footer/ul/li[2]/div/a/img")
	public static WebElement Btnsmsbleu;
	@FindBy(how = How.XPATH, using = "//*[@id=\"tabs-bar__portal\"]/div/h1/button")
			public static WebElement profile;

	public ProfilBouletPageObject() {
		PageFactory.initElements(Setup.getDriver(), this);
	}
//methode
	public void connectToApp() {
		Setup.getDriver().get("https://www.bouletcorp.com/about");
	}

	public void clickBtna() {
		Btnapropos.click();
	}
	public void clickBtns() {
		Btnsmsbleu.click();
	}
	public void urlLinkText() {
		 this.urlLinkText();
		
	}
	
}
