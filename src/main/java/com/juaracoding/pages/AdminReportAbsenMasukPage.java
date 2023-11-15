package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminReportAbsenMasukPage extends LoginPage{
    private WebDriver driver;
    private Select select;


    public AdminReportAbsenMasukPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //locator
    @FindBy(xpath = "//span[normalize-space()='Report Absen']")
    private WebElement privilegeReportAbsen; //dropdown menu report absen

    @FindBy(xpath = "//a[normalize-space()='Absen Masuk']")
    private WebElement menuReportAbsenMasuk;  //menu report absen absen masuk

    @FindBy(xpath = "//h4[normalize-space()='Report Absen Masuk']")
    private WebElement header;  //header

    @FindBy(xpath = "//select[@name='position']")
    private WebElement position; //select menu position

    @FindBy(xpath = "//select[@name='branch']")
    private WebElement branch;  //select menu branch

    @FindBy(xpath = "//select[@name='unit']")
    private WebElement unit;   //select menu unit

    @FindBy(xpath = "//input[@id='datepicker']")
    private WebElement startDate;   //date picker start date

    @FindBy(xpath = "//input[@id='datepicker2']")
    private WebElement endDate;   //date picker end date

    @FindBy(xpath = "//input[@name='submit']")
    private WebElement exportBtn;
    @FindBy(xpath = "//*[@id=\"data-table-default\"]/tbody/tr/td")
    private WebElement dataTable;


    public void setPrivilegeReportAbsen(){
        this.privilegeReportAbsen.click();
    }

    public void setMenuReportAbsenMasuk(){
        this.menuReportAbsenMasuk.click();
    }

    public void setPosition(String position){
        select = new Select(this.position);
        select.selectByVisibleText(position);
    }

    public void setBranch(String branch){
        select = new Select(this.branch);
        select.selectByVisibleText(branch);
    }

    public void setUnit(String unit){
        select = new Select(this.unit);
        select.selectByVisibleText(unit);
    }

    public void setStartDate(String startDate){
        this.startDate.sendKeys(startDate);

    }

    public void setEndDate(String endDate){
        this.endDate.sendKeys(endDate);
    }

    public void setExportBtn(){
        this.exportBtn.click();
    }

    public String getPositionFill(){
//        return devisi.getAttribute("required");
//        return devisi.getText();
        select = new Select(this.position);
        return select.getFirstSelectedOption().getText();
    }

    public String getBranchFill(){
//        return shiftName.getAttribute("required");
//        return shiftName.getText();
        select = new Select(this.branch);
        return select.getFirstSelectedOption().getText();
    }

    public String getUnitFill(){
//        return absenType.getAttribute("required");
//        return absenType.getText();
        select = new Select(this.unit);
        return select.getFirstSelectedOption().getText();
    }
    public String getStartDateFill(){
//        return absenType.getAttribute("required");
//        return absenType.getText();
        return this.startDate.getText();
    }
    public String getEndDateFill(){
//        return absenType.getAttribute("required");
//        return absenType.getText();

        return endDate.getText();
    }

    public String getHeader(){
        return header.getText();
    }
    public String getDataTable(){
        return dataTable.getAttribute("class");
    }


}
