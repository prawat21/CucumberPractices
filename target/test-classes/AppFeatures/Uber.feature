@All
Feature: Uber Booking Feature

@Smoke
Scenario: Booking Cab Sedan
Given User wants to select a car type "sedan" from uber app
When user select car "Aspire" and pick up point "Noida" and drop location "Aligarh"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD


@Regression @Smoke
Scenario: Booking Cab SUV
Given User wants to select a car type "SUV" from uber app
When user select car "KIA" and pick up point "Noida" and drop location "Delhi"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

@Prod
Scenario: Booking Cab Mini
Given User wants to select a car type "Mini" from uber app
When user select car "Santro" and pick up point "Noida" and drop location "Aligarh"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD