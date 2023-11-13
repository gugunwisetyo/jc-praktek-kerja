package com.juaracoding.utils;

public enum TestCases {

    TMS_001 ("Dashboard management user client V1"),
    TMS_002 ("Add user client v1 name and email null"),
    TMS_003 ("Add user client v1 email null"),
    TMS_004("Add user client v1 name null"),
    TMS_005("Add user client v1 name and email duplicate"),
    TMS_006("Add user client v1 duplicate name"),
    TMS_007("Add user client v1 duplicate email"),
    TMS_008("Add user client v1 email address invalid"),
    TMS_009("Add user client V1 valid"),
    TMS_010("Show list data user client v1"),
    TMS_011("Searching data button enter"),
    TMS_012("Searching data with button search"),
    TMS_013("Refresh page"),

    //Master admin - Parameter Shifting
    TMS_014("Dashboard Parameter Shifting"),
    TMS_015("Add parameter shift data null"),
    TMS_016("Added shift parameter only input units"),
    TMS_017 ("Added shift parameter input units and name shift"),
    TMS_018 ("Added shift parameter input units, name shift and start time"),
    TMS_019 ("Added shift parameters with start time using letters"),
    TMS_020 ("Added shift parameters with finished hour input using letters"),
    TMS_021 ("Added valid shifting parameter data"),
    TMS_022 ("Edit the shifting parameter data with empty units"),
    TMS_023 ("Edit the shifting parameter data with empty name shift"),
    TMS_024 ("Edit the shifting parameter data with empty start time"),
    TMS_025 ("Edit the shifting parameter data with empty the hour is over"),
    TMS_026 (" Edit the shifting parameter unit"),
    TMS_027 ("Edit the shifting parameter name shift"),
    TMS_028("Edit the shifting parameter start time"),
    TMS_029 ("Edit the shifting parameter start time"),
    TMS_030 ("Edit the shifting parameter start time");

    private String testCaseName;

    TestCases(String value) { testCaseName = value;
    }

    public String getTestCaseName() {
        return testCaseName;
    }


}
