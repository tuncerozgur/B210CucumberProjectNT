@US013
Feature: US013 Google Testi Rerun

  Scenario: TC01 Google sayfasinda arama kutusunda arac aratilir
    Given kullanici "https://google.com" sayfasina gider
    When google arama kutusunda "ford" aratir
    Then sayfa basliginin "ford" icerdigini test eder
    But kullanici 2 saniye bekler
    And sayfayi kapatir


  Scenario: TC02 Google sayfasinda arama kutusunda arac aratilir
    Given kullanici "https://google.com" sayfasina gider
    When google arama kutusunda "volvo" aratir
    Then sayfa basliginin "volvooo" icerdigini test eder
    But kullanici 2 saniye bekler
    And sayfayi kapatir


  Scenario: TC03 Google sayfasinda arama kutusunda arac aratilir
    Given kullanici "https://google.com" sayfasina gider
    When google arama kutusunda "toyota" aratir
    Then sayfa basliginin "toyota" icerdigini test eder
    But kullanici 2 saniye bekler
    And sayfayi kapatir