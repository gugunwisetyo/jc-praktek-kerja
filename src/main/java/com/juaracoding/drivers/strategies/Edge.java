package com.juaracoding.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Edge implements DriverStrategy {
    @Override
    public WebDriver setStrategy(){
    String path ="C:\\MyTools\\edgedriver_win64\\msedgedriver.exe";
    System.setProperty("webdriver.edge.driver", path);
    EdgeOptions options = new EdgeOptions();
    return new EdgeDriver(options);
    }
}
