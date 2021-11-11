@SamsungTest
Feature: The user wants to navigate through google and look for the Paybright page and make a search about a product
    
Scenario Outline: A user wants to go to PayBright page and make a search about Samsumg product
    Given A user wants to navigate to google
    When The user enters the name of the <page> page in the search bar
    And The user selects the <page> page
    Then The user validates the <page> page is loaded
    And The user makes a searching for <type> <product> product in the Shop Directory
    Then The user validates the <product> product is loaded in the page

    Examples:
    |page     |type   |product|
    |PayBright|Popular|Samsung|