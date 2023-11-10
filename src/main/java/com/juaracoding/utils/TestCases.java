package com.juaracoding.utils;

public enum TestCases {
    TMS_001("invalid TMS url"),
    TMS_002("valid TMS url"),
    TMS_003("invalid password login"),
    TMS_004("invalid username login"),
    TMS_005("blank password login"),
    TMS_006("blank username login"),
    TMS_007("valid login"),
    TMS_008("user logout"),
    TMS_009("menu priviledge staff"),
    TMS_010("valid absen masuk"),
    TMS_011("kembali ke absen masuk");

    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
