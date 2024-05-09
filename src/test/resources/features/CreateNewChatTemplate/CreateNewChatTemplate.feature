@CreateNewChatTemplate
Feature: Chat Template
  Scenario: Create New Chat Template
    Given User allready login with valid "testqa@gmail.com" and "DevPassword275!"
    When User click on robo button
    Then User allready on Chat Template page
    And User click on Create New Template button
    Then Modal create new template will appear
    And User input Template Name with "Template Test"
    When User input Chat Text with "Produk 1 Promo 50000"
    And User click on Create Template button

  Scenario: Create New Chat Template with 2 bubble chat
    Given User allready login with valid "testqa@gmail.com" and "DevPassword275!"
    When User click on robo button
    Then User allready on Chat Template page
    And User click on Create New Template button
    Then Modal create new template will appear
    And User input Template Name with "Template Test"
    When User input Chat Text with "Produk 1 Promo 50000"
    And User click on Add bubble chat
    When User input Other Chat Text with "Produk 2 Promo 39000"
    And User click on Create Template button

  Scenario: Create New Chat Template with valid image
    Given User allready login with valid "testqa@gmail.com" and "DevPassword275!"
    When User click on robo button
    Then User allready on Chat Template page
    And User click on Create New Template button
    Then Modal create new template will appear
    And User input Template Name with "Template Test"
    When User input Chat Text with "Produk 1 Promo 50000"
    And User upload image chat
    And User click on Create Template button