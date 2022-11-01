package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class vyTruckPage {
    public vyTruckPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="prependedInput")
    public WebElement inputUserName;

    @FindBy(id="prependedInput2")
    public WebElement inputPassword;

    @FindBy(id="_submit")
    public WebElement loginButton;

    @FindBy(xpath = "(//span[contains(normalize-space(),'Fleet')])[1]")
    public WebElement selectFleetBtn;

    @FindBy(xpath = "(//span[contains(normalize-space(),'Vehicle')])[1]")
    public WebElement selectVehicleTab;

    @FindBy(xpath = "(//table[@class]/tbody//tr//td/input)")
    public WebElement uncheckedCheckbox;

}
