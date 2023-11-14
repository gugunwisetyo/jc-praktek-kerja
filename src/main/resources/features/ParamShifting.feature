Feature: Dashboard Parameter Shifting
#  TCC.TMS.014
  Scenario: Dashboard Parameter Shifting
    Given User login
    When User click menu master tab
    And User click menu parameter shifting
    Then User get text message parameter shift

#    TCC.TMS.015
  Scenario: Add parameter shift data null
    Given User click button add
    When User click button submit
    Then User get text message unit required

#    TCC.TMS.016
  Scenario: Added shift parameter only input units
    Given User click unit
    When User input unit
    And User click button submit
    Then User get text message name shift required

#    TCC.TMS.017
  Scenario: Added shift parameter input units and name shift
    Given User input name shift
    When User click button submit
    Then User get text message start time required

#    TCC.TMS.018
  Scenario: Added shift parameter input units, name shift and start time
    Given User input start time
    When User click button submit
    Then User get text message the hour is over required

#    TCC.TMS.0019
  Scenario: Added shift parameters with start time using letters
    Given User clear input start time
    When User input start time with a letter
    And User input the hour is over
    And User click button submit
    Then User get text message the hour is over required

#    TCC.TMS.020
  Scenario: Added shift parameters with finished hour input using letters
    Given User click button add
    When User click unit
    And User input unit
    And User input name shift
    And User input start time
    And User input the hour is over with a letter
    And User click button submit
    Then User get text message start time required

#  TCC.TMS.021
  Scenario: Added valid shifting parameter data
    Given User click button add
    When User click unit
    And User input unit
    And User input name shift
    And User input start time
    And User input the hour is over
    And User click button submit
    Then User get text message

##    TCC.TMS.022
  Scenario: Edit the shifting parameter data with empty units
    Given User input data in search text box
    When User click button plus
    And User click button edit data
    And User input unit null
    And User click button submit
    Then User get text message unit required

#    TCC.TMS.023
  Scenario: Edit the shifting parameter data with empty name shift
    Given User input data in search text box
    When User click button plus
    And User click button edit data
    And User clear name shift
    And User click button submit
    Then User get text message name shift required

#    TCC.TMS.024
  Scenario: Edit the shifting parameter data with empty start time
    Given User input data in search text box
    When User click button plus
    And User click button edit data
    And User clear start time
    And User click button submit
    Then User get text message start time required

#    TCC.TMS.025
  Scenario: Edit the shifting parameter data with empty the hour is over
    Given User input data in search text box
    When User click button plus
    And User click button edit data
    And User clear the hour is over
    And User click button submit
    Then User get text message the hour is over required

#  TCC.TMS.026
  Scenario: Edit the shifting parameter unit
    Given User input data in search text box
    When User click button plus
    And User click button edit data
    And User input unit new
    And User click button submit
    Then User get text message edit success

#   TCC.TMS.027
  Scenario: Edit the shifting parameter name shift
    Given User input data in search text box
    When User click button plus
    And User click button edit data
    And User clear name shift
    And User input name shift new
    And User click button submit
    Then User get text message edit success

#     TCC.TMS.028
  Scenario: Edit the shifting parameter start time
    Given User input data in search text box
    When User click button plus
    And User click button edit data
    And User clear start time
    And User input start time new
    And User click button submit
    Then User get text message edit success

#       TCC.TMS.029
  Scenario: Edit the shifting parameter start time
    Given User input data in search text box
    When User click button plus
    And User click button edit data
    And User clear the hour is over
    And User input the hour is over new
    And User click button submit
    Then User get text message edit success

#    TCC.TMS.030
  Scenario:Delete data parameter shifting
    Given User input data in search text box
    When User click button plus
    And User click button delete
    And User click button ok in alert
    Then User get text message delete success

#    TCC.TMS.031
  Scenario: Displays data according to dropdown list and page button options
    Given User click button next page
    When User click button previous page
    And User click button page4
    And User click button dropdown list show page
    And User select 25 show page
    And User select 50 show page
    And User select 100 show page
    Then User get text message show page parameter shift
