Feature: Accessing product with filter

Scenario: Access product via category with applying filter
Given User Launch Chrome Browser
When User open URL "https://www.ebay.com/"
Then Navigate to search by category
And Go to electronics
And click on Cell Phones & Smartphones
Then click on See All option
And apply  filter1
And apply filter2
And apply filter3
And click on apply
Then verify that filter tags are applied
 
