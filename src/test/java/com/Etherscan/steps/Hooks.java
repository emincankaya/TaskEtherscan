package com.Etherscan.steps;

import com.Etherscan.utilities.Driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){

        Driver.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(Scenario scenario){
        scenario.write("Complete scenario: "+ scenario.getName());
        if (scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png", scenario.getName());
        }

        Driver.closeDriver();
    }





}
