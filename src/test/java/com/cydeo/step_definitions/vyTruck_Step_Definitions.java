package com.cydeo.step_definitions;

import com.cydeo.pages.vyTruckPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class vyTruck_Step_Definitions {
    vyTruckPage vyTruckPage=new vyTruckPage();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),20);


    @When("Users enter{string} and {string} and login to the homepage")
    public void usersEnterUsernameAndPasswordAndLoginToTheHomepage(String string, String string2) throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("webTableUrl"));
        wait.until(ExpectedConditions.visibilityOf(vyTruckPage.inputUserName));
       // vyTruckPage.inputUserName.sendKeys(ConfigurationReader.getProperty("web.table.username"));
       // vyTruckPage.inputPassword.sendKeys(ConfigurationReader.getProperty("web.table.pw"));
        vyTruckPage.inputUserName.sendKeys(string);
        vyTruckPage.inputPassword.sendKeys(string2);

        vyTruckPage.loginButton.click();

        Thread.sleep(5000);
    }
    @When("Click the Vehicle under the Fleet")
    public void click_the_vehicle_under_the_fleet()  {
        wait.until(ExpectedConditions.visibilityOf(vyTruckPage.selectFleetBtn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(vyTruckPage.selectVehicleTab)).click();

        wait.until(ExpectedConditions.titleIs("Dashboard"));


    }
    @Then("Verify all the checkboxes are unchecked")
    public void verify_all_the_checkboxes_are_unchecked() throws InterruptedException {
        try {
            Assert.assertTrue(vyTruckPage.uncheckedCheckbox.isDisplayed());
            System.out.println("Verify if all checkboxes are selected: " + vyTruckPage.uncheckedCheckbox.isSelected());
        }catch (Exception e){
            System.out.println("No CheckBox Button could be found");
            Driver.closeDriver();
        }
        Thread.sleep(5000);
    }
    @When("Click the 1st checkbox in the web-table")
    public void click_the_1st_checkbox_in_the_web_table(){
      vyTruckPage.clickFirstCheckbox.click();

    }
    @Then("Verify all the checkboxes also checked")
    public void verify_all_the_checkboxes_also_checked() throws InterruptedException {
        List<WebElement> listOfAllCheckBoxes = Driver.getDriver().findElements(By.xpath("//table[@class]/tbody//tr//td/input"));
        int countOfCheckBoxes= listOfAllCheckBoxes.size();
        int count = 0;
        for (WebElement eachCheckBox : listOfAllCheckBoxes) {
            if(eachCheckBox.isSelected()){
                count++;
            }
        }
        Assert.assertEquals(countOfCheckBoxes,count);
        System.out.println("countOfCheckBoxes = " + countOfCheckBoxes);
        System.out.println("count = " + count);
        vyTruckPage.clickFirstCheckbox.click();
        Thread.sleep(3000);

    }

    @When("Check any car???s checkbox")
    public void check_any_car_s_checkbox() throws InterruptedException {
        Thread.sleep(3000);
        vyTruckPage.checkAnyCheckBox.click();


    }
    @Then("Verify the box is checked")
    public void verify_the_box_is_checked() {
        Assert.assertTrue(vyTruckPage.checkAnyCheckBox.isSelected());
        System.out.println("clickAnyCarsCheckbox.isSelected() = " + vyTruckPage.checkAnyCheckBox.isSelected());
        Driver.closeDriver();
    }



    }


