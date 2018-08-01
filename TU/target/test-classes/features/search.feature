@now
Feature: Search


Scenario: Search With Valid Data

Given I am in the homepage
When I enter Valid data
And I select Search Button
Then I should see the Valid Results


Scenario: LogIn 

Given I am in the homepage
When I select login link in homepage
When I enter Valid Username "testtrails2@gmail.com" and Valid Password "test@1234"
And I enter Submit Button
Then I should see my logged in to my account

