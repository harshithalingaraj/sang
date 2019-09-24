Feature: Login process
	To check the login function of testme app
	Scenario Outline: To check login process
	Given enter the "http://10.232.237.143:443/TestMeApp/login.htm" 
	And enter "<username>"
	And Enter "<password>"
	Then click login button
	
Examples:
	
	|username  |password   |
	|lalitha   |password123|