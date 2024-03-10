@US004
Feature: US003 Amazon Testi

  Background:
    Given kullanici "https://amazon.com" sayfasina gider

  Scenario: TC01 Arama kutusunda iphone aratilir
    When arama kutusunda "iphone" aratir
    And sayfayi kapatir

  Scenario: TC02 Arama kutusunda samsung aratilir
    When arama kutusunda "samsung" aratir
    And sayfayi kapatir

  Scenario: TC03 Arama kutusunda nokia aratilir
    When arama kutusunda "nokia" aratir
    And sayfayi kapatir

    # Feature:  file'i daha dynamic hale getirebilmek icin step'lerde degisken olarak
  #kullanmak isteyebilecegimiz kelimeleri cift tirnak icinde belirtiriz
  #boylece bu cift tirnak icindeki deger stepdefinition class'indaki method icin artik bir parametreye donusur
  #ve boylece tekrar tekrar method olusturmadan dynamic olarak kullanabiliriz