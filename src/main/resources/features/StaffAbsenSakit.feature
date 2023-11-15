# Laporan Kegiatan (staff)
# Absen sakit
Feature: Staff Absen Sakit
#  TCC.TMC.062 Menu Priviledge Staff
  Scenario: privilege staff sakit
    Given user login as staff sakit
    And user click privilege menu sakit
    And user click absen sakit
    Then user get text header sakit

#  TCC.TMC.063 Input semua form dengan benar tanpa upload foto
  Scenario: invalid no picture absen sakit
    Given user click privilege menu sakit
    And user click absen sakit
    And user input valid devisi sakit
    And user input valid shift name sakit
    And user input valid absen type sakit
    And user input valid keterangan sakit
    And user click submit absen sakit
    Then user get validation sakit

#  TCC.TMC.064 Input semua form dengan benar tanpa mengisi devisi
  Scenario: invalid no devisi absen sakit
    Given user click privilege menu sakit
    And user click absen sakit
    And user upload foto sakit
    And user not input shift name sakit
    And user input valid absen type sakit
    And user input valid keterangan sakit
    And user click submit absen sakit
    Then user get validation sakit

#  TCC.TMC.065 Input semua form dengan benar tanpa mengisi nama shift
  Scenario: invalid no shift name absen sakit
    Given user click privilege menu sakit
    And user click absen sakit
    And user upload foto sakit
    And user input valid devisi sakit
    And user input valid absen type sakit
    And user input valid keterangan sakit
    And user click submit absen sakit
    Then user get validation sakit

#  TCC.TMC.066 Input semua form dengan benar tanpa mengisi tipe absen
  Scenario: invalid no absen type absen sakit
    Given user click privilege menu sakit
    And user click absen sakit
    And user upload foto sakit
    And user input valid devisi sakit
    And user input valid shift name sakit
    And user input valid keterangan sakit
    And user click submit absen sakit
    Then user get validation sakit

#  TCC.TMC.067 Input devisi sebagai "Call Center" dan isi semua form dengan benar tanpa mengisi Tipe Shift
  Scenario: invalid no tipe shift absen sakit
    Given user click privilege menu sakit
    And user click absen sakit
    And user upload foto sakit
    And user input valid devisi sakit as call center
    And user input valid shift name sakit
    And user input valid keterangan sakit
    And user click submit absen sakit
    Then user get validation sakit
    And user click profile button absen sakit
    Then user click logout button absen sakit

#  TCC.TMC.068 Input semua form dengan benar
  Scenario: valid absen sakit
    Given user click privilege menu sakit
    And user click absen sakit
    And user upload foto sakit
    And user input valid devisi sakit
    And user input valid shift name sakit
    And user input valid absen type sakit
    And user input valid keterangan sakit
    And user click submit absen sakit
    Then user get validation melakukan absen sakit

#  TCC.TMC.069 Hyperlink text pada feedback page absen sakit
  Scenario: click hyperlink after input data
    Given user click hyperlink sakit
    And user get alert absen sakit
    Then user get validation melakukan absen sakit
    And user click profile button absen sakit
    Then user click logout button absen sakit
