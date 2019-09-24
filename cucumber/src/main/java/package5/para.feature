
Feature: To check the performance of a tester 

  Scenario Outline: To test the tester
  Given I am a "<Tester_Type>" tester
  When I go to work
  Then I "<Work_Output>" it
  And My boss "<Boss_Action>" me
  But The developer "<Developer_Reaction>" me

  
    Examples: 
      | Tester_Type  | Work_Output | Boss_Action | Developer_Reaction|
      | 5            |    complete | salutes     |hates|
      | 2            |     mess    | fires       |likes|
