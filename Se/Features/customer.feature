Feature: Testing website on Customer side

  Scenario: Customer Login and other functionality using valid credentials
    #i)a)Login using valid credentials
    Given customer is on login page
    And accept cookies
    When customer enters valid email and password
    And customer clicks on login button
    Then customer will be navigated to home page
    #ii)Testing Links My Bookings,My Funds,My Profile,Logout
    And customer clicks on My Bookings
    And customer clicks on Add Funds
    And customer clicks on My Profile
    And customer clicks on Logout
    #Login since we logged out
    When customer enters valid email and password
    And customer clicks on login button
    #iii)Making automated payment of USD 50
    And customer clicks on Add Funds
    And click on Paypal
    And click on Pay Now
    And click on PayPal
    Then customer will be navigated to paypal
    Then customer enters his Paypal sandbox account email
    And customer clicks on next
    And customer enters his Paypal sandbox account password
    And customer clicks on Login
    And customer clicks on Pay Now
    And customer comes back
    #iv)Check bookings and display the voucher
    And customer clicks on My Bookings with no scroll
    And cutomer clicks on View Voucher for one record
    #v)Read from test case and update address in profile
    And customer clicks on My Profile
    And customer will click on Address Input Box and update the address
    And customer will click on Update Profile
    And close the application for customer

  Scenario: Customer Login using invalid credentials
    #i)b)Login using invalid credentials
    Given customer is on login page
    And accept cookies
    When customer enters invalid email and password
    And customer clicks on login button
    Then customer will be unable to login
    And close the application for customer
