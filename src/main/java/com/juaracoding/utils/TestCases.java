package com.juaracoding.utils;

public enum TestCases {

    TMS_031 ("Dashboard management user client V1"),
    TMS_032 ("Add user client v1 name and email null"),
    TMS_033 ("Add user client v1 email null"),
    TMS_034("Add user client v1 name null"),
    TMS_035("Add user client v1 name and email duplicate"),
    TMS_036("Add user client v1 duplicate name"),
    TMS_037("Add user client v1 duplicate email"),
    TMS_038("Add user client v1 email address invalid"),
    TMS_039("Add user client V1 valid"),
    TMS_040("Show list data user client v1"),
    TMS_041("Searching data button enter"),
    TMS_042("Searching data with button search"),
    TMS_043("Refresh page"),

    //Master admin - Parameter Shifting
    TMS_044("Dashboard Parameter Shifting"),
    TMS_045("Add parameter shift data null"),
    TMS_046("Added shift parameter only input units"),
    TMS_047 ("Added shift parameter input units and name shift"),
    TMS_048 ("Added shift parameter input units, name shift and start time"),
    TMS_049 ("Added shift parameters with start time using letters"),
    TMS_050 ("Added shift parameters with finished hour input using letters"),
    TMS_051 ("Added valid shifting parameter data"),
    TMS_052 ("Edit the shifting parameter data with empty units"),
    TMS_053 ("Edit the shifting parameter data with empty name shift"),
    TMS_054 ("Edit the shifting parameter data with empty start time"),
    TMS_055 ("Edit the shifting parameter data with empty the hour is over"),
    TMS_056 (" Edit the shifting parameter unit"),
    TMS_057 ("Edit the shifting parameter name shift"),
    TMS_058("Edit the shifting parameter start time"),
    TMS_059 ("Edit the shifting parameter start time"),
    TMS_060 ("Delete data parameter shifting"),
    TMS_061 ("Displays data according to dropdown list and page button options");

    private String testCaseName;

    TestCases(String value) { testCaseName = value;
    }

    public String getTestCaseName() {
        return testCaseName;
    }


}
