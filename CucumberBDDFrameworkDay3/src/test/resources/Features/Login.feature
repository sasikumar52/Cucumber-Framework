Feature: Verifying Amazon Product Search

  Scenario: Verifying Amazon Product Search
    Given User is on the Amazon Login page
    When User Search Product
      | TV      |
      | Laptop  |
      | android |
      | IOS     |
    Then User should verify Same Product listed
