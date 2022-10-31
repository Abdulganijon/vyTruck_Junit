Feature:As a user, I should be to select any vehicle from the Vehicle page(web-table)

  #Background:
  @Login
  Scenario Outline: Login into application with valid credentials
    When Users enter'<Username>' and '<Password>' and login to the homepage
    And Click the Vehicle under the Fleet
    Examples:
      | Username       | Password    |
      | user44         | UserUser123 |
      | storemanager75 | UserUser123 |


  Scenario: users view unchecked checkboxes on the Vehicle
    Then Verify all the checkboxes are unchecked

  Scenario: users check the first checkbox to check all the cars
    And Click the 1st checkbox in the web-table
    Then Verify all the checkboxes also checked

  Scenario: users check any car’s checkbox
    And Check any car’s checkbox
    Then Verify the box is checked
