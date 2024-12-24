Feature: Verifying Fb Login Page

  Scenario: Verifying Fb Login
    Given User is on the Fb Login page
    When User Login
      | Bala  | Sony     |
      | Sasi  | ThinkPad |
      | Mani  | OnePlus  |
      | Arima | Iphone   |
    Then User should verify after login success message

    