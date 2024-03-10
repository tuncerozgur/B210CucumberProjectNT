@US002
Feature: US002 BlueRentalCar Sayfasında Login Test


  Scenario: TC01 verilen Email ve Password ile login olunur

    Given kullanici blueRentalCar sayfasina gider
    When login butonuna tiklar
    And email ve password bilgileri ile login olur
    And sayfayi kapatir