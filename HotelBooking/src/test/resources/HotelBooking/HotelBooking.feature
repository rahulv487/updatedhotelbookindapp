#Author: Rahul

Feature: HotelBooking

Background: user is already logged in and is navigated to hotel Booking page.

Scenario: check the title
Given User is on hotel booking page
Then check the heading of page

Scenario: Successful hotel booking with all valid data
Given User is on hotel booking page
When user enters all valid data
Then navigate to welcome page

Scenario: Failure in hotel booking on leaving the first Name empty
Given User is on hotel booking page
When user leaves first name blank
And clicks the button
Then display alert msg

Scenario: Failure in hotel booking on leaving the last Name blank
Given User is on hotel booking page
When user leaves last Name blank and clicks the button
Then display alert msg

Scenario: Failure in hotel booking on incorrect email format
Given User is on hotel booking page
When user enters all data
But user enters incorrect email format and clicks the button
Then display alert msg

Scenario: Failure in hotel booking on leaving mobile no. blank
Given User is on hotel booking page
When user leaves Mobileno balnk and clicks on button
Then display alert msg

Scenario: Failure in hotel booking due to invalid phone no
Given User is on hotel booking page
When user gives incorrect format
|9987456|
|98765432104|
|0321456981|
Then display error msg

Scenario: Failure in hotel booking on leaving address blank
Given User is on hotel booking page
When User leaves the address blank
Then display alert msg

Scenario: Failure in hotel booking on not selecting the city
Given User is on hotel booking page
When user do not select any city
Then display error msg

Scenario: Failure in hotel booking on not selecting the state
Given   User is on hotel booking page
When user does not select any state
Then display error msg 

Scenario Outline: 	Vaildate the number of room alloted
Given User is on hotel booking page
When User enters <numberofGueste>
Then allocate rooms such that 1 room for minimum 3 guests
Examples:
|numberofGuests|
|2|
|6|
|9|

Scenario: Failure in hotel booking on leaving the card holder name blank
Given User is on hotel booking page
When user leaves CardHolderName blank and clicks the button
Then display alert msg

Scenario: Failure in hotel booking on enter card no less than of 16 digits
Given User is on hotel booking page
When User enters card no
And no of digits is !=16
Then display error msg

Scenario: Failure in hotel booking page when cvv is not entered
Given User is on hotel booking page
When User does not enetr any no
Then display error msg

Scenario: Failure in hotel booking page when Expiration month is not entered
Given User is on hotel booking page
When User do not enter any month
Then displays eror msg

Scenario: Failure in hotel booking page when Epiration year is not given
Given User is on hotel booking page
When User does not enter any year
Then display error msg
 

       