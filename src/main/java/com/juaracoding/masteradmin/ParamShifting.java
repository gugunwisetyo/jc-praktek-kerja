package com.juaracoding.masteradmin;

import com.juaracoding.drivers.DriverSingleton;
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



    //Locator Dashboard
    @FindBy (xpath = "//a[normalize-space()='Parameter Shifting']")
    public WebElement tabParamShift;
    @FindBy(xpath = "//a[normalize-space()='Parameter Shift']")
    public WebElement txtParamShift;






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








}
