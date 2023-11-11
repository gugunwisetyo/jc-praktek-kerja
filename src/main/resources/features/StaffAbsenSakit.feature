Feature: Staff Absen Sakit
  Scenario: privilege staff
    Given user click privilege menu
    And user click absen sakit
    Then user get text header

  Scenario: invalid no picture absen sakit
    Given user click privilege menu
    And user click absen sakit
    And user input valid devisi
    And user input valid shift name
    And user input valid absen type
    And user input valid keterangan
    And user click submit absen sakit
    Then user get validation sakit

  Scenario: invalid no devisi absen sakit
    Given user click privilege menu
    And user click absen sakit
    And user upload foto
    And user input valid shift name
    And user input valid absen type
    And user input valid keterangan
    And user click submit absen sakit
    Then user get validation sakit

  Scenario: invalid no shift name absen sakit
    Given user click privilege menu
    And user click absen sakit
    And user upload foto
    And user input valid devisi
    And user input valid absen type
    And user input valid keterangan
    And user click submit absen sakit
    Then user get validation sakit

  Scenario: invalid no absen type absen sakit
    Given user click privilege menu
    And user click absen sakit
    And user upload foto
    And user input valid devisi
    And user input valid shift name
    And user input valid keterangan
    And user click submit absen sakit
    Then user get validation sakit