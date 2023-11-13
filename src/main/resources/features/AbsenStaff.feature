Feature: Laporan Kegiatan Staff
#TCC.TMS.009
  Scenario: menu priviledge staff
    Given user login
    And user click laporan kegiatan
    And user click absen masuk
    Then user meet absen masuk page
#TCC.TMS.010
  Scenario: valid absen masuk
    Given user upload selfie
    And user pilih divisi
    And user pilih nama shift
    And user pilih tipe absen
    And user mengisi keterangan
    And user click submit button
    Then user get respond page
#TCC.TMS.011
  Scenario: kembali ke absen masuk
    Given user click hyperlink text
    And user meet alert
    Then user meet dashboard page
#TCC.TMS.012
  Scenario: absen masuk dengan yang akun sudah absen masuk
    Given login with account done masuk
#    And user upload selfie
#    And user pilih divisi
#    And user pilih nama shift
#    And user pilih tipe absen
#    And user mengisi keterangan
#    And user click submit button
    And user get alert message
    Then user meet dashboard page
#TCC.TMS.013
  Scenario: absen masuk dengan akun yang sudah absen izin
    Given login with account done izin
#    And user upload selfie
#    And user pilih divisi
#    And user pilih nama shift
#    And user pilih tipe absen
#    And user mengisi keterangan
#    And user click submit button
    And user get alert message
    Then user meet dashboard page
#TCC.TMS.014
  Scenario: absen masuk dengan akun yang sudah absen sakit
    Given login with account done sakit
#    And user upload selfie
#    And user pilih divisi
#    And user pilih nama shift
#    And user pilih tipe absen
#    And user mengisi keterangan
#    And user click submit button
    And user get alert message
    Then user meet dashboard page
#TCC.TMS.015
  Scenario: absen masuk tanpa selfie
    Given user login masukv2
    And user pilih divisi
    And user pilih nama shift
    And user pilih tipe absen
    And user mengisi keterangan
    And user click submit button
    Then user get alert select an item
#TCC.TMS.016
  Scenario: absen masuk tanpa pilih divisi
    Given user upload selfie
#    And user pilih nama shift
    And user pilih tipe absen
    And user mengisi keterangan
    And user click submit button
    Then user get alert select an item
#TCC.TMS.017
  Scenario: absen masuk tanpa pilih nama shift
    Given user upload selfie
    And user pilih divisi
    And user pilih tipe absen
    And user mengisi keterangan
    And user click submit button
    Then user get alert select an item
#TCC.TMS.018
  Scenario: absen masuk tanpa pilih tipe absen
    Given user upload selfie
    And user pilih divisi
    And user pilih nama shift
    And user mengisi keterangan
    And user click submit button
    Then user get alert select an item
#TCC.TMS.019
  Scenario: absen pulang tanpa absen masuk terlebih dahulu
    Given user click logout buttonv2
    And user login masukv3
    And user click laporan kegiatan
    And user click absen pulang
    And user get alert message
    Then user meet dashboard page
#TCC.TMS.020
  Scenario: absen pulang dengan absen masuk terlebih dahulu
    Given user click logout buttonv2
    And user login masukv3
    And user set account state masuk
    And user click laporan kegiatan
    And user click absen pulang
    And user upload selfie
    And user pilih nama shiftv2
    And user pilih tipe absen
    And user mengisi keterangan
    And user click submit button
    Then user get respond page
#TCC.TMS.021
  Scenario: kembali ke absen pulang
    Given user click hyperlink text
    And user get alert message
    Then user meet dashboard page
#TCC.TMS.022
  Scenario: absen pulang tanpa upload selfie
    Given user set account state masuk
    And user click laporan kegiatan
    And user click absen pulang
    And user pilih nama shiftv2
    And user pilih tipe absen
    And user mengisi keterangan
    And user click submit button
    Then user get alert select an itemv2
#TCC.TMS.023
  Scenario: absen pulang tanpa pilih nama shift
    Given user click laporan kegiatan
    And user click absen pulang
    And user upload selfie
    And user pilih tipe absen
    And user mengisi keterangan
    And user click submit button
    Then user get alert select an itemv2
#TCC.TMS.024
  Scenario: absen pulang tanpa pilih tipe absen
    Given user click laporan kegiatan
    And user click absen pulang
    And user upload selfie
    And user pilih nama shiftv2
    And user mengisi keterangan
    And user click submit button
    Then user get alert select an itemv2