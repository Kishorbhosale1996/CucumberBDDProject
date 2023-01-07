Feature: Login


Scenario: Access the produt via search
Given User Launch Chrome Browser
When User open URL "https://www.ebay.com/"
And User enters "Vivo mobiles" in searchbox
And User seach with "cell phones & Accessories"
And Click on Search
Then verify page is loaded with "complete"
And Verify first result name matches with search string "Vivo"

