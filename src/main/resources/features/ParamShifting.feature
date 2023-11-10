Feature: Dashboard Parameter Shifting
#  TCC.TMS.014
  Scenario: Dashboard Parameter Shifting
    Given User click menu master tab
    When User click menu parameter shifting
    Then User get text message parameter shift

#    TCC.TMS.015
  Scenario: Add parameter shift data null
    Given User click button add
    When User click button submit
    Then User get text message required

#    TCC.TMS.016
  Scenario:

