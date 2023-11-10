package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbsenMasukPage {
    private WebDriver driver;

    public AbsenMasukPage(){
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

    @FindBy(xpath = "//select[@id='absen_type']")
     WebElement tipeAbsen;

    @FindBy(xpath = "//textarea[@name='keterangan']")
     WebElement keterangan;

    @FindBy(xpath = "//input[@value='Submit']")
     WebElement submitMasuk;

    @FindBy(xpath = "//div[@class='panel-heading ui-sortable-handle']")
     WebElement respondPage;

    @FindBy(xpath = "//a[@class='back']")
     WebElement hyperlink;

//    @FindBy(xpath = "")
//     WebElement ;

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
        this.namaShift.sendKeys("Non Shift");
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
}
