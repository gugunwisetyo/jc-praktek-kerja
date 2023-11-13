package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbsenStaffPage {
    private WebDriver driver;

    public AbsenStaffPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //locator
    @FindBy(xpath = "//span[normalize-space()='Laporan Kegiatan']")
    private WebElement kegiatanBtn;

    @FindBy(xpath = "//a[normalize-space()='Absen Masuk']")
    private WebElement masukBtn;


    @FindBy(xpath = "//h1[@class='page-header']")
    private WebElement masukHeader;

    @FindBy(xpath = "//input[@id='file']")
    private WebElement selfie;

    @FindBy(xpath = "//select[@id='divisi']")
    private WebElement divisi;

    @FindBy(xpath = "//div[@class='filter-option-inner-inner']")
    private WebElement namaShift;

    @FindBy(xpath = "//span[normalize-space()='D1 (10:00 - 18:00)']")
    private WebElement clickNamaShift;

    @FindBy(xpath = "//select[@id='absen_type']")
    private WebElement tipeAbsen;

    @FindBy(xpath = "//textarea[@name='keterangan']")
    private WebElement keterangan;

    @FindBy(xpath = "//input[@value='Submit']")
    private WebElement submitMasuk;

    @FindBy(xpath = "//h1[@class='page-header']")
    private WebElement respondPage;

    @FindBy(xpath = "//a[@class='back']")
    private WebElement hyperlink;

    @FindBy(xpath = "//input[@placeholder='NIK']")
    private WebElement username; //admin_tms //D6190874

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;  //d1k4@passw0rd //2001-01-08

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginBtn;

    @FindBy(xpath = "//span[normalize-space()='Logout']")
    private WebElement out;

    public void setKegiatanBtn(){
        this.kegiatanBtn.click();
    }

    public void setMasukBtn(){
        this.masukBtn.click();
    }

    public String getMasukHeader(){
        return masukHeader.getText();
    }

    public void setSelfie(){
        this.selfie.sendKeys("C:\\Users\\ASUS\\Downloads\\Picture\\6_78_388_388_0_60_0.png");
    }

    public void setDivisi(){
        this.divisi.sendKeys("Attraction");
    }

    public void setShift(){
        this.namaShift.click();
    }

    public void setClickNamaShift(){
        this.clickNamaShift.click();
    }

    public void setTipeAbsen(){
        this.tipeAbsen.sendKeys("WFH (WORK FROM HOME)");
    }

    public void setKeterangan(){
        this.keterangan.sendKeys("Test Masuk");
    }

    public void setSubmitMasuk(){
        this.submitMasuk.click();
    }

    public String getRespondPage(){
        return respondPage.getText();
    }

    public void setHyperlink(){
        this.hyperlink.click();
    }

    public void setAccount(){
        this.kegiatanBtn.click();
        this.masukBtn.click();
    }

    public String getAttribut(){
        return divisi.getAttribute("required");
    }

    public void setUsername(String username){
        this.username.sendKeys(username);
    }

    public void setPassword(String password){
        this.password.sendKeys(password);
    }

    public void setLoginBtn(){
        this.loginBtn.click();
    }

    public void setOut(){
        this.out.click();
    }

    public void accountMasuk(){
        this.setUsername("D6190874");
        this.setPassword("2001-01-08");
        this.setLoginBtn();
    }

    public void accountIzin(){
        this.setUsername("D8222040");
        this.setPassword("1996-03-05");
        this.setLoginBtn();
    }

    public void accountSakit(){
        this.setUsername("D8222006");
        this.setPassword("1999-04-16");
        this.setLoginBtn();
    }

    public void clearField(){
        this.selfie.clear();
        this.divisi.clear();
        this.namaShift.clear();
        this.tipeAbsen.clear();
        this.keterangan.clear();
    }
}
