package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.AdminReportAbsenMasukPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ReportAbsenMasukTest {
    private static WebDriver driver;
    static ExtentTest extentTest;
    private static AdminReportAbsenMasukPage adminReportAbsenMasukPage = new AdminReportAbsenMasukPage();

    public String flagDate;

    public ReportAbsenMasukTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("user login as admin")
    public void user_login_as_admin(){
        adminReportAbsenMasukPage.setUsername("admin_tms");
        adminReportAbsenMasukPage.setPassword("d1k4@passw0rd");
        DriverSingleton.delay(3);
        adminReportAbsenMasukPage.setLoginBtn();
        extentTest.log(LogStatus.PASS, "user login as staff");
    }
    @And("user click privilege report absen masuk")
    public void user_click_privilege_report_absen_masuk(){
        adminReportAbsenMasukPage.setPrivilegeReportAbsen();
        DriverSingleton.delay(1);
        extentTest.log(LogStatus.PASS, "user click privilege menu");
    }

    @And("user click menu report absen masuk")
    public void user_click_menu_report_absen_masuk(){
        adminReportAbsenMasukPage.setMenuReportAbsenMasuk();
        extentTest.log(LogStatus.PASS, "user click report absen masuk");
    }

    @Then("user get text header report absen masuk")
    public void user_get_text_header_report_absen_masuk(){
        DriverSingleton.delay(3);
        Assert.assertEquals(adminReportAbsenMasukPage.getHeader(),"Report Absen Masuk");
        extentTest.log(LogStatus.PASS, "user get text header");
    }

    @And("user input valid position masuk")
    public void user_input_valid_position_masuk(){
        adminReportAbsenMasukPage.setPosition("ALL");
        extentTest.log(LogStatus.PASS, "user input valid position");
    }
    @And("user input valid branch masuk")
    public void user_input_valid_branch_masuk(){
        adminReportAbsenMasukPage.setBranch("ALL");
        extentTest.log(LogStatus.PASS, "user input valid branch");
    }

    @And("user input valid unit masuk")
    public void user_input_valid_unit_masuk(){
        adminReportAbsenMasukPage.setUnit("ALL");
        extentTest.log(LogStatus.PASS, "user input valid unit");
    }

    @And("user input valid start date masuk")
    public void user_input_valid_start_date_masuk(){
        adminReportAbsenMasukPage.setStartDate("2023-10-31");
        flagDate = "2023-10-31";
        extentTest.log(LogStatus.PASS, "user input valid start date");
    }
    @And("user input invalid start date masuk")
    public void user_input_invalid_start_date_masuk(){
        adminReportAbsenMasukPage.setStartDate("");
        flagDate = "";
        extentTest.log(LogStatus.PASS, "user input empty start date");
    }

    @And("user input valid end date masuk")
    public void user_input_valid_end_date_masuk(){
        adminReportAbsenMasukPage.setEndDate("2023-11-14");
        extentTest.log(LogStatus.PASS, "user input valid end date");
    }
    @And("user click export data absen masuk")
    public void user_click_export_data_absen_masuk(){
        adminReportAbsenMasukPage.setExportBtn();
        extentTest.log(LogStatus.PASS, "user click export button");
    }

    @And("user input invalid end date masuk")
    public void user_input_invalid_end_date_masuk(){
        adminReportAbsenMasukPage.setStartDate("");
        extentTest.log(LogStatus.PASS, "user input empty end date");
    }

    @And("user get alert report absen masuk")
    public void user_get_alert_absen_masuk() {
        try {
            driver.switchTo().alert().accept();
            Assert.assertTrue(true, "Alert accepted successfully");
            extentTest.log(LogStatus.PASS, "user get alert message");
        } catch (NoAlertPresentException e) {
            Assert.fail("No alert present");
            extentTest.log(LogStatus.FAIL, "user don't get alert message");
        }
    }

    @Then("user get validation report masuk")
    public void user_get_validation_report_masuk(){

        try {
            driver.switchTo().alert().accept();
            extentTest.log(LogStatus.PASS, "user get alert message");
        } catch (NoAlertPresentException e) {
            if (flagDate.isEmpty()) {
                extentTest.log(LogStatus.FAIL, "get data export");
            } else {
                extentTest.log(LogStatus.PASS, "user get data export");
            }
        }
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

//        Assert.assertEquals(driver.switchTo().alert().getText(),"Fail");
//        if (adminReportAbsenMasukPage.getPositionFill().equals("-- Position --")
//                || adminReportAbsenMasukPage.getBranchFill().equals("-- Branch --")
//                || adminReportAbsenMasukPage.getUnitFill().equals("-- Unit --")
//                || adminReportAbsenMasukPage.getStartDateFill().equals(" ")
//                || adminReportAbsenMasukPage.getEndDateFill().equals(" ")
//                && driver.switchTo().alert().getText().equals("No data...!!!")) {
//            driver.switchTo().alert().accept();
//            extentTest.log(LogStatus.FAIL, "user don't get alert message");
//        } else if (adminReportAbsenMasukPage.getPositionFill().equals("ALL")
//                && adminReportAbsenMasukPage.getBranchFill().equals("ALL")
//                && adminReportAbsenMasukPage.getUnitFill().equals("ALL")
//                && adminReportAbsenMasukPage.getStartDateFill().equals("2023-10-31")
//                && adminReportAbsenMasukPage.getEndDateFill().equals("2023-11-14")) {
//            extentTest.log(LogStatus.PASS, "Data Berhasil diexport");
//        } else {
//            extentTest.log(LogStatus.FAIL, "something wrong (user not get alert or data get export");
//        }


    }

    @And("user click profile button report masuk")
    public void user_click_profile_button_report_masuk(){
        adminReportAbsenMasukPage.setProfile();
        extentTest.log(LogStatus.PASS, "user click profile button");
    }

    @Then("user click logout button report masuk")
    public void user_click_logout_button_report_masuk(){
        adminReportAbsenMasukPage.setLogoutBtn();
        extentTest.log(LogStatus.PASS, "user click logout button");
    }
    @Then("user get data table report masuk")
    public void user_get_data_table_report_masuk(){
        if(adminReportAbsenMasukPage.getDataTable().equals("dataTables_empty")){
            extentTest.log(LogStatus.FAIL, "table is empty");
        } else {
            extentTest.log(LogStatus.PASS, "user get data on table");
        }
    }

}
