Feature: feature to test login on booking website

  Scenario Outline: Check user can login with valid credentials

    Given user is on website login page
    When user enters <username> and <password>
    And user clicks on login button
    Then user is navigated to dashboard page
    Examples:
    |username|password|
    |user@phptravels.com|demouser|
