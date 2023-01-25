Feature: Checking the hotel booking functionality of an adactin application
Scenario: login Functionality
Given user Must Enter The Url Before Login
When user Enter the Username In Username Field
And user Enter the Password In Password Field
Then user Clicks The Login It Navigates To The Search Hotel 
Scenario: Search Hotel Functionality
When user Select The Location In Dropdown Box
And user Select The Hotels In Dropdown Box
And user Select The RoomType In Dropdown Box
And user Select The Numbers Of Room In Dropdown Box
And user Enters The Check-In Date In CheckIn Date Field
And user Enters The Check-Out Date In CheckOut Date Field
And user Select The Adults Per Room In Dropdown Box
And user Select The Children Per Room In Dropdown Box
Then user Clicks Search
Scenario: Select Hotel Functionality
When user Select The Hotel Using Radiobutton
Then user Clicks Continue It Navigates To The Payment Page
