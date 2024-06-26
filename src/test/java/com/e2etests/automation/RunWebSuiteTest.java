package com.e2etests.automation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions( 
		
		features= {"src/spec/features"},//localisation des features
		plugin= {"pretty","html:target/cucumber-report.html"},//reporting
		tags=("@ProfilBoulet"),//taguer les cas de test
		monochrome=true,//organiser le console
		snippets=SnippetType.CAMELCASE
		)

public class RunWebSuiteTest {

}
