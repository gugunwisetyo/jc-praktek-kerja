package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.mongodb.DBRef;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginTest {
    private static WebDriver driver;
    static ExtentTest extentTest;
    static LoginPage loginPage = new LoginPage();

    public LoginTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("user input invalid url")
    public void user_input_invalid_url(){
        try {
            driver.get(Constants.URL2);
        } catch (org.openqa.selenium.WebDriverException e) {
            Assert.assertTrue(e.getMessage().contains("ERR_NAME_NOT_RESOLVED"));
        }
        extentTest.log(LogStatus.PASS, "user input invalid url");
    }

    @Then("user does not meet login page")
    public void user_does_not_meet_login_page(){
        Assert.assertEquals(loginPage.getNotMeetLogin(), "This site can’t be reached");
        extentTest.log(LogStatus.PASS, "user does not meet login page");
    }

    @Given("user input valid url")
    public void user_input_valid_url(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "user input valid url");
    }

    @Then("user meet login page")
    public void user_meet_login_page(){
        Assert.assertEquals(loginPage.getMeetLogin(), "DIKA");
        extentTest.log(LogStatus.PASS, "user meet login page");
    }

    @Given("user input valid username")
    public void user_input_valid_username(){
        loginPage.setUsername("admin_tms");
        extentTest.log(LogStatus.PASS, "user input valid username");
    }

    @And("user input invalid password")
    public void user_input_invalid_password(){
        loginPage.setPassword("d1k4@passw0rdd");
        extentTest.log(LogStatus.PASS, "user input invalid password");
    }

    @And("user click login button")
    public void user_click_login_button(){
        loginPage.setLoginBtn();
        extentTest.log(LogStatus.PASS, "user click login button");
    }

    @Then("user get alert wrong input")
    public void user_get_alert_wrong_input(){
        Assert.assertEquals(loginPage.getWrongInput(), "×\n" +
                "Wrong username or password..!");
        extentTest.log(LogStatus.PASS, "user get alert wrong input");
        loginPage.clearField();
    }

    @Given("user input invalid username")
    public void user_input_invalid_username(){
        loginPage.setUsername("admin_tmss");
        extentTest.log(LogStatus.PASS, "user input invalid username");
    }

    @And("user input valid password")
    public void user_input_valid_password(){
        loginPage.setPassword("d1k4@passw0rd");
        extentTest.log(LogStatus.PASS, "user input valid password");
    }

    @Then("user get alert fill this field")
    public void user_get_alert_fill_this_field(){
        DriverSingleton.delay(2);
        Assert.assertEquals(loginPage.getAttributFill(), "true");
        extentTest.log(LogStatus.PASS, "user get alert fill this field");
        loginPage.clearField();
    }

    @Then("user get text dashboard")
    public void user_get_text_dashboard(){
        Assert.assertEquals(loginPage.getDashboard(), "Dashboard");
        extentTest.log(LogStatus.PASS, "user get text dashboard");
    }

    @Given("user click profile button")
    public void user_click_profile_button(){
        loginPage.setUsername("admin_tms");
        loginPage.setPassword("d1k4@passw0rd");
        loginPage.setLoginBtn();
        loginPage.setProfile();
        extentTest.log(LogStatus.PASS, "user click profile button");
    }

    @Given("user click logout button")
    public void user_click_logout_button(){
        loginPage.setLogoutBtn();
        extentTest.log(LogStatus.PASS, "user click logout button");
    }
}
