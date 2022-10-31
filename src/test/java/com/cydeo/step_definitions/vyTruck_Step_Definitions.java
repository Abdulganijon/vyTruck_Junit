package com.cydeo.step_definitions;

import com.cydeo.pages.vyTruckPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class vyTruck_Step_Definitions {
    vyTruckPage vyTruckPage=new vyTruckPage();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),20);


    @When("Users enter{string} and {string} and login to the homepage")
    public void usersEnterUsernameAndPasswordAndLoginToTheHomepage(String string, String string2) {
        Driver.getDriver().get(ConfigurationReader.getProperty("webTableUrl"));
        wait.until(ExpectedConditions.visibilityOf(vyTruckPage.inputUserName));
       // vyTruckPage.inputUserName.sendKeys(ConfigurationReader.getProperty("web.table.username"));
       // vyTruckPage.inputPassword.sendKeys(ConfigurationReader.getProperty("web.table.pw"));
        vyTruckPage.inputUserName.sendKeys(string);
        vyTruckPage.inputPassword.sendKeys(string2);

        vyTruckPage.loginButton.click();
        wait.until(ExpectedConditions.titleIs("Dashboard"));
    }
    @When("Click the Vehicle under the Fleet")
    public void click_the_vehicle_under_the_fleet() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(vyTruckPage.selectFleetBtn));
         vyTruckPage.selectFleetBtn.click();
         Thread.sleep(5000);
         wait.until(ExpectedConditions.visibilityOf(vyTruckPage.selectVehicleTab));
         vyTruckPage.selectVehicleTab.click();
    }
    @Then("Verify all the checkboxes are unchecked")
    public void verify_all_the_checkboxes_are_unchecked() {

    }
    @When("Click the 1st checkbox in the web-table")
    public void click_the_1st_checkbox_in_the_web_table() {

    }
    @Then("Verify all the checkboxes also checked")
    public void verify_all_the_checkboxes_also_checked() {

    }

    @When("Check any car’s checkbox")
    public void check_any_car_s_checkbox() {

    }
    @Then("Verify the box is checked")
    public void verify_the_box_is_checked() {

    }



    }


