Feature: Management user client v1
#  TCC.TMS.001
  Scenario: Dashboard management user client V1
    Given User login
    When User click menu master
    And User click menu managemen user client v1
    Then User get txt message list user client v1

# TCC.TMS.002
  Scenario: Add user client v1 name and email null
    Given User click button add user
    When User click button save
    Then User get text message out field name

# TCC.TMS.003
  Scenario: Add user client v1 email null
    Given User input full name
    When User click button save
    Then User get text message out field email

#  TCC.TMS.004
  Scenario: Add user client v1 name null
    Given User click button cancel
    When User click button add user
    And User clear input
    And User input email
    And User click button save
    Then User get text message out field name

#  TCC.TMS.005
  Scenario: Add user client v1 name and email duplicate
    Given User click button close tab
    When User click button add user
    And User clear input
    And User input full name
    And User input email
    And User click button save
    Then User get text message duplicate

#    TCC.TMS.006
  Scenario: Add user client v1 duplicate name
    Given User click button add user
    When User input full name
    And User input email new
    And User click button save
    Then User get text message duplicate

#    TCC.TMS.007
  Scenario: Add user client v1 duplicate email
    Given User click button add user
    When User input full name new
    And User input email
    And User click button save
    Then User get text message duplicate

#    TCC.TMS.008
  Scenario: Add user client v1 email address invalid
    Given User click button add user
    When User input full name new
    And User input email address invalid
    And User click button save
    Then User get text message invalid email

#    TCC.TMS.009
  Scenario: Add user client V1 valid
    Given User click button cancel
    When User click button add user
    And  User clear input
    And User input full name new
    And User input email new
    And User click button save
    Then User add get text message successful

#    TCC.TMS.010
  Scenario: Show list data user client v1
    Given User click button page next
    When User click button page3
    And User click button page prev
    And User select show25 user
    And User select show50 user
    And User select show100 user
    Then User get text message show page

#    TCC.TMS.011
  Scenario: Searching data button enter
    Given User input data search
    When User press button enter
    Then User get txt message searching

#    TCC.TMS.012
  Scenario: Searching data with button search
    Given User input data search
    When User click button search
    Then User get txt message searching

#    TCC.TMS.013
  Scenario: Refresh page
    Given User click button refresh
    Then User get text message total list data

