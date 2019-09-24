Feature: To test number of fruits
Scenario Outline: To check the number of fruits
		Given There are "<start>" friuts
		 			|type   |  with|
		 			|apples |    me|
		 			|oranges|sangee|
		 			When I eat "<eat>" fruits
		 			Then I have "<left>" fruits
		 			
    Examples: 
      | start  | eat   | left  |
      | 12     |     5 | 7     |
      | 10     |     7 | 3     |
