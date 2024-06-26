package com.e2etests.automation.page_objects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.utils.Setup;

public class LogoutPageObject {
	// recherche des elements
		@FindBy(how = How.ID, using = "user-name")
		public static WebElement username;

		@FindBy(how = How.ID, using = "password")
		public static WebElement password;

		@FindBy(how = How.ID, using = "login-button")
		public static WebElement btnLogin;

		@FindBy(how = How.XPATH, using = "//span[@class='title']")
		public static WebElement title;
		
		@FindBy(how = How.ID, using = "react-burger-menu-btn")
		public static WebElement menu;
		
		@FindBy(how = How.ID, using = "logout_sidebar_link")
		public static WebElement bttLogout;
		
		public LogoutPageObject() {
			PageFactory.initElements(Setup.getDriver(), this);
		}

		
		
		// methode
		public void connectToApp() {
			Setup.getDriver().get("https://www.saucedemo.com/");
		}

		public void fillUsername(String usr) {
			username.clear();
			username.sendKeys(usr);
		}

		public void fillPassword(String pwd) {
			password.clear();
			password.sendKeys(pwd);
		}

		public void clickBtn() {
			btnLogin.click();
		}
		
		public void clickMenu() {
			menu.click();
		}
			
			
		public void clickBtt() {
			WebDriverWait wait=new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(bttLogout));
			bttLogout.click();
		}
}
