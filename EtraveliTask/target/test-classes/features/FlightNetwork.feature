Feature: TC-001 Flightnetwork features

  @FN-001
  Scenario Outline: User needs to complete all the required fields
    Given User lands on main page
    Then user selects flight type "<flightType>"
    When user selects departure airport "<departureAirport>"
    And user selects arrival airport "<arrivalAirport>"
    And user selects departure date "<departureDate>"
    And user selects return date "<returnDate>"
    And user selects adult number "<adultNumber>"
    And user selects children number "<childNumber>"
    And user selects infants number "<infantsNumber>"
    And user selects status "<statu>"
    And User can click direct flight button and search flight button
    Then user should see "<flightResult>"
    Then User can click Filter button and can be applied
    And User verify the changes

    Examples: Flight
      | flightType | departureAirport | arrivalAirport | departureDate   | returnDate      | adultNumber | childNumber | infantsNumber | statu    | flightResult                                              |
      | RETURN     | Athens           | Rome           | Thu Sep 15 2022 | Sun Sep 18 2022 | 1           | 2           | 0             | Business | Athens - Rome Thu 15 Sep - Sun 18 Sep 1 adult, 2 children |
        #|      ONE-WAY       |London            |Berlin          |Mon Oct 10 2022  |Sun Sep 16 2022  |2            |0            |1              |ECONOMY  |London - Berlin Mon Oct 10 - Sun Sep 16 2 adult, 1 infants |
       # |            |Istanbul             |Amsterdam        |Wed Nov 2 2022|0               |2            |0            |0              |ECONOMY  |London - Berlin Mon Oct 10 2 adult                         |

