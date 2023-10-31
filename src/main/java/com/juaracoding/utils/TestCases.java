package com.juaracoding.utils;

public enum TestCases {
    T1(""),
    T2(""),
    T3(""),
    T4("");

    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
