Feature: Verifying OmrBranch Login Module

  Scenario Outline: Verify OmrBranch login with valid credentials
    Given User is on the OmrBranch Login page
    When User enter "<userName>" and "<passWord>"
    And User clicks Login button
    Then User should verify after login success message

    Examples: 
      | userName        | passWord  |
      | Sasi@gmail.com  | Sasi@123  |
      | Arima@gmail.com | Arima@123 |
      | Bala@gmail.com  | Bala@123  |
