package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.AbsenStaffPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AbsenStaffTest {
    private static WebDriver driver;
    static ExtentTest extentTest;
    static AbsenStaffPage absenStaffPage = new AbsenStaffPage();
    public AbsenStaffTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    @Given("user login")
    public void user_login(){
        absenStaffPage.accountMasuk();
        absenStaffPage.setAccount();
        extentTest.log(LogStatus.PASS, "user login");
    }
    @And("user click laporan kegiatan")
    public void user_click_laporan_kegiatan(){
        absenStaffPage.setKegiatanBtn();
        extentTest.log(LogStatus.PASS, "user click laporan kegiatan");
    }

    @And("user click absen masuk")
    public void user_click_absen_masuk(){
        absenStaffPage.setMasukBtn();
        extentTest.log(LogStatus.PASS, "user click absen masuk");
    }

    @Then("user meet absen masuk page")
    public void user_meet_absen_masuk_page(){
        DriverSingleton.delay(3);
        Assert.assertEquals(absenStaffPage.getMasukHeader(), "Absen Masuk");
        extentTest.log(LogStatus.PASS, "user meet absen masuk page");
    }

    @Given("user upload selfie")
    public void user_upload_selfie(){
        absenStaffPage.setSelfie();
        extentTest.log(LogStatus.PASS, "user upload selfie");
    }

    @And("user pilih divisi")
    public void user_pilih_divisi(){
        absenStaffPage.setDivisi();
        extentTest.log(LogStatus.PASS, "user pilih divisi");
    }

    @And("user pilih nama shift")
    public void user_pilih_nama_shift(){
        absenStaffPage.setShift();
        absenStaffPage.setClickNamaShift();
        extentTest.log(LogStatus.PASS, "user pilih nama shift");
    }

    @And("user pilih tipe absen")
    public void user_pilih_tipe_absen(){
        absenStaffPage.setTipeAbsen();
        extentTest.log(LogStatus.PASS, "user pilih tipe absen");
    }

    @And("user mengisi keterangan")
    public void user_mengisi_keterangan(){
        absenStaffPage.setKeterangan();
        extentTest.log(LogStatus.PASS, "user mengisi keterangan");
    }

    @And("user click submit button")
    public void user_click_submit_button(){
        absenStaffPage.setSubmitMasuk();
        extentTest.log(LogStatus.PASS, "user click submit button");
    }

    @Then("user get respond page")
    public void user_get_respond_page(){
        DriverSingleton.delay(3);
        Assert.assertEquals(absenStaffPage.getRespondPage(), "Input Data");
        extentTest.log(LogStatus.PASS, "user get respond page");
    }

    @Given("user click hyperlink text")
    public void user_click_hyperlink_text(){
        absenStaffPage.setHyperlink();
        extentTest.log(LogStatus.PASS, "user click hyperlink text");
    }

    @And("user meet alert")
    public void user_meet_alert(){
        try {
            driver.switchTo().alert().accept();
            Assert.assertTrue(true, "Alert accepted successfully");
            extentTest.log(LogStatus.PASS, "user get alert message");
        } catch (NoAlertPresentException e) {
            Assert.fail("No alert present");
            extentTest.log(LogStatus.FAIL, "user dont get alert message");
        }
    }

    @Then("user meet dashboard page")
    public void user_meet_dashboard_page(){
        DriverSingleton.delay(3);
        Assert.assertEquals(absenStaffPage.getRespondPage(), "Dashboard");
        extentTest.log(LogStatus.PASS, "user meet dashboard page");
    }

    @Given("login with account done masuk")
    public void login_with_account_done_masuk(){
        absenStaffPage.setOut();
        absenStaffPage.accountMasuk();
        absenStaffPage.setAccount();
        extentTest.log(LogStatus.PASS, "login with account done masuk");
    }

    @And("user get alert message")
    public void user_get_alert_message(){
        try {
            driver.switchTo().alert().accept();
            Assert.assertTrue(true, "Alert accepted successfully");
            extentTest.log(LogStatus.PASS, "user get alert message");
        } catch (NoAlertPresentException e) {
            Assert.fail("No alert present");
            extentTest.log(LogStatus.FAIL, "user dont get alert message");
        }
    }

    @Given("login with account done izin")
    public void login_with_account_done_izin(){
        absenStaffPage.setOut();
        absenStaffPage.accountIzin();
        absenStaffPage.setAccount();
        extentTest.log(LogStatus.PASS, "login with account done izin");
    }

    @Given("login with account done sakit")
    public void login_with_account_done_sakit(){
        absenStaffPage.setOut();
        absenStaffPage.accountSakit();
        absenStaffPage.setAccount();
        extentTest.log(LogStatus.PASS, "login with account done sakit");
    }

    @Given("user login masukv2")
    public void user_login_masukv2(){
        absenStaffPage.setOut();
        absenStaffPage.setUsername("D6220404");
        absenStaffPage.setPassword("1996-09-29");
        absenStaffPage.setLoginBtn();
        absenStaffPage.setAccount();
        extentTest.log(LogStatus.PASS, "user login masuk second account");
    }

    @Then("user get alert select an item")
    public void user_get_alert_select_an_item(){
        Assert.assertEquals(absenStaffPage.getAttribut(), "true");
        absenStaffPage.setAccount();
        extentTest.log(LogStatus.PASS, "user get alert select an item");
    }
}
