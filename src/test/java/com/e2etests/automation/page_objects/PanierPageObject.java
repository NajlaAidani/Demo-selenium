package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class PanierPageObject {
	@FindBy(how = How.ID, using = "add-to-cart-sauce-labs-backpack")
	public static WebElement btnpack;
	@FindBy(how = How.XPATH, using = "//span[@class='shopping_cart_badge']")
	public static  WebElement NbrP;
	
	public  PanierPageObject() {	
		PageFactory.initElements(Setup.getDriver(), this);
	}

	public void clickBtnpack() {
		btnpack.click();
	}
}
