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
import io.cucumber.java.en.When;
import org.openqa.selenium.NoAlertPresentException;
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

    @Given("user login as staff sakit")
    public void user_login_as_staff_sakit(){
        staffAbsenSakitPage.setUsername("D6190874");
        staffAbsenSakitPage.setPassword("2001-01-08");
        DriverSingleton.delay(3);
        staffAbsenSakitPage.setLoginBtn();
        extentTest.log(LogStatus.PASS, "user login as staff");
    }
    @And("user click privilege menu sakit")
    public void user_click_privilege_menu_sakit(){
        staffAbsenSakitPage.setPrivilegeStaff();
        extentTest.log(LogStatus.PASS, "user click privilege menu");
    }

    @And("user click absen sakit")
    public void user_click_absen_sakit(){
        staffAbsenSakitPage.setAbsenSakitMenu();
        extentTest.log(LogStatus.PASS, "user click absen sakit");
    }

    @Then("user get text header sakit")
    public void user_get_text_header_sakit(){
        DriverSingleton.delay(3);
        Assert.assertEquals(staffAbsenSakitPage.getHeader(),"Absen Sakit");
        extentTest.log(LogStatus.PASS, "user get text header");
    }

    @And("user input valid devisi sakit")
    public void user_input_valid_devisi_sakit(){
        staffAbsenSakitPage.setDevisi("Attraction");
        extentTest.log(LogStatus.PASS, "user input valid devisi");
    }
    @And("user input valid devisi sakit as call center")
    public void user_input_valid_devisi_sakit_as_call_center(){
        staffAbsenSakitPage.setDevisi("Call Center");
        extentTest.log(LogStatus.PASS, "user input valid devisi");
    }

    @And("user input valid shift name sakit")
    public void user_input_valid_shift_name_sakit(){
        staffAbsenSakitPage.setShiftName("Non Shift");
        extentTest.log(LogStatus.PASS, "user input valid shift name");
    }

    @And("user not input shift name sakit")
    public void user_not_input_shift_name_sakit(){
//        staffAbsenSakitPage.setShiftName("Non Shift");
        extentTest.log(LogStatus.PASS, "user not input shift name");
    }

    @And("user input valid absen type sakit")
    public void user_input_valid_absen_type_sakit(){
        staffAbsenSakitPage.setAbsenType("WFH");
        extentTest.log(LogStatus.PASS, "user input valid absen type");
    }
    @And("user input valid keterangan sakit")
    public void user_input_valid_keterangan_sakit(){
        staffAbsenSakitPage.setKeterangan("izin sakit test automation");
        extentTest.log(LogStatus.PASS, "user input keterangan");
    }

    @And("user click submit absen sakit")
    public void user_click_submit_absen_sakit(){
        staffAbsenSakitPage.setSubmitBtn();
        extentTest.log(LogStatus.PASS, "user click submit btn");
    }

    @And("user upload foto sakit")
    public void user_upload_foto_sakit(){
        staffAbsenSakitPage.setFileBtn("C:\\Users\\Wahidaritadi\\Documents\\ALT\\test1.png");
        extentTest.log(LogStatus.PASS, "user upload foto");
    }

    @Given("user click hyperlink sakit")
    public void user_click_hyperlink_sakit(){
        staffAbsenSakitPage.setHyperlink();
        extentTest.log(LogStatus.PASS, "user upload foto");
    }

    @And("user get alert absen sakit")
    public void user_get_alert_absen_sakit() {
        try {
            driver.switchTo().alert().accept();
            Assert.assertTrue(true, "Alert accepted successfully");
            extentTest.log(LogStatus.PASS, "user get alert message");
        } catch (NoAlertPresentException e) {
            Assert.fail("No alert present");
            extentTest.log(LogStatus.FAIL, "user don't get alert message");
        }
    }

    @Then("user get validation sakit")
    public void user_get_validation_sakit(){
        if (staffAbsenSakitPage.getDevisiFill().equals("---Pilih---")
                || staffAbsenSakitPage.getShiftNameFill().equals("---Pilih---")
                || staffAbsenSakitPage.getAbsenTypeFill().equals("---Pilih---")
                || staffAbsenSakitPage.getTypeShiftFill().equals("---Pilih---")) {
            extentTest.log(LogStatus.PASS, "user get alert \"please select item in the list.\"");
        } else if (staffAbsenSakitPage.getFileFill().equals("rgba(112, 116, 120, 1)")) {
            extentTest.log(LogStatus.PASS, "user get alert \"please select file.\"");
        }  else {
            extentTest.log(LogStatus.FAIL, "something wrong (user not get alert or data fail to input");
        }
    }

    @Then("user get validation melakukan absen sakit")
    public void user_get_validation_melakukan_absen_sakit(){
        if (staffAbsenSakitPage.getHeader().equals("Input Data")){
            extentTest.log(LogStatus.PASS, "Data Berhasil diinput");
        } else if (staffAbsenSakitPage.getHeader().equals("Dashboard")){
            extentTest.log(LogStatus.PASS, "user back to dashboard page");
        }
    }
    @Given("user click profile button absen sakit")
    public void user_click_profile_button_absen_sakit(){
        staffAbsenSakitPage.setProfile();
        extentTest.log(LogStatus.PASS, "user click profile button");
    }

    @And("user click logout button absen sakit")
    public void user_click_logout_button_absen_sakit(){
        staffAbsenSakitPage.setLogoutBtn();
        extentTest.log(LogStatus.PASS, "user click logout button");
    }


}
