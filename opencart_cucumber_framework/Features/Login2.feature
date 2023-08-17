Feature: Login with Valid Credentials

    
 
Scenario Outline: Successful Login user name and passwrod
     When  Enter user name "username"  
     When  Enter password "password" 
     Examples: 
     |File |password| 
     |nag1	   |nagpwd1|
     |nag2     |nagpwd2|
 
Scenario: Convert the data table to the user define type
    Given The excel file name and location is given as
      | Location                 | Keyword |  
      | \\testData\\user.json    | Login   |
      
      
      @sanity @regression
Scenario Outline: Convert the data table to the user define type
    Given The excel file3 name and location is given as "<FileLocation>" and "<Keyword>"
    Examples: 
    |FileLocation           |Keyword |  
    |\\testData\\user.json  |Login   |
    |\\testData\\user.json  |Person  |
    |\\testData\\user.json  |Person  |
    |\\testData\\user.json  |Login   |