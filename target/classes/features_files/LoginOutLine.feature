@loginOutLine
Feature: AuthentificationOutLine
  je souhaite me conneter a lapplication avec plusieurs comptes

  Scenario Outline: je souhaite me conneter a lapplication avec plusieurs comptes
    Given j accede à l application SwagLabs
    When je saisi le username "<username>"
    When je saisi le mot de passe "<password>"
    When je clique sur le bouton de connexion

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |
