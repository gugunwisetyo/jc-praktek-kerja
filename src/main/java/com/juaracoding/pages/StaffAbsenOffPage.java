package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class StaffAbsenOffPage extends LoginPage{
    private WebDriver driver;
    private Select select;


    public StaffAbsenOffPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //locator
    @FindBy(xpath = "//span[normalize-space()='Laporan Kegiatan']")
    private WebElement privilegeStaff; //dropdown menu laporan kegiatan

    @FindBy(xpath = "//a[normalize-space()='Absen Off']")
    private WebElement absenOffMenu;  //menu absen off pada dropdown menu

    @FindBy(xpath = "//h1[@class='page-header']")
    private WebElement header;  //header

    @FindBy(xpath = "//input[@id='file']")
    private WebElement fileBtn; //button untuk upload file

    @FindBy(xpath = "//select[@id='divisi']")
    private WebElement devisi;  //select menu devisi

    @FindBy(xpath = "//select[@id='shift_name']")
    private WebElement shiftName;   //select menu shift_name

    @FindBy(xpath = "//select[@id='absen_type']")
    private WebElement absenType;   //select menu absen_type

    @FindBy(xpath = "//select[@id='type_shift']")
    private WebElement typeshift;   //select menu absen_type

    @FindBy(xpath = "//textarea[@name='keterangan']")
    private WebElement keterangan; //textare keterangan

    @FindBy(xpath = "//input[@value='Submit']")
    private WebElement submitBtn;

    @FindBy(xpath = "//a[@class='back']")
    private WebElement hyperlink;

    public void setPrivilegeStaff(){
        this.privilegeStaff.click();
    }

    public void setAbsenOffMenu(){
        this.absenOffMenu.click();
    }

    public void setFileBtn(String file){
        this.fileBtn.sendKeys(file);
    }

    public void setDevisi(String devisi){
        select = new Select(this.devisi);
        select.selectByValue(devisi);
    }

    public void setShiftName(String shiftname){
        select = new Select(this.shiftName);
        select.selectByValue(shiftname);
    }

    public void setAbsenType(String absenType){
        select = new Select(this.absenType);
        select.selectByValue(absenType);
        select.getOptions();

    }

    public void setKeterangan(String keterangan){
        this.keterangan.sendKeys(keterangan);
    }

    public void setSubmitBtn(){
        this.submitBtn.click();
    }
    public void setHyperlink(){
        this.hyperlink.click();
    }

    public String getFileFill(){
//        return fileBtn.getAttribute("required");
        return fileBtn.getCssValue("color");
    }

    public String getDevisiFill(){
//        return devisi.getAttribute("required");
//        return devisi.getText();
        select = new Select(this.devisi);
        return select.getFirstSelectedOption().getText();
    }

    public String getShiftNameFill(){
//        return shiftName.getAttribute("required");
//        return shiftName.getText();
        select = new Select(this.devisi);
        if (select.getFirstSelectedOption().getText().equals("---Pilih---")){
            return "null";
        } else {
            select = new Select(this.shiftName);
            return select.getFirstSelectedOption().getText();
        }
    }

    public String getAbsenTypeFill(){
//        return absenType.getAttribute("required");
//        return absenType.getText();
        select = new Select(this.absenType);
        return select.getFirstSelectedOption().getText();
    }
    public String getTypeShiftFill(){
//        return absenType.getAttribute("required");
//        return absenType.getText();
        select = new Select(this.typeshift);
        return select.getFirstSelectedOption().getText();
    }

    public String getHeader(){
        return header.getText();
    }


}
