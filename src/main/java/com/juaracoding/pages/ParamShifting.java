package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParamShifting {
    private WebDriver driver;

    public ParamShifting(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }


    //Locator add parameter shift
    @FindBy (xpath = "//a[@class='btn btn-primary']")
    public WebElement btnAdd;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement btnSubmit;
    @FindBy (xpath = "//small[normalize-space()='The Unit field is required.']")
    public WebElement txtUnitRequired;
    @FindBy (xpath = "//small[normalize-space()='The Nama Shift field is required.']")
    public WebElement txtNamaRequired;
    @FindBy (xpath = "//small[normalize-space()='The Jam Mulai field is required.']")
    public WebElement txtJamMulai;
    @FindBy (xpath = "//small[normalize-space()='The Jam Selesai field is required.']")
    public WebElement txtJamSelesai;
    @FindBy (xpath = "//strong[normalize-space()='Success!']")
    public WebElement txtSuccess;
    @FindBy(xpath = "//div[@class='filter-option-inner-inner']")
    public WebElement unit;
    @FindBy(xpath = "//input[@aria-label='Search']")
    public WebElement inputUnit;
    @FindBy(xpath = "//input[@id='shift_name']")
    public WebElement inputNamaShift;
    @FindBy (xpath = "//input[@id='jam_mulai']")
    public WebElement inputJamMulai;
    @FindBy (xpath = "//input[@id='jam_selesai']")
    public WebElement inputJamSelesai;

    //locator edit
    @FindBy (xpath = "//input[@type='search']")
    public WebElement inputSearch;
    @FindBy (xpath = "//td[normalize-space()='121']")
    public WebElement btnPlus;
    @FindBy (xpath = "//span[@class='dtr-data']//a[@title='Edit Data']")
    public WebElement btnEdit;
    @FindBy (xpath = "//a[@class='dropdown-item selected active']")
    public WebElement unitNull;

    //locator delete
    @FindBy (xpath = "//span[@class='dtr-data']//a[@title='Delete Data']")
    public WebElement btnDelete;

    //Locator Dashboard
    @FindBy (xpath = "//a[normalize-space()='Parameter Shifting']")
    public WebElement tabParamShift;
    @FindBy(xpath = "//a[normalize-space()='Parameter Shift']")
    public WebElement txtParamShift;

   //Locator - Show Data Page
   @FindBy (xpath = "//a[normalize-space()='Next']")
   public WebElement btnNext;
   @FindBy(xpath = "//a[normalize-space()='Previous']")
   public WebElement btnPrevious;
   @FindBy (xpath = "//a[normalize-space()='4']")
   public WebElement btnPage4;
   @FindBy(xpath = "//select[@name='data-table-default_length']")
   public WebElement showPage;
   @FindBy (xpath = "//td[normalize-space()='100']")
   public WebElement txtSHowPage;


    //Dashboard Parameter Shift
    public void clickTabParamShift(){
        this.tabParamShift.click();
    }
    public String getTxtParamShift(){
        return txtParamShift.getText();
    }

    //Parameter Shift
    public void clickBtnAdd(){
        this.btnAdd.click();
    }
    public void clickBtnSubmit(){
        this.btnSubmit.click();
    }
    public String getTxtUnitRequired(){
        return txtUnitRequired.getText();
    }
    public void setUnit(){
        this.unit.click();
    }
    public void getInputUnit(String unit){
        this.inputUnit.sendKeys(unit);
    }
    public String getTxtNamaRequired(){
        return txtNamaRequired.getText();
    }
    public void getInputNamaShift(String nama){
        this.inputNamaShift.sendKeys(nama);
    }
    public String getTxtJamMulai(){
        return txtJamMulai.getText();
    }
    public void getInputJamMulai(String startTime){
        this.inputJamMulai.sendKeys(startTime);
    }
    public String getTxtJamSelesai(){
        return txtJamSelesai.getText();
    }
    public void getInputJamSelesai(String endTime){
        this.inputJamSelesai.sendKeys(endTime);
    }
    public String getTxtAddSuccess(){
        return txtSuccess.getText();
    }
    public void getClearStartTime(){
        inputJamMulai.sendKeys(Keys.CONTROL+"a");
        inputJamMulai.sendKeys(Keys.DELETE);
    }
    public void getClearEndTime(){
        inputJamSelesai.sendKeys(Keys.CONTROL+"a");
        inputJamSelesai.sendKeys(Keys.DELETE);
    }

    //Method edit
    public void getInputSearach(String search){
        this.inputSearch.sendKeys(search);
    }
    public void clickButtonPlus(){
        this.btnPlus.click();
    }
    public void clickButtonEdit(){
        this.btnEdit.click();
    }
    public void inputUnitNull(){
        this.unit.click();
        this.inputUnit.sendKeys("pilih"+Keys.ENTER);
    }
    public void clearNameShift(){
        this.inputNamaShift.clear();

    }
    public void clickBtnDelete(){
        this.btnDelete.click();
    }
    public void clickAlert(){
        this.driver.switchTo().alert().accept();
    }
    public void clickBtnNext(){
        this.btnNext.click();
    }
    public void clickBtnPrev(){
        this.btnPrevious.click();
    }
    public void clickBtnPage4(){
        this.btnPage4.click();
    }
    public void clickShowPage(){
        this.showPage.click();
    }
    public void getShowPage(String user){
        this.showPage.sendKeys(user);
    }
    public String getTxtShowPage() {
        return txtSHowPage.getText();
    }









}
