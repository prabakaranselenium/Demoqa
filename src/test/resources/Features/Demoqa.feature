#Author: your.email@your.domain.com

@tag
Feature: User is in Demoqa page

  @tag1
  Scenario: Verify 
    Given user is on DemoQa page
    When user clicks  checkbox
    Then user verifies whether the checkbox is selected or not
    When user clicks on the radio button
    Then user verifies whether the radio is selected or not
    When user clicks the dropdown menu
    Then user verifies whether the dropdown default value is same or not