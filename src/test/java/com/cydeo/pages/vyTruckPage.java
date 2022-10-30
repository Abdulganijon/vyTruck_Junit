package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class vyTruckPage {
    public vyTruckPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
