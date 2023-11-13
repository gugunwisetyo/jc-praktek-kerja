package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //locator
    @FindBy(xpath = "//input[@placeholder='NIK']")
    private WebElement username; //admin_tms //D6190874

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;  //d1k4@passw0rd //2001-01-08

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginBtn;

    @FindBy(xpath = "//*[@id=\"header\"]/ul/li/a")
    private WebElement profile;

    @FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[12]/a")
    private WebElement logoutBtn;

    @FindBy(xpath = "//*[@id=\"main-message\"]/h1/span")
    private WebElement notMeetLogin;

    @FindBy(xpath = "//b[normalize-space()='DIKA']")
    private WebElement meetLogin;

    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissable']")
    private WebElement wrongInput;

    @FindBy(xpath = "//h1[@class='page-header']")
    private WebElement dashboard;

    public void setUsername(String username){
        this.username.sendKeys(username);
    }

    public void setPassword(String password){
        this.password.sendKeys(password);
    }

    public void setLoginBtn(){
        this.loginBtn.click();
    }

    public void setProfile(){
        DriverSingleton.delay(3);
        this.profile.click();
    }

    public void setLogoutBtn(){
        this.logoutBtn.click();
    }

    public String getNotMeetLogin(){
        return notMeetLogin.getText();
    }

    public String getMeetLogin(){
        return meetLogin.getText();
    }

    public String getWrongInput(){
        return wrongInput.getText();
    }

    public String getDashboard(){
        return dashboard.getText();
    }

    public String getAttributFill(){
        return username.getAttribute("required");
    }

    public void clearField(){
        this.username.clear();
        this.password.clear();
    }
}
