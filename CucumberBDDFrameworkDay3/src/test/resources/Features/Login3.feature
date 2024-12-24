Feature: Verifying Fb Login Page

  Scenario Outline: Verifying Fb Login
    Given User is on the Fb Login page
    When User Login "<userName>" #DataTable always displays last
      | Name  | Password |
      | Sasi  | ThinkPad |
      | Mani  | OnePlus  |
      | Arima | Iphone   |
    Then User should verify after login success message

    Examples: 
      | Message        | UserName              |
      | Welcome Greens | Greens Technology OMR |
