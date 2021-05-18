Feature:  User Registration

Scenario: User registration with different data
Given User is on registration page
When User enters following user details
| puneet | rawat | automation@gmail.com | 9999990890 | Noida |
| garima | rawat | garima@gmail.com | 78678978 | Aligarh |
Then user registration should be successful


Scenario: User registration with different data with columns
Given User is on registration page
When User enters following user details with columns
|firstname|lastname| emailId              | contact    | Address |
| puneet  | rawat  | automation@gmail.com | 9999990890 | Noida   |
| garima  | rawat  | garima@gmail.com     | 7867897887 | Aligarh |   
Then user registration should be successful