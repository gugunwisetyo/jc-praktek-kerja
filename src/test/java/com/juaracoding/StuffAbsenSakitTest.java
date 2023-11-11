package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.StaffAbsenSakitPage;
import com.juaracoding.utils.Constants;
import com.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class StuffAbsenSakitTest {
    private static WebDriver driver;
    static ExtentTest extentTest;
    private static StaffAbsenSakitPage staffAbsenSakitPage = new StaffAbsenSakitPage();

    public StuffAbsenSakitTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("user click privilege menu")
    public void user_click_privilege_menu(){
        staffAbsenSakitPage.setUsername("D6210598");
        staffAbsenSakitPage.setPassword("1999-04-01");
        DriverSingleton.delay(3);
        staffAbsenSakitPage.setLoginBtn();
        DriverSingleton.delay(3);
        staffAbsenSakitPage.setPrivilegeStaff();
        extentTest.log(LogStatus.PASS, "user click privilege menu");
    }

    @And("user click absen sakit")
    public void user_click_absen_sakit(){
        staffAbsenSakitPage.setAbsenSakitMenu();
        extentTest.log(LogStatus.PASS, "user click absen sakit");
    }

    @Then("user get text header")
    public void user_get_text_header(){
        Assert.assertEquals(staffAbsenSakitPage.getHeader(),"Absen Sakit");
        extentTest.log(LogStatus.PASS, "user get text header");
    }

    @And("user input valid devisi")
    public void user_input_valid_devisi(){
//        staffAbsenSakitPage.setDevisi("Call Center");
        staffAbsenSakitPage.setDevisi("Attraction");
        extentTest.log(LogStatus.PASS, "user input valid devisi");
    }

    @And("user input valid shift name")
    public void user_input_valid_shift_name(){
        staffAbsenSakitPage.setShiftName("Non Shift");
        extentTest.log(LogStatus.PASS, "user input valid shift name");
    }
    @And("user input valid absen type")
    public void user_input_valid_absen_type(){
        staffAbsenSakitPage.setAbsenType("WFH");
        extentTest.log(LogStatus.PASS, "user input valid absen type");
    }
    @And("user input valid keterangan")
    public void user_input_valid_keterangan(){
        staffAbsenSakitPage.setKeterangan("izin sakit test automation");
        extentTest.log(LogStatus.PASS, "user input keterangan");
    }

    @And("user click submit absen sakit")
    public void user_click_submit_absen_sakit(){
        staffAbsenSakitPage.setSubmitBtn();
        extentTest.log(LogStatus.PASS, "user click submit btn");
    }

    @And("user upload foto")
    public void user_upload_foto(){
        staffAbsenSakitPage.setFileBtn("C:\\Users\\Aldi Triavin\\Downloads\\Ai Generate\\test1.jpeg");
        extentTest.log(LogStatus.PASS, "user upload foto");
    }

    @Then("user get validation sakit")
    public void user_get_validation_sakit(){
//        Assert.assertEquals(staffAbsenSakitPage.getFileFill(),"False");
        Assert.assertEquals(staffAbsenSakitPage.getDevisiFill(),"False");
//        Assert.assertEquals(staffAbsenSakitPage.getShiftNameFill(),"False");
//        Assert.assertEquals(staffAbsenSakitPage.getAbsenTypeFill(),"False");
//        if (staffAbsenSakitPage.getDevisiFill().isEmpty() || staffAbsenSakitPage.getShiftNameFill().isEmpty() || staffAbsenSakitPage.getAbsenTypeFill().isEmpty() || staffAbsenSakitPage.getFileFill().isEmpty()){
//            extentTest.log(LogStatus.PASS, "user get alert \"fill this field\"");
//        } else {
//            extentTest.log(LogStatus.FAIL, "user not get alert \"fill this field\"");
//        }

//        if (staffAbsenSakitPage.getFileFill().equals("rgba(112, 116, 120, 1)")){
//            extentTest.log(LogStatus.PASS, "user get alert \"please select file\"");
//        } else if (staffAbsenSakitPage.getDevisiFill().equals()) {
//
//        }
    }


}
