package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import com.mongodb.DBRef;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasukPage {
    private WebDriver driver;

    public MasukPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //locator
    @FindBy(xpath = "//span[normalize-space()='Laporan Kegiatan']")
    private WebElement kegiatanBtn;

    @FindBy(xpath = "//a[normalize-space()='Absen Masuk']")
    private WebElement masukBtn;

    @FindBy(xpath = "//input[@id='file']")
    private WebElement selfie;

    @FindBy(xpath = "//select[@id='divisi']")
    private WebElement divisi;

    @FindBy(xpath = "//select[@id='type_shift']")
    private WebElement shift;

    //@FindBy(xpath = "")
    // WebElement ;

    public void setKegiatanBtn(){
        this.kegiatanBtn.click();
    }

    public void setMasukBtn(){
        this.masukBtn.click();
    }

    public void setSelfie(){
        this.selfie.sendKeys("C:\\Users\\ASUS\\Downloads\\Picture\\6_78_388_388_0_60_0.png");
    }

    public void setDivisi(){
        this.divisi.sendKeys("Call Center");
    }

    public void setShift(){
        this.shift.sendKeys("Call Center 1");
    }
}
