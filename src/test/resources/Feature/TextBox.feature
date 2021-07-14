Feature: TextBox
  I want to view textbox on screen

  @TC_EL_TB_1
  Scenario: Verify on entering data to all textfield
    Given Open home page
    And Valid data to all textfield
      | txtUserName | txtEmail       | txtCurrentAddress | txtPermanentAddress |
      | MyKieu      | kieu@gmail.com | DaNang            | QuangNam            |
    And   Click to submit
    Then  The website display data in textbox correct
      | MyKieu | kieu@gmail.com | DaNang | QuangNam |

  @TC_EL_TB_2
  Scenario:  Verify empty current address Textfield
    Given Open home page
    And  Valid data to all textfield
      | txtUserName | txtEmail       | txtCurrentAddress | txtPermanentAddress |
      | MyKieu      | kieu@gmail.com |                   | QuangNam            |
    And Click to submit
    Then The website display data in textbox correct
      | txtUserName | txtEmail       | txtCurrentAddress | txtPermanentAddress |
      | MyKieu      | kieu@gmail.com |                   | QuangNam            |

  @TC_EL_TB_3
  Scenario:Verify email textfield
    Given Open home page
    And Valid data to all textfield
      | txtUserName | txtEmail | txtCurrentAddress | txtPermanentAddress |
      | MyKieu      | kieu     | Da Nang           | QuangNam            |
    And   Click to submit
    Then  The website display input with color red

  @TC_EL_TB_4
  Scenario: Verify  textfield contain symbol
    Given Open home page
    And Valid data to all textfield
      | txtUserName | txtEmail       | txtCurrentAddress | txtPermanentAddress |
      | ""          | kieu@gmail.com | DaNang            | QuangNam            |
    And Click to submit
    Then  The website display data in textbox correct
      | "" | kieu@gmail.com | DaNang | QuangNam |
