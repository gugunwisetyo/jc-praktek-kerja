# Laporan Kegiatan (staff)
# Absen off
Feature: Staff Absen Off
#  TCC.TMC.001 Menu Priviledge Staff
  Scenario: privilege staff
    Given user login as staff off
    And user click privilege menu off
    And user click absen off
    Then user get text header off

#  TCC.TMC.002 Input semua form dengan benar tanpa upload foto
  Scenario: invalid no picture absen off
    Given user login as staff off
    And user click privilege menu off
    And user click absen off
    And user input valid devisi off
    And user input valid shift name off
    And user input valid absen type off
    And user input valid keterangan off
    And user click submit absen off
    Then user get validation off

#  TCC.TMC.003 Input semua form dengan benar tanpa mengisi devisi
  Scenario: invalid no devisi absen off
    Given user login as staff off
    And user click privilege menu off
    And user click absen off
    And user upload foto off
    And user input valid shift name off
    And user input valid absen type off
    And user input valid keterangan off
    And user click submit absen off
    Then user get validation off

#  TCC.TMC.004 Input semua form dengan benar tanpa mengisi nama shift
  Scenario: invalid no shift name absen off
    Given user login as staff off
    And user click privilege menu off
    And user click absen off
    And user upload foto off
    And user input valid devisi off
    And user input valid absen type off
    And user input valid keterangan off
    And user click submit absen off
    Then user get validation off

#  TCC.TMC.005 Input semua form dengan benar tanpa mengisi tipe absen
  Scenario: invalid no absen type absen off
    Given user login as staff off
    And user click privilege menu off
    And user click absen off
    And user upload foto off
    And user input valid devisi off
    And user input valid shift name off
    And user input valid keterangan off
    And user click submit absen off
    Then user get validation off

#  TCC.TMC.006 Input devisi sebagai "Call Center" dan isi semua form dengan benar tanpa mengisi Tipe Shift
  Scenario: invalid no tipe shift absen off
    Given user login as staff off
    And user click privilege menu off
    And user click absen off
    And user upload foto off
    And user input valid devisi off as call center
    And user input valid shift name off
    And user input valid keterangan off
    And user click submit absen off
    Then user get validation off

#  TCC.TMC.007 Input semua form dengan benar
#  Scenario: invalid no tipe shift absen off
#    Given user login as staff off
#    And user click privilege menu off
#    And user click absen off
#    And user upload foto off
#    And user input valid devisi off
#    And user input valid shift name off
#    And user input valid keterangan off
#    And user click submit absen off
#    Then user get validation off

#  TCC.TMC.008 Hyperlink text pada feedback page absen off
#  Scenario: invalid no tipe shift absen off
#    Given user login as staff off
#    And user click privilege menu off
#    And user click absen off
#    And user upload foto
#    And user input valid devisi off
#    And user input valid shift name off
#    And user input valid keterangan off
#    And user click submit absen off
#    Then user get validation off