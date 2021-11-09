package com.Etherscan.steps;

import com.Etherscan.pages.TestPage;
import com.Etherscan.utilities.ConfigurationReader;
import com.Etherscan.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;



public class MyStepdefs extends TestPage{


    @Given("the user get the url")
    public void theUserGetTheUrl() throws InterruptedException {

        Driver.get().get(ConfigurationReader.get("url"));
        Assert.assertEquals(PageHeadName(), "Etherscan Registration Page");

    }


    @When("the user click the Create an account button")
    public void theUserClickTheCreateAnAccountButton() throws InterruptedException {
        Thread.sleep(12000);

        clickCheckbox(CreateButton);

    }

    @Then("verify the congrulations message")
    public void verifyTheCongrulationsMessage() {
        Assert.assertEquals(congMessage.getText(), "Your account has been successfully registered and pending for email verification.");

    }


    @Then("verify the checkbox error message")
    public void verifyTheCheckboxErrorMessage() {
        Assert.assertEquals(conditionsCheckBoxError.getText(), "Please accept our Terms and Conditions.");

    }

    @Then("verify the checkbox")
    public void verifyTheCheckbox() {
        Assert.assertTrue(ConditionsCheckBox.isSelected());

    }


    @Then("it gives a error message for password")
    public void itGivesAErrorMessageForPassword() {
        Assert.assertEquals(passwordError.getText(),"Your password must be at least 5 characters long.");


    }



    @Then("it gives a error message for confirm password")
    public void itGivesAErrorMessageForConfirmPassword() {
        Assert.assertEquals(confirmPasswordError.getText(), "Password does not match, please check again.");

    }


    @Then("it gives an error")
    public void itGivesAnError() {
        Assert.assertEquals(UserNameError.getText(), "Username is invalid.");

    }


    @Then("the user enter the {string}")
    public void theUserEnterThe(String email) throws InterruptedException {
        EmailBox.sendKeys(ConfigurationReader.get(email));
        Thread.sleep(2000);

    }

    @When("the user enter the username {string}")
    public void theUserEnterTheUsername(String username) {
        UserNameBox.sendKeys(ConfigurationReader.get(username));

    }

    @Then("it gives an error message for email")
    public void itGivesAnErrorMessageForEmail() {
        Assert.assertEquals(EmailError.getText(), "Please enter a valid email address.");

    }

    @When("the user enter the password {string}")
    public void theUserEnterThePassword(String password) {
        passwordBox.sendKeys(ConfigurationReader.get(password));

    }

    @When("the user enter the confirm password {string}")
    public void theUserEnterTheConfirmPassword(String confirmPassword) {
        confirmPasswordBox.sendKeys(ConfigurationReader.get(confirmPassword));

    }





    @Then("it gives a message for password's strength{string}")
    public void itGivesAMessageForPasswordSStrength(String error) {
        Assert.assertEquals(passwordError.getText(),"Strength: "+error+"!");

    }


    @Then("it gives an error message for password{string}")
    public void itGivesAnErrorMessageForPassword(String passworderror) {
        Assert.assertEquals(passwwordError2.getText(),passworderror);

    }

    @Then("it gives an error message for confirm password{string}")
    public void itGivesAnErrorMessageForConfirmPassword(String error) {
        Assert.assertEquals(confirmPasswordError.getText(), error);

    }

    @When("the user click checkboxes")
    public void theUserClickCheckboxes() {
        clickCheckbox(ConditionsCheckBox);
        clickCheckbox(SubscribeCheckBox);
    }
}



