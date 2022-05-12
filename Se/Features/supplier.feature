Feature: Testing supplier side of website

  Scenario: Supplier Login and other functionality using valid credentials
    # i) a)Login functionality for valid Supplier
    Given supplier is on login page
    When supplier enters valid email and password
    And supplier clicks on login button
    Then supplier will be navigated to home page
    #ii)Check the dashboard view and check the text "Sales overview and summary"
    And supplier will click on Dashboard
    And supplier to check on text Sales overview and summary
    #iii)Test whether it displays Revenue Breakdown
    And supplier will check for Revenue Breakdown
    # iv)Changing the status from boking to pending and verifying the count in Dashboard
    And supplier will click on Bookings
    And supplier will click on Pending Bookings
    And supplier will convert one of record to Confirmed Bookings
    #v)Check whether modules "Flight","Visa","Tours","Bookings" are displayed and clickable
    And supplier to be taken to main page
    And supplier will check if Flight is displayed and if yes will check if it is clickable
    And supplier will check if Visa is displayed and if yes will check if it is clickable
    And supplier will check if Tours is displayed and if yes will check if it is clickable
    And supplier will check if Bookings is displayed and if yes will check if it is clickable
    And close the application for supplier

  Scenario: Supplier Login using invalid credentials
    # i) a)Login functionality for invalid Supplier
    Given supplier is on login page
    When supplier enters invalid email and password
    And supplier clicks on login button
    Then supplier will be unable to login
    And close the application for supplier
