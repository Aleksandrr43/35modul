Feature: An example

  Scenario: chouse city
    Given url or restaurant 'https://dominospizza.ru/'
    Then put the city
    Then chose city 'Люберцы'
    And assert that chousen city is 'Люберцы'

  Scenario: chose absent city
    Given url or restaurant 'https://dodopizza.ru/'
    Then  chose city on dodo 'Караганда'
    And assert that user got message 'Пиццерия в этом городе еще не открылась'

