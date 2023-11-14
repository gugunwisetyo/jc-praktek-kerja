package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.masteradmin.LoginPage;
import com.juaracoding.masteradmin.MnUserClientV1;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestMnUserClientV1 {

    public static ExtentTest extentTest;
    private static WebDriver driver;
    private static LoginPage loginPage = new LoginPage();
    private static MnUserClientV1 mnUserClientV1 = new MnUserClientV1();

    public TestMnUserClientV1() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    //master
    @Given("User login")
    public void user_login() {
        driver.get(Constants.URL);
        loginPage.setUsername("admin_tms");
        loginPage.setPassword("d1k4@passw0rd");
        loginPage.setLoginBtn();
    }

    @When("User click menu master")
    public void user_click_menu_master() {
        mnUserClientV1.clickMaster();
        extentTest.log(LogStatus.PASS, "User click menu master");
    }

    @And("User click menu managemen user client v1")
    public void user_click_menu_managemen_user_client_v1() {
        mnUserClientV1.clickUserClientV1();
        extentTest.log(LogStatus.PASS, "User click menu managemen user client v1");
    }

    @Then("User get txt message list user client v1")
    public void user_get_txt_message_list_user_client_v1() {
        DriverSingleton.delay(2);
        mnUserClientV1.getTxtLisUserV1();
        Assert.assertEquals(mnUserClientV1.getTxtLisUserV1(), "List user client V1");
        extentTest.log(LogStatus.PASS, "User get txt message list user client v1");
    }


    //invalid add user client input name and email null
    @Given("User click button add user")
    public void user_click_button_add_user() {
        DriverSingleton.delay(2);
        mnUserClientV1.clickBtnAdd();
        extentTest.log(LogStatus.PASS, "User click button add user");
    }

    @When("User click button save")
    public void user_click_button_save() {
        DriverSingleton.delay(2);
        mnUserClientV1.clickBtnSave();
        extentTest.log(LogStatus.PASS, "User click button save");
    }

    @Then("User get text message out field name")
    public void user_get_text_message_out_field_name() {
        Assert.assertEquals(mnUserClientV1.getTxtAlertName(), "Please fill out this field.");
        extentTest.log(LogStatus.PASS, "User get text message out field");
    }

    @Then("User get text message out field email")
    public void user_get_text_message_out_field_email() {
        Assert.assertEquals(mnUserClientV1.getTxtAlertEmail(), "Please fill out this field.");
        extentTest.log(LogStatus.PASS, "User get text message out field");
    }

    @Then("User get text message invalid email")
    public void user_get_text_message_invalid_email() {
        DriverSingleton.delay(2);
        Assert.assertEquals(mnUserClientV1.getTxtAlertEmailInvalid(),
                "Please include an '@' in the email address. 'SQAbatch11-testing.com' is missing an '@'.");
        extentTest.log(LogStatus.PASS, "User get text message invalid email");
    }

    //invalid add user client input email null
    @Given("User input full name")
    public void user_input_full_name() {
        mnUserClientV1.getInputName("SQA Batch 11 Testing");
        extentTest.log(LogStatus.PASS, "User input full name");
    }

    @And("User input email address invalid")
    public void user_input_email_address_invalid() {
        mnUserClientV1.getInputEmail("SQAbatch11-testing.com");
        extentTest.log(LogStatus.PASS, "User input email invalid");
    }

    //add user client v1 valid
    @Given("User clear input")
    public void user_clear_input() {
        mnUserClientV1.clearAll();
    }

    @When("User input email")
    public void user_input_email() {
        mnUserClientV1.getInputEmail("SQAbatch11@testing.com");
        extentTest.log(LogStatus.PASS, "User input email user");
    }

    @Then("User add get text message successful")
    public void user_add_get_text_message_successful() {
        DriverSingleton.delay(2);
        mnUserClientV1.getTxtMessageDashboard();
        Assert.assertEquals(mnUserClientV1.getTxtMessageDashboard(), "Sukses!");
        extentTest.log(LogStatus.PASS, "User get text message successful");
    }

    @Then("User get text message duplicate")
    public void user_get_text_message_duplicate() {
        DriverSingleton.delay(2);
        mnUserClientV1.getTxtMessageDashboard();
        Assert.assertEquals(mnUserClientV1.getTxtMessageDashboard(), "Gagal!");
        extentTest.log(LogStatus.PASS, "User get text message duplicate");
    }


    //button cancel
    @Given("User click button cancel")
    public void user_click_button_cancel() {
        DriverSingleton.delay(2);
        mnUserClientV1.clickBtnCancel();
        extentTest.log(LogStatus.PASS, "User click button cancel");
    }

    //button xlose tabe == x
    @Given("User click button close tab")
    public void user_click_button_close_tab() {
        mnUserClientV1.clickBtnCloseAdd();
        extentTest.log(LogStatus.PASS, "User click button close tab");

    }

    //show page
    @Given("User click button page next")
    public void user_click_button_page_next() {
        mnUserClientV1.clickBtnNextPage();
        extentTest.log(LogStatus.PASS, "User click button page next");
        DriverSingleton.delay(2);
    }

    @When("User click button page3")
    public void user_click_button_page3() {
        mnUserClientV1.clickBtnPageNumb1();
        extentTest.log(LogStatus.PASS, "User click button pag3");
        DriverSingleton.delay(2);
    }

    @And("User click button page prev")
    public void user_click_button_page_prev() {
        mnUserClientV1.clickBtnPrevPage();
        extentTest.log(LogStatus.PASS, "User click button page prev");
    }

    @And("User select show25 user")
    public void user_select_show25_user() {
        mnUserClientV1.showPage("2");
        extentTest.log(LogStatus.PASS, "User select show25 user");
        DriverSingleton.delay(2);
    }

    @And("User select show50 user")
    public void user_select_show50_user() {
        mnUserClientV1.showPage("5");
        extentTest.log(LogStatus.PASS, "User select show50 user");
        DriverSingleton.delay(2);
    }

    @And("User select show100 user")
    public void user_select_show100_user() {
        mnUserClientV1.showPage("1");
        extentTest.log(LogStatus.PASS, "User select show100 user");
        DriverSingleton.delay(3);
    }

    @Then("User get text message show page")
    public void user_get_text_message_show_page() {
        mnUserClientV1.getTxtShowPage();
        Assert.assertEquals(mnUserClientV1.getTxtShowPage(), "51");
        extentTest.log(LogStatus.PASS, "User get text message show page");
    }

    //Search
    @Given("User input data search")
    public void user_input_data_search() {
        mnUserClientV1.getInputSearch("Alif");
        extentTest.log(LogStatus.PASS, "User input data search");
    }

    @When("User click button search")
    public void user_click_button_search() {
        mnUserClientV1.clickBtnSearch();
        extentTest.log(LogStatus.PASS, "User input data search");
    }

    @Then("User get txt message searching")
    public void user_get_txt_message_searching() {
        DriverSingleton.delay(2);
        mnUserClientV1.getTxtSearch();
        Assert.assertEquals(mnUserClientV1.getTxtSearch(), "ALIF");
        extentTest.log(LogStatus.PASS, "User get txt message searching");
    }

    @Given("User click button refresh")
    public void user_click_button_refresh() {
        mnUserClientV1.clickBtnRefresh();
        extentTest.log(LogStatus.PASS, "User click button refresh");
    }

    @When("User press button enter")
    public void user_press_button_enter() {
        mnUserClientV1.btnEnter("Elva");
        extentTest.log(LogStatus.PASS, "User press button enter");
    }

    //input new email and name
    @When("User input email new")
    public void user_input_email_new() {
        mnUserClientV1.getInputEmail("automation21@test.com");
        extentTest.log(LogStatus.PASS, "User input email user new");
    }

    @Given("User input full name new")
    public void user_input_full_name_new() {
        mnUserClientV1.getInputName("automation test21");
        extentTest.log(LogStatus.PASS, "User input full name new");
    }
    @Then("User get text message total list data")
    public void user_get_text_message_total_list_data() {
        DriverSingleton.delay(2);
        mnUserClientV1.getTxtTotalList();
        Assert.assertEquals(mnUserClientV1.getTxtTotalList(), "Showing 1 to 10 of 90 entries");
        extentTest.log(LogStatus.PASS, "User get text message total list data");
    }


}

