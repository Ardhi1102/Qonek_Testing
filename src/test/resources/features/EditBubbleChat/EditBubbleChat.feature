@EditBubbleChat
  Feature: Edit Bubble Chat
    Scenario: Edit Chat with load existing
      Given User allready login with valid "testqa@gmail.com" and "DevPassword275!"
      When User click on robo button
      Then User allready on Chat Template page
      When User click on New Template button
      Then Modal create new template will appear
      And User click on Load Existing
      And User select template existing
      And User edit chat text with "PROMO GRATIS ONGKIR"
      And User click on Edit Template

    Scenario: Edit Hotkey with load existing
      Given User allready login with valid "testqa@gmail.com" and "DevPassword275!"
      When User click on robo button
      Then User allready on Chat Template page
      When User click on New Template button
      Then Modal create new template will appear
      And User click on Load Existing
      And User select template existing
      And User edit Hotkey with "PROMO 5.5"
      And User click on Edit Template

