Feature: Test Amazon functions
  Background:
    Given I navigate in Amazon page
    When I make a search os a product

  Scenario: As a test Engineer I want to validate a text in a search
    Then I can find a specific text in the page

  Scenario: As a test Engineer I want to use the "PRICE AND DEALS" filter
    Then I can use the "PRICE AND DEALS" filter


