Feature: User adactin hotel booking and cancalation the booked hotel

Scenario: Positive login scenario
 Given User in the homepage of adactin
  When  User gives the username and password in login
    Then User submits the login buttons

  Scenario: User search the hotel in adactin hotel page
    Given User select  favourite location on hotel  
    When User select your hotel
    And Select your room type that suitable for you
    And Select your want number of rooms
    And Enter your checkin date with pass the value in valid format
    And Enter your checkout date in future format on valid format
    And Select number of adults counts per room
    And Select childern count it is not mandatory
    Then Submit on search button


  Scenario: Select hotel name
    Given Hotel details check and click
    When  Continue button on click
    Then The page navigate to payment


  Scenario: Hotel booking and payment details fill
    Given Enter the name in firstname field
    When Enter the lastname of field
    And Enter the billing adress on user
    And Enter valid card number
    And Select card type
    And Select valid expiry month of card
    And Select expiry year
    And Enter correct cvv number
    Then Click on booknow button


  Scenario: View Booking confirmation page
    Given click book itinerary button
    Then To navigate myitinerary booked page


  Scenario: hotel booking cancelation
    Given Select cencel box 
    When click the cance button
    Then Logout button click and navigate to home page

