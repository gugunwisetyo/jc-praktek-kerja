package com.juaracoding;

import com.juaracoding.pages.AbsenMasukPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AbsenMasukTest {
    private static WebDriver driver;
    static ExtentTest extentTest;
    private static AbsenMasukPage absenMasukPage = new AbsenMasukPage();
    public AbsenMasukTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("user click laporan kegiatan")
    public void user_click_laporan_kegiatan(){
        absenMasukPage.setKegiatanBtn();
        extentTest.log(LogStatus.PASS, "user click laporan kegiatan");
    }

    @And("user click absen masuk")
    public void user_click_absen_masuk(){
        absenMasukPage.setMasukBtn();
        extentTest.log(LogStatus.PASS, "user click absen masuk");
    }

    @Then("user meet absen masuk page")
    public void user_meet_absen_masuk_page(){
        Assert.assertEquals(absenMasukPage.getMasukHeader(), "Absen Masuk");
        extentTest.log(LogStatus.PASS, "user meet absen masuk page");
    }

    @Given("user upload selfie")
    public void user_upload_selfie(){
        absenMasukPage.setSelfie();
        extentTest.log(LogStatus.PASS, "user upload selfie");
    }

    @And("user pilih divisi")
    public void user_pilih_divisi(){
        absenMasukPage.setDivisi();
        extentTest.log(LogStatus.PASS, "user pilih divisi");
    }

    @And("user pilih nama shift")
    public void user_pilih_nama_shift(){
        absenMasukPage.setShift();
        extentTest.log(LogStatus.PASS, "user pilih nama shift");
    }

    @And("user pilih tipe absen")
    public void user_pilih_tipe_absen(){
        absenMasukPage.setTipeAbsen();
        extentTest.log(LogStatus.PASS, "user pilih tipe absen");
    }

    @And("user mengisi keterangan")
    public void user_mengisi_keterangan(){
        absenMasukPage.setKeterangan();
        extentTest.log(LogStatus.PASS, "user mengisi keterangan");
    }

    @And("user click submit button")
    public void user_click_submit_button(){
        absenMasukPage.setSubmitMasuk();
        extentTest.log(LogStatus.PASS, "user click submit button");
    }

    @Then("user get respond page")
    public void user_get_respond_page(){
        Assert.assertEquals(absenMasukPage.getRespondPage(), "Input Result");
        extentTest.log(LogStatus.PASS, "user get respond page");
    }

    @Given("user click hyperlink text")
    public void user_click_hyperlink_text(){
        absenMasukPage.setHyperlink();
        extentTest.log(LogStatus.PASS, "user click hyperlink text");
    }
}
