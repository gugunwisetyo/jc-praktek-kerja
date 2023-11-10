package com.juaracoding.masteradmin;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MnUserClientV1 {

    private WebDriver driver;


    public MnUserClientV1(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    //Master
    @FindBy (xpath = "//div[@id='sidebar']/div/div/ul/li[4]/a")
    private WebElement master;
    @FindBy (xpath = "//div[@id='sidebar']/div/div/ul/li[4]/ul/li[5]/a")
    private WebElement userClientV1;
    @FindBy (xpath = "//li[normalize-space()='List user client V1']")
    private WebElement txtListUserV1;


    //invalid input name and email null
    @FindBy (xpath= "//div[@id='modalUser']/div/div/div")
    private WebElement alertName;
    @FindBy (id = "btnCancel")
    private WebElement btnCancel;
    @FindBy(xpath = "//*[@id=\"close\"]/span")
    private WebElement btnCloseAdd;

    //input valid name and email
    @FindBy (xpath= "//*[@id=\"namaLengkap\"]")
    private WebElement inputName;
    @FindBy (id ="emailUser")
    private WebElement inputEmail;
    @FindBy (id = "tambahUser")
    private WebElement btnAdd;
    @FindBy  (xpath = "//button[@id='btnSimpan']")
    private WebElement btnSave;
    @FindBy (xpath = "//*[@id=\"content\"]/div[2]/text()")
    private WebElement txtSuccses;
    @FindBy (xpath = "//*[@id=\"namaLengkap\"]")
    private WebElement txtNamaLengkap;

    //alert duplicate
    @FindBy (xpath = "//div[@id='content']/div[2]/strong")
    public WebElement messageDashboard;

    //show page
    @FindBy(xpath = "//a[normalize-space()='Next']")
    public WebElement btnNext;
    @FindBy (xpath = "//a[normalize-space()='3']")
    public WebElement btnPage3;
    @FindBy (xpath = "//a[normalize-space()='Previous']")
    public WebElement btnPrev;
    @FindBy (xpath = "//table[@id='tableUser']/tbody/tr[51]/td[2]")
    public WebElement txtShowPage;
    @FindBy (xpath = "//div[@id='tableUser_length']/label/select")
    public WebElement dropDown;

    //Search locator
    @FindBy (xpath = "//input[@type='search']")
    public WebElement inputSearch;
    @FindBy (xpath = "//i[@class='fa fa-search']")
    public WebElement btnSearch;
    @FindBy (xpath = "//*[@id=\"tableUser\"]//tr[2]/td[3]")
    public WebElement txtSearch;
    @FindBy (xpath = "//i[@class='fa fa-history']")
    public WebElement btnRefresh;
    @FindBy (xpath = "//*[@id=\"tableUser_info\"]")
    public WebElement txtTotalList;



    //Master
    public void clickMaster(){
        this.master.click();
    }
    public void clickUserClientV1(){
        this.userClientV1.click();
    }
    public String getTxtLisUserV1(){
        return txtListUserV1.getText();
    }

    //add user client v1 null name and email
    public String getTxtAlertName(){
        return inputName.getAttribute("validationMessage");
    }
    public String getTxtAlertEmail(){
        return inputEmail.getAttribute("validationMessage");
    }
    public String getTxtAlertEmailInvalid(){
        return inputEmail.getAttribute("validationMessage");
    }



    public void clickBtnCancel(){
        btnCancel.click();
    }
    public void clickBtnCloseAdd(){
        btnCloseAdd.click();
    }

    //add user client v1 valid
    public void clickBtnAdd(){
        this.btnAdd.click();
    }
    public void getInputName(String name){
        this.inputName.sendKeys(name);
    }
    public void getInputEmail(String email){
        this.inputEmail.sendKeys(email);
    }

    public void clickBtnSave(){
        this.btnSave.click();
    }
    public String getTxtSuccess(){
        return txtSuccses.getText();
    }
    public String getTxtMessageDashboard(){
        return messageDashboard.getText();
    }

    //clear input
    public void clearAll(){
        inputName.sendKeys(Keys.CONTROL+"a");
        inputName.sendKeys(Keys.DELETE);
        inputEmail.sendKeys(Keys.CONTROL+"a");
        inputName.sendKeys(Keys.DELETE);
    }

    //show page
    public void showPage(String show){
        this.dropDown.sendKeys(show+Keys.ENTER);

    }
    public String getTxtShowPage (){
        return txtShowPage.getText();
    }
    public void clickBtnNextPage(){
        btnNext.click();
    }
    public void clickBtnPrevPage(){
        btnPrev.click();
    }
    public void clickBtnPageNumb1(){
        btnPage3.click();
    }

    //search
    public void getInputSearch(String nama){
        this.inputSearch.sendKeys(nama);
    }
    public void clickBtnSearch(){
        this.btnSearch.click();
    }
    public String getTxtSearch(){
        return txtSearch.getText();
    }
    public void clickBtnRefresh(){
        this.btnRefresh.click();
    }
    public String getTxtTotalList(){
        return txtTotalList.getText();
    }
    public void btnEnter(String nama){
        this.inputSearch.sendKeys(nama+Keys.ENTER);
    }
}
