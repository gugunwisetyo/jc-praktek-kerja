Feature: Login Web TMS
#TCC.TMS.001
  Scenario: invalid TMS url
    Given user input invalid url
    Then user does not meet login page
#TCC.TMS.002
  Scenario: valid TMS url
    Given user input valid url
    Then user meet login page
#TCC.TMS.003
  Scenario: invalid password login
    Given user input valid username
    And user input invalid password
    And user click login button
    Then user get alert wrong input
#TCC.TMS.004
  Scenario: invalid username login
    Given user input invalid username
    And user input valid password
    And user click login button
    Then user get alert wrong input
#TCC.TMS.005
  Scenario: blank password login
    Given user input valid username
    And user click login button
    Then user get alert fill this field
#TCC.TMS.006
  Scenario: blank username login
    Given user input valid password
    And user click login button
    Then user get alert fill this field
#TCC.TMS.007
  Scenario: valid login
    Given user input valid username
    And user input valid password
    And user click login button
    Then user get text dashboard
#TCC.TMS.008
  Scenario: user logout
    Given user click profile button
    And user click logout button
    Then user meet login page