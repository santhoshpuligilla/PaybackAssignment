Feature: PaybackCoupons
  Scenario: Launching of Coupons view from application
    Given User login into Payback application
    When User selects Coupons from menu items
    And Coupons view is displayed
    Then User activates if any coupon is available
