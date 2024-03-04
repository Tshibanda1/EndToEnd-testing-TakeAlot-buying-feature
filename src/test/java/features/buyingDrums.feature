Feature: Testing buying feature on TakeALot

  Background:
    Given User is on TakeALot landing page

  Scenario: User purchases pearl drum set on takealot website
    When user searches "Pearl DrumSet"
    Then user chooses a drum set from given option
    And adds chosen drumSet to cart


  Scenario: User tries to buy Apple MacBook Air 13-inch
    When user searches laptop "Apple MacBook Air 13-inch"
    Then user chooses macbook and selects the gold color MacBook
    And user user adds item to cart and proceeds to checkout