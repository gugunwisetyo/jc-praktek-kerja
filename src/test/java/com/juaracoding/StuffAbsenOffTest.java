package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.StaffAbsenOffPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class StuffAbsenOffTest {
    private static WebDriver driver;
    static ExtentTest extentTest;
    private static StaffAbsenOffPage staffAbsenOffPage = new StaffAbsenOffPage();

    public StuffAbsenOffTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("user login as staff off")
    public void user_login_as_staff_off(){
        staffAbsenOffPage.setUsername("D6190874");
        staffAbsenOffPage.setPassword("2001-01-08");
        DriverSingleton.delay(3);
        staffAbsenOffPage.setLoginBtn();
        extentTest.log(LogStatus.PASS, "user login as staff");
    }
    @And("user click privilege menu off")
    public void user_click_privilege_menu_off(){
        staffAbsenOffPage.setPrivilegeStaff();
        extentTest.log(LogStatus.PASS, "user click privilege menu");
    }

    @And("user click absen off")
    public void user_click_absen_off(){
        staffAbsenOffPage.setAbsenOffMenu();
        extentTest.log(LogStatus.PASS, "user click absen off");
    }

    @Then("user get text header off")
    public void user_get_text_header_off(){
        DriverSingleton.delay(3);
        Assert.assertEquals(staffAbsenOffPage.getHeader(),"Absen Off");
        extentTest.log(LogStatus.PASS, "user get text header");
    }

    @And("user input valid devisi off")
    public void user_input_valid_devisi_off(){
        staffAbsenOffPage.setDevisi("Attraction");
        extentTest.log(LogStatus.PASS, "user input valid devisi");
    }
    @And("user input valid devisi off as call center")
    public void user_input_valid_devisi_off_as_call_center(){
        staffAbsenOffPage.setDevisi("Call Center");
        extentTest.log(LogStatus.PASS, "user input valid devisi");
    }

    @And("user input valid shift name off")
    public void user_input_valid_shift_name_off(){
        staffAbsenOffPage.setShiftName("Non Shift");
        extentTest.log(LogStatus.PASS, "user input valid shift name");
    }

    @And("user not input shift name off")
    public void user_not_input_shift_name_off(){
//        staffAbsenOffPage.setShiftName("Non Shift");
        extentTest.log(LogStatus.PASS, "user not input shift name");
    }

    @And("user input valid absen type off")
    public void user_input_valid_absen_type_off(){
        staffAbsenOffPage.setAbsenType("WFH");
        extentTest.log(LogStatus.PASS, "user input valid absen type");
    }
    @And("user input valid keterangan off")
    public void user_input_valid_keterangan_off(){
        staffAbsenOffPage.setKeterangan("izin off test automation");
        extentTest.log(LogStatus.PASS, "user input keterangan");
    }

    @And("user click submit absen off")
    public void user_click_submit_absen_off(){
        staffAbsenOffPage.setSubmitBtn();
        extentTest.log(LogStatus.PASS, "user click submit btn");
    }

    @And("user upload foto off")
    public void user_upload_foto_off(){
        staffAbsenOffPage.setFileBtn("C:\\Users\\Aldi Triavin\\Downloads\\Ai Generate\\test2.jpeg");
        extentTest.log(LogStatus.PASS, "user upload foto");
    }

    @Given("user click hyperlink off")
    public void user_click_hyperlink_off(){
        staffAbsenOffPage.setHyperlink();
        extentTest.log(LogStatus.PASS, "user upload foto");
    }

    @And("user get alert absen off")
    public void user_get_alert_absen_off() {
        try {
            driver.switchTo().alert().accept();
            Assert.assertTrue(true, "Alert accepted successfully");
            extentTest.log(LogStatus.PASS, "user get alert message");
        } catch (NoAlertPresentException e) {
            Assert.fail("No alert present");
            extentTest.log(LogStatus.FAIL, "user don't get alert message");
        }
    }

    @Then("user get validation off")
    public void user_get_validation_off(){
        driver.switchTo();
//        Assert.assertEquals(staffAbsenOffPage.getFileFill(),"False");
//        Assert.assertEquals(staffAbsenOffPage.getDevisiFill(),"False");
//        Assert.assertEquals(staffAbsenOffPage.getShiftNameFill(),"False");
//        Assert.assertEquals(staffAbsenOffPage.getAbsenTypeFill(),"False");
//        if (staffAbsenOffPage.getDevisiFill().isEmpty() || staffAbsenOffPage.getShiftNameFill().isEmpty() || staffAbsenOffPage.getAbsenTypeFill().isEmpty() || staffAbsenOffPage.getFileFill().isEmpty()){
//            extentTest.log(LogStatus.PASS, "user get alert \"fill this field\"");
//        } else {
//            extentTest.log(LogStatus.FAIL, "user not get alert \"fill this field\"");
//        }


//        if (staffAbsenOffPage.getFileFill().equals("rgba(112, 116, 120, 1)")){
//            extentTest.log(LogStatus.PASS, "user get alert \"please select file.\"");
//        } else if (staffAbsenOffPage.getDevisiFill().equals("--Pilih--")) {
//            extentTest.log(LogStatus.PASS, "user get alert \"please select item in the list.\"");
//        }else if (staffAbsenOffPage.getShiftNameFill().equals("--Pilih--")) {
//            extentTest.log(LogStatus.PASS, "user get alert \"please select item in the list.\"");
//        }else if (staffAbsenOffPage.getAbsenTypeFill().equals("--Pilih--")) {
//            extentTest.log(LogStatus.PASS, "user get alert \"please select item in the list.\"");
//        }else if (staffAbsenOffPage.getTypeShiftFill().equals("--Pilih--")) {
//            extentTest.log(LogStatus.PASS, "user get alert \"please select item in the list.\"");
//        } else if (staffAbsenOffPage.getHeader().equals("Input Data")) {
//            extentTest.log(LogStatus.PASS, "Data Berhasil diinput");
//        } else {
//            extentTest.log(LogStatus.FAIL, "user not get alert");
//        }

//        Assert.assertEquals(staffAbsenOffPage.getDevisiFill(),"Fail");
        if (staffAbsenOffPage.getFileFill().equals("rgba(112, 116, 120, 1)")){
            extentTest.log(LogStatus.PASS, "user get alert \"please select file.\"");
        } else if (staffAbsenOffPage.getDevisiFill().equals("---Pilih---")
                || staffAbsenOffPage.getShiftNameFill().equals("---Pilih---")
                || staffAbsenOffPage.getShiftNameFill().equals("null")
                || staffAbsenOffPage.getAbsenTypeFill().equals("---Pilih---")
                || staffAbsenOffPage.getTypeShiftFill().equals("---Pilih---")) {
            extentTest.log(LogStatus.PASS, "user get alert \"please select item in the list.\"");
        } else if (staffAbsenOffPage.getHeader().equals("Input Data")) {
            extentTest.log(LogStatus.PASS, "Data Berhasil diinput");
        } else if (staffAbsenOffPage.getHeader().equals("Dashboard")){
            extentTest.log(LogStatus.PASS, "user back to dashboard page");
        } else {
            extentTest.log(LogStatus.FAIL, "something wrong (user not get alert or data fail to input");
        }
    }

    @Given("user click profile button absen off")
    public void user_click_profile_button_absen_off(){
        staffAbsenOffPage.setProfile();
        extentTest.log(LogStatus.PASS, "user click profile button");
    }

    @And("user click logout button absen off")
    public void user_click_logout_button_absen_off(){
        staffAbsenOffPage.setLogoutBtn();
        extentTest.log(LogStatus.PASS, "user click logout button");
    }




}
