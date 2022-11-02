Feature:As a user, I should be to select any vehicle from the Vehicle page(web-table)

  #Background:

  @Login
  Scenario Outline: Login into application with valid credentials.Users view unchecked checkboxes on the Vehicle.
  Users check the first checkbox to check all the cars.Users check any car’s checkbox.
    When Users enter'<Username>' and '<Password>' and login to the homepage
    And Click the Vehicle under the Fleet
    Then Verify all the checkboxes are unchecked
    Then Click the 1st checkbox in the web-table
    Then Verify all the checkboxes also checked
    Then Check any car’s checkbox
    Then Verify the box is checked

    Examples:
      | Username        | Password    |
      | user44          | UserUser123 |
      | user49          | UserUser123 |
      | storemanager75  | UserUser123 |
      | storemanager78  | UserUser123 |
      | salesmanager133 | UserUser123 |
      | salesmanager136 | UserUser123 |




