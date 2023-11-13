package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.masteradmin.MnUserClientV1;
import com.juaracoding.masteradmin.ParamShifting;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_lol.AN;
import io.cucumber.java.zh_cn.而且;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestParamShifting {

    public static ExtentTest extentTest;
    private static WebDriver driver;
    private static MnUserClientV1 mnUserClientV1 = new MnUserClientV1();
    private static ParamShifting paramShifting = new ParamShifting();

    public TestParamShifting() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //Dashboard Parameter Shifting
    @Given("User click menu master tab")
    public void user_click_menu_master_tab() {
        mnUserClientV1.clickMaster();
        extentTest.log(LogStatus.PASS, "User click menu master tab");
    }

    @When("User click menu parameter shifting")
    public void user_click_menu_parameter_shifting() {
        paramShifting.clickTabParamShift();
        extentTest.log(LogStatus.PASS, "User click menu parameter shifting");
    }

    @Then("User get text message parameter shift")
    public void user_get_text_message_parameter_shift() {
        paramShifting.getTxtParamShift();
        Assert.assertEquals(paramShifting.getTxtParamShift(), "Parameter Shift");
        extentTest.log(LogStatus.PASS, "User get text message parameter shift");
    }

    //Add parameter shifting
    @Given("User click button add")
    public void user_click_button_add() {
        paramShifting.clickBtnAdd();
        extentTest.log(LogStatus.PASS, "User click button add");
    }

    @When("User click button submit")
    public void user_click_button_submit() {
        paramShifting.clickBtnSubmit();
        extentTest.log(LogStatus.PASS, "User click button submit");
    }

    @Then("User get text message unit required")
    public void user_get_text_message_unit_required() {
        DriverSingleton.delay(2);
        paramShifting.getTxtUnitRequired();
        Assert.assertEquals(paramShifting.getTxtUnitRequired(), "The Unit field is required.");
        extentTest.log(LogStatus.PASS, "User get text message unit required");
    }

    @Given("User click unit")
    public void user_click_unit() {
        paramShifting.setUnit();
        extentTest.log(LogStatus.PASS, "User click unit");
    }

    @When("User input unit")
    public void user_input_unit() {
        paramShifting.getInputUnit("EDC" + Keys.ENTER);
        extentTest.log(LogStatus.PASS, "User input unit");
    }

    @Then("User get text message name shift required")
    public void user_get_text_message_name_shift_required() {
        DriverSingleton.delay(2);
        paramShifting.getTxtNamaRequired();
        Assert.assertEquals(paramShifting.getTxtNamaRequired(), "The Nama Shift field is required.");
        extentTest.log(LogStatus.PASS, "User get text message name shift required");
    }

    @Given("User input name shift")
    public void user_input_name_shift() {
        paramShifting.getInputNamaShift("Shift Pagi");
        extentTest.log(LogStatus.PASS, "User input name shift");
    }

    @Then("User get text message start time required")
    public void user_get_text_message_start_time_required() {
        DriverSingleton.delay(2);
        paramShifting.getTxtJamMulai();
        Assert.assertEquals(paramShifting.getTxtJamMulai(), "The Jam Mulai field is required.");
        extentTest.log(LogStatus.PASS, "User get text message start time required");
    }

    @Given("User input start time")
    public void user_input_start_time() {
        paramShifting.getInputJamMulai("10:15");
        extentTest.log(LogStatus.PASS, "User input start time");
    }

    @Then("User get text message the hour is over required")
    public void user_get_text_message_the_hour_is_over_required() {
        DriverSingleton.delay(2);
        paramShifting.getTxtJamSelesai();
        Assert.assertEquals(paramShifting.getTxtJamSelesai(), "The Jam Selesai field is required.");
        extentTest.log(LogStatus.PASS, "User get text message the hour is over required");
    }

    @Given("User clear input start time")
    public void user_clear_input_start_time() {
        paramShifting.getClearStartTime();
        extentTest.log(LogStatus.PASS, "User clear input start time");
    }

    @When("User input start time with a letter")
    public void user_input_start_time_with_a_letter() {
        paramShifting.getInputJamMulai("test jam");
        extentTest.log(LogStatus.PASS, "User input start time with a letter");
    }

    @And("User input the hour is over")
    public void user_input_the_hour_is_over() {
        paramShifting.getInputJamSelesai("17:15");
        extentTest.log(LogStatus.PASS, "User input the hour is over");
    }

    @Then("User get text message")
    public void user_get_text_message() {
        paramShifting.getTxtAddSuccess();
        DriverSingleton.delay(2);
        paramShifting.getTxtAddSuccess();
        Assert.assertEquals(paramShifting.getTxtAddSuccess(), "Success!");
        extentTest.log(LogStatus.PASS, "User get text message added success");
    }

    @Then("User get text message added success")
    public void user_get_text_message_added_success() {
        DriverSingleton.delay(2);
        paramShifting.getTxtAddSuccess();
        Assert.assertEquals(paramShifting.getTxtAddSuccess(), "Success!");
        extentTest.log(LogStatus.PASS, "User get text message added success");
    }

    @And("User input the hour is over with a letter")
    public void user_input_the_hour_is_over_with_a_letter() {
        paramShifting.getInputJamSelesai("Test Jam");
        extentTest.log(LogStatus.PASS, "User input the hour is over with a letter");
    }

    //Edit data - parameter shifting
    @Given("User input data in search text box")
    public void user_input_data_in_search_text_box(){
        paramShifting.getInputSearach("121" +Keys.ENTER);
        extentTest.log(LogStatus.PASS, "User input data in search text box");
    }
    @When("User click button plus")
    public void user_click_button_plus(){
        paramShifting.clickButtonPlus();
        extentTest.log(LogStatus.PASS, "User click button plus");
    }
    @And("User click button edit data")
    public void user_click_button_edit_data(){
        paramShifting.clickButtonEdit();
        extentTest.log(LogStatus.PASS, "User click button edit data");
    }
    @And("User input unit null")
    public void user_input_unit_null(){
        paramShifting.inputUnitNull();
        extentTest.log(LogStatus.PASS, "User input unit null");
    }
    @Then("User get text message edit success")
    public void user_get_text_message_edit_success(){
        paramShifting.getTxtAddSuccess();
        Assert.assertEquals(paramShifting.getTxtAddSuccess(), "Success!");
        extentTest.log(LogStatus.PASS, "User get text message edit success");
    }

    @And("User clear name shift")
    public void user_clear_name_shift(){
        paramShifting.clearNameShift();
        extentTest.log(LogStatus.PASS, "User clear name shift");
    }
    @And("User clear start time")
    public void user_name_start_time(){
        paramShifting.getClearStartTime();
        extentTest.log(LogStatus.PASS, "User clear start time");
    }
    @And("User clear the hour is over")
    public void user_clear_the_hour_is_over(){
        paramShifting.getClearEndTime();
        extentTest.log(LogStatus.PASS, "User clear the hour is over");
    }
    @And("User input unit new")
    public void user_input_unit_new(){
        paramShifting.setUnit();
        paramShifting.getInputUnit("Per" +Keys.ENTER);
        extentTest.log(LogStatus.PASS, "User input unit new");
    }
    @And("User input name shift new")
    public void user_input_name_shift_new(){
        paramShifting.getInputNamaShift("Shift Malam");
        extentTest.log(LogStatus.PASS, "User input name shift new");
    }
    @And("User input start time new")
    public void user_input_start_time_new(){
        paramShifting.getInputJamMulai("06:00");
        extentTest.log(LogStatus.PASS, "User input start time new");
    }
    @And("User input the hour is over new")
    public void user_input_the_hour_is_over_new() {
        paramShifting.getInputJamSelesai("20:00");
        extentTest.log(LogStatus.PASS, "User input the hour is over new");
    }

    //Delete - Data Paramater Shifting
    @And ("User click button delete")
    public void user_click_button_delete(){
        paramShifting.clickBtnDelete();
        extentTest.log(LogStatus.PASS, "User click button delete");
    }
    @And("User click button ok in alert")
    public void user_click_button_ok_in_alert(){
        DriverSingleton.delay(5);
        paramShifting.clickAlert();
        extentTest.log(LogStatus.PASS, "User click button ok in alert");
    }
    @Then("User get text message delete success")
    public void user_get_text_message_delete_success(){
        paramShifting.getTxtAddSuccess();
        Assert.assertEquals(paramShifting.getTxtAddSuccess(),"Success!");
        extentTest.log(LogStatus.PASS, "User get text message delete success");
    }

}
