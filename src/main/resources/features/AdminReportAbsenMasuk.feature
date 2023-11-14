# Report Absen Masuk (admin)
# Report Absen Masuk
Feature: Privilege Admin (Report Absen Masuk)
#  TCC.TMC.078 Menu Priviledge Admin
  Scenario: privilege admin report absen masuk
    Given user login as admin
    And user click privilege report absen masuk
    And user click menu report absen masuk
    Then user get text header report absen masuk

#  TCC.TMC.079 export data with invalid position
  Scenario: invalid position export report absen masuk
    Given user click privilege report absen masuk
    And user click menu report absen masuk
    And user input valid branch masuk
    And user input valid unit masuk
    And user input valid start date masuk
    And user input valid end date masuk
    And user click export data absen masuk
    Then user get validation report masuk

#  TCC.TMC.080 export data with invalid branch
  Scenario: invalid branch export report absen masuk
    Given user click privilege report absen masuk
    And user click menu report absen masuk
    And user input valid position masuk
    And user input valid unit masuk
    And user input valid start date masuk
    And user input valid end date masuk
    And user click export data absen masuk
    Then user get validation report masuk

#  TCC.TMC.081 export data with invalid unit
  Scenario: invalid unit export report absen masuk
    Given user click privilege report absen masuk
    And user click menu report absen masuk
    And user input valid position masuk
    And user input valid branch masuk
    And user input valid start date masuk
    And user input valid end date masuk
    And user click export data absen masuk
    Then user get validation report masuk

#  TCC.TMC.082 export data with invalid start date
  Scenario: invalid start date export report absen masuk
    Given user click privilege report absen masuk
    And user click menu report absen masuk
    And user input valid position masuk
    And user input valid unit masuk
    And user input invalid start date masuk
    And user input valid end date masuk
    And user click export data absen masuk
    Then user get validation report masuk

#  TCC.TMC.083 export data with invalid end date
  Scenario: invalid end date export report absen masuk
    Given user click privilege report absen masuk
    And user click menu report absen masuk
    And user input valid position masuk
    And user input valid unit masuk
    And user input valid start date masuk
    And user input invalid end date masuk
    And user click export data absen masuk
    Then user get validation report masuk

#  TCC.TMC.084 valid export data
  Scenario: valid export report absen masuk
    Given user click privilege report absen masuk
    And user click menu report absen masuk
    And user input valid position masuk
    And user input valid branch masuk
    And user input valid unit masuk
    And user input valid start date masuk
    And user input valid end date masuk
    And user click export data absen masuk
    Then user get validation report masuk

  Scenario: user logout
    Given user click profile button report masuk
    And user click logout button report masuk
    Then user meet login page
