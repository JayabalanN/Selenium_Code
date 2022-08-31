Feature: user check facebook login functionality 

Scenario: user facebook page on login 
  Given user on facebook login page
  When user pass value email id on email textbox
  And user pass value on password on pass textbox
  And user click logib button
  Then user navigate on facebook home page