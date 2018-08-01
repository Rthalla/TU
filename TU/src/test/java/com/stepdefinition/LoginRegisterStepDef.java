package com.stepdefinition;

import org.openqa.selenium.By;

import com.cucumberrunner.AbstractMain;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginRegisterStepDef extends AbstractMain{

@When("^I enter Valid Username \"([^\"]*)\" and Valid Password \"([^\"]*)\"$")
public void i_enter_Valid_Username_and_Valid_Password(String userName, String password) throws Throwable {
	loginregister.loginButton(userName,password);
}

@When("^I enter Submit Button$")
public void i_enter_Submit_Button() throws Throwable {
    loginregister.submitButton();
}


@When("^I select login link in homepage$")
public void i_select_login_link_in_homepage() throws Throwable {
   loginregister.loginLink();
}

@Then("^I should see my logged in to my account$")
public void i_should_see_my_logged_in_to_my_account() throws Throwable {
  
}



}
