Feature: Test blog resource

  Scenario: GET
    Given url applicationBaseUrl
    Given path '/hello'
    When method get
    Then status 200
    And match response == 'Willkommen zu DevOps'