package com.juaracoding.utils;

public enum TestCases {
    //module login
    TMS_001("invalid TMS url"),
    TMS_002("valid TMS url"),
    TMS_003("invalid password login"),
    TMS_004("invalid username login"),
    TMS_005("blank password login"),
    TMS_006("blank username login"),
    TMS_007("valid login"),
    TMS_008("user logout"),

    //module absen masuk
    TMS_009("menu priviledge staff"),
    TMS_010("valid absen masuk"),
    TMS_011("kembali ke absen masuk"),
    TMS_012("absen masuk dengan yang akun sudah absen masuk"),
    TMS_013("absen masuk dengan akun yang sudah absen izin"),
    TMS_014("absen masuk dengan akun yang sudah absen sakit"),
    TMS_015("absen masuk tanpa selfie"),
    TMS_016("absen masuk tanpa pilih divisi"),
    TMS_017("absen masuk tanpa pilih nama shift"),
    TMS_018("absen masuk tanpa pilih tipe absen"),

    //module absen pulang
    TMS_019("absen pulang tanpa absen masuk terlebih dahulu"),
    TMS_020("absen pulang dengan absen masuk terlebih dahulu"),
    TMS_021("kembali ke absen pulang"),
    TMS_022("absen pulang tanpa upload selfie"),
    TMS_023("absen pulang tanpa pilih nama shift"),
    TMS_024("absen pulang tanpa pilih tipe absen");


    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
