Feature: Login with Valid Credentials

    
    
@sanity @regression
  Scenario: Successful Login with Valid Credentials
    Given User Launch browser
     
   #@sanity @regression  
 # Scenario: Successful Login user name and passwrod
 #   When  Enter user name and passwrod
 #   |username     | nag   |
 #   |password     | nag1234  |
     
    @sanity @regression
Scenario: Successful Login user name and passwrod
     When  Enter user name and passwrod
    |username     | password   |
    |nag     | nag1234  |
    |nag1     | nag12342  | 
    
    
@sanity @regression
Scenario Outline: Successful Login user name and passwrod
     When  Enter user name "username"  
     When  Enter user name "password" 
     Example
     |username |password| 
     |nag1	   |nagpwd1|
     |nag2     |nagpwd2|