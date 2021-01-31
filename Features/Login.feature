Feature: Login

  Scenario: Verify title of login page
    Given user has launched chrome browser
    And navigated to facebook.com
    Then verified title
    And quit browser
