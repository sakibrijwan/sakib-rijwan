Feature: Functional testing of CoCoin Application
  Scenario: Launch CoCoin app and Test its feature
    When I launch CoCoin app
    Then Welcome screen appears

    When I add Lunch as expense
    And Add amount to click save
    Then Lunch is added to the expense list

    When I click on left menu
    Then Left menu expands

    Given The Password screen
    When Password is entered
    Then Dashboard appears

    When swap into current address
    Then View expense 100 USD in this week

    When Top Left Menu is tapped
    Then Left menu appears
    And I click on settings
    And Enable month limit
    And Limit the monthly expense
    And Tap color remind button
    And Input amount to warn
    And Scroll to bottom
    And Pick a color
    And Tap month forbidden button
    And Change account book name
    And Change password
    And Sort by tags

    When I click on Custom Link
    And View Current Expenses
    Then Current Expenses should be viewed by date





