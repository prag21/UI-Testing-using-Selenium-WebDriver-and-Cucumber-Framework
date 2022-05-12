Feature: Testing admin side of website

  Scenario: Admin Login and other functionality using valid credentials
    #i) a)Login functionality using valid credentials
    Given admin is on login page
       
    When admin enters valid email and password
    And admin clicks on login button
    Then admin will be navigated to home page
    # ii)Testing bookings link and displaying invoice of booking where payment is successful
    And admin will click on Bookings
    And admin will click on Paid Bookings
    And admin will click on invoice of one of the record
    # iii)Deleting a record having booking status as cancelled
    And will click on Cancelled Bookings
    And admin will click on delete button
    # iv)Changing the status from boking to pending and verifying the count in Dashboard
    And admin will click on Pending Bookings
    And admin will convert one of record to Confirmed Bookings
    And navigate to booking page
    # v)Checking whether the website link is working and navigating to differnent page
    And click on website
    And close the application for admin

  Scenario: Admin Login using invalid credentials
    # i)b) a)Login functionality using invalid credentials
    Given admin is on login page
  
    When admin enters invalid email and password
    And admin clicks on login button
    Then admin will be unable to login
    And close the application for admin
