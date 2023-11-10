package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.masteradmin.MnUserClientV1;
import com.juaracoding.masteradmin.ParamShifting;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestParamShifting {

    public static ExtentTest extentTest;
    private static WebDriver driver;
    private static MnUserClientV1 mnUserClientV1 = new MnUserClientV1();
    private static ParamShifting paramShifting = new ParamShifting();

    public TestParamShifting(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //Dashboard Parameter Shifting
    @Given("User click menu master tab")
    public void user_click_menu_master_tab(){
        mnUserClientV1.clickMaster();
        extentTest.log(LogStatus.PASS, "User click menu master\"");
    }

    @When("User click menu parameter shifting")
    public void user_click_menu_parameter_shifting(){
        paramShifting.clickTabParamShift();
        extentTest.log(LogStatus.PASS, "User click menu parameter shifting");
    }

    @Then("User get text message parameter shift")
    public void user_get_text_message_parameter_shift(){
        paramShifting.getTxtParamShift();
        Assert.assertEquals(paramShifting.getTxtParamShift(),"Parameter Shift");
        extentTest.log(LogStatus.PASS, "User get text message parameter shift");
    }

    //Add parameter shifting
    @Given("User click button add")
    public void user_click_button_add(){
        paramShifting.clickBtnAdd();
        extentTest.log(LogStatus.PASS, "User click button add");
    }

    @When("User click button submit")
    public void user_click_button_submit(){
        paramShifting.clickBtnSubmit();
        extentTest.log(LogStatus.PASS, "User click button submit");
    }

    @Then("User get text message required")
    public void user_get_text_message_required(){
        DriverSingleton.delay(4);
        paramShifting.getTxtUnitRequired();
        Assert.assertEquals(paramShifting.getTxtUnitRequired(),"The Unit field is required.");
        extentTest.log(LogStatus.PASS, "User get text message required");
    }

}
