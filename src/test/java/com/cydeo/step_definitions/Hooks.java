package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before(order=1)
    public void setupScenario(){
        System.out.println("===Setting up browser using cucummber @Before");
    }
    @BeforeStep(value = "@login", order = 2)
    public void setupScenarioForLogin(){
        System.out.println("====this will only apply to scenarios with @login tag ");
    }
    @BeforeStep (value = "@db",order = 0 )
    public void setupForDatabaseScenarios(){
        System.out.println("====this will only apply to scenarios with @login tag ");
    }
   @After
   public void teardownScenario(){
//        if(scenario.isFailed()){
//            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot,"image/png",scenario.getName());
//        }

    //   Driver.closeDriver();

        // System.out.println("===Closing browser using cucumber @After");
        //System.out.println("===Scenario ended/ Take screenshot if failed!");
    }
    //  @BeforeStep
    public void setupStep(){
        System.out.println("------applying setup using @BeforeStep");
    }
    //  @AfterStep
    public void afterStep(){
        System.out.println("------>applying teardown using @AfterStep");
    }
}

