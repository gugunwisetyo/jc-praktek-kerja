package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.utils.Constants;
import com.juaracoding.utils.TestCases;
import com.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

public class Hooks {
    static WebDriver driver;
    static ExtentTest extentTest;
    static ExtentReports reports = new ExtentReports("target/extent-report.html");

    @BeforeAll
    public static void setUp(){
        DriverSingleton.getInstance(Constants.chrome);
        driver = DriverSingleton.getDriver();
        TestCases [] test = TestCases.values();
        extentTest = reports.startTest(test[Utils.testCount].getTestCaseName());
        Utils.testCount++;
    }
    @AfterStep
    public void getResultStatus(Scenario scenario){
        if (scenario.isFailed()){
            System.out.println("Screenshot");
        }
    }
    @After
    public void endTestCase(){
        reports.endTest(extentTest);
        reports.flush();
    }
    @AfterAll
    public static void finish() {
        DriverSingleton.delay(3);
        DriverSingleton.closeObjectInstance();
    }
}
