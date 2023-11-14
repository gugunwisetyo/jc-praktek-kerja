# Laporan Kegiatan (staff)
# Absen sakit
Feature: Staff Absen Sakit
#  TCC.TMC.001 Menu Priviledge Staff
  Scenario: privilege staff sakit
    Given user login as staff sakit
    And user click privilege menu sakit
    And user click absen sakit
    Then user get text header sakit

#  TCC.TMC.002 Input semua form dengan benar tanpa upload foto
  Scenario: invalid no picture absen sakit
    Given user login as staff sakit
    And user click privilege menu sakit
    And user click absen sakit
    And user input valid devisi sakit
    And user input valid shift name sakit
    And user input valid absen type sakit
    And user input valid keterangan sakit
    And user click submit absen sakit
    Then user get validation sakit

#  TCC.TMC.003 Input semua form dengan benar tanpa mengisi devisi
  Scenario: invalid no devisi absen sakit
    Given user login as staff sakit
    And user click privilege menu sakit
    And user click absen sakit
    And user upload foto sakit
    And user input valid shift name sakit
    And user input valid absen type sakit
    And user input valid keterangan sakit
    And user click submit absen sakit
    Then user get validation sakit

#  TCC.TMC.004 Input semua form dengan benar tanpa mengisi nama shift
  Scenario: invalid no shift name absen sakit
    Given user login as staff sakit
    And user click privilege menu sakit
    And user click absen sakit
    And user upload foto sakit
    And user input valid devisi sakit
    And user input valid absen type sakit
    And user input valid keterangan sakit
    And user click submit absen sakit
    Then user get validation sakit

#  TCC.TMC.005 Input semua form dengan benar tanpa mengisi tipe absen
  Scenario: invalid no absen type absen sakit
    Given user login as staff sakit
    And user click privilege menu sakit
    And user click absen sakit
    And user upload foto sakit
    And user input valid devisi sakit
    And user input valid shift name sakit
    And user input valid keterangan sakit
    And user click submit absen sakit
    Then user get validation sakit

#  TCC.TMC.006 Input devisi sebagai "Call Center" dan isi semua form dengan benar tanpa mengisi Tipe Shift
  Scenario: invalid no tipe shift absen sakit
    Given user login as staff sakit
    And user click privilege menu sakit
    And user click absen sakit
    And user upload foto sakit
    And user input valid devisi sakit as call center
    And user input valid shift name sakit
    And user input valid keterangan sakit
    And user click submit absen sakit
    Then user get validation sakit

#  TCC.TMC.007 Input semua form dengan benar
  Scenario: invalid no tipe shift absen sakit
    Given user login as staff sakit
    And user click privilege menu sakit
    And user click absen sakit
    And user upload foto sakit
    And user input valid devisi sakit
    And user input valid shift name sakit
    And user input valid absen type sakit
    And user input valid keterangan sakit
    And user click submit absen sakit
    Then user get validation sakit
#  TCC.TMC.008 Hyperlink text pada feedback page absen sakit
  Scenario: invalid no tipe shift absen sakit
    Given user login as staff sakit
    And user click privilege menu sakit
    And user click absen sakit
    And user upload foto sakit
    And user input valid devisi sakit
    And user input valid shift name sakit
    And user input valid keterangan sakit
    And user click submit absen sakit
    Then user get validation sakit