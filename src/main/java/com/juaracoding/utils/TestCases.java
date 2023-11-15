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
    TMS_024("absen pulang tanpa pilih tipe absen"),

    //module absen izin
    TMS_025("menu priviledge staff absen izin"),
    TMS_026("absen izin tanpa upload selfie"),
    TMS_027("absen izin tanpa pilih nama shift"),
    TMS_028("absen izin tanpa pilih tipe absen"),
    TMS_029("valid absen izin"),
    TMS_030("kembali ke halaman absen izin"),

    //management user
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
    TMS_061 ("Displays data according to dropdown list and page button options"),

    //staff absen sakit
    TMS_062("valid privilege menu laporan kegiatan (Absen Sakit)"),
    TMS_063("invalid no picture absen sakit"),
    TMS_064("invalid no devisi absen sakit"),
    TMS_065("invalid no shift name absen sakit"),
    TMS_066("invalid no absen type absen sakit"),
    TMS_067("invalid no type shift absen sakit"),
    TMS_068("valid absen sakit"),
    TMS_069("click hyperlink after input data sakit"),

    //staff absen off
    TMS_070("valid privilege menu laporan kegiatan (Absen Off)"),
    TMS_071("invalid no picture absen off"),
    TMS_072("invalid no devisi absen off"),
    TMS_073("invalid no shift name absen off"),
    TMS_074("invalid no absen type absen off"),
    TMS_075("invalid no type shift absen off"),
    TMS_076("valid absen off"),
    TMS_077("click hyperlink after input data off"),

    //report admin
    TMS_078("menu privilege admin"),
    TMS_079("export data with invalid position"),
    TMS_080("export data with invalid branch"),
    TMS_081("export data with invalid unit"),
    TMS_082("export data with invalid start date"),
    TMS_083("export data with invalid end date"),
    TMS_084("valid export data report absen masuk"),
    TMS_085("valid get data table absen masuk");


    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
