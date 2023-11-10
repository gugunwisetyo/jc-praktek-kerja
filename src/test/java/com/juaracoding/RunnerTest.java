package com.juaracoding;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import java.util.PriorityQueue;


@CucumberOptions (
            features = {"src/main/resources/features/Login.feature",
            "src/main/resources/features/MnUserClientV1.feature",
            "src/main/resources/features/ParamShifting.feature"},
            glue = "com.juaracoding",
            plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"}
    )

    public class RunnerTest extends AbstractTestNGCucumberTests{

    }
