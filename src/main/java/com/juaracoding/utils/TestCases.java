package com.juaracoding.utils;

public enum TestCases {


    T1 ("Dashboard management user client V1"),
    T2 ("Add user client v1 name and email null"),
    T3 ("Add user client v1 email null"),
    T4("Add user client v1 name null"),
    T5("Add user client v1 name and email duplicate"),
    T6("Add user client v1 duplicate name"),
    T7("Add user client v1 duplicate email"),
    T8("Add user client v1 email address invalid"),
    T9("Add user client V1 valid"),
    T10("Show list data user client v1"),
    T11("Searching data button enter"),
    T12("Searching data with button search"),
    T13("Refresh page"),
    T14("Dashboard Parameter Shifting"),
    T15("Add parameter shift data null");

    private String testCaseName;
    TestCases(String value) { testCaseName = value;
    }

    public String getTestCaseName() {
        return testCaseName;
    }


}
