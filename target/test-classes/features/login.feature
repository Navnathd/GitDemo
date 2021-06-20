Feature: Login into Application

Scenario Outline: Positive test Validating login
Given Initialize browser with chrome
And navigate to "http://qaclickacademy.com" site
And click on login link in a home page to land on secure login page 
When Enter valid <username> and <password>
Then verify that user is successfully login
And close browsers

Examples:
|username          |password  |
|test99@gmail.com  |123456    |
|test123@gmail.com |456789    |