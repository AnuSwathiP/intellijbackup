Feature: Google Search Functionality

  Scenario: To validate youtube search functionality
    Given Open youtube
    When Enter valid keyword in youtube Searchbox
    And I hit enterbutton
    Then Search youtube result should display