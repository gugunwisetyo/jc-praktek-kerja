package com.juaracoding.utils;

public enum TestCases {
    T1("invalid TMS url"),
    T2("valid TMS url"),
    T3("invalid password login"),
    T4("invalid username login"),
    T5("blank password login"),
    T6("blank username login"),
    T7("valid login"),
    T8("user logout");

    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
