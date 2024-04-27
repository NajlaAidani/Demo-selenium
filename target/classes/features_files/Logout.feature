
@logout
Feature: Logout 
  je souhaite me conneter a lapplication et revenir a la page authentification 

  
  Scenario: je souhaite me conneter a lapplication et revenir a la page authentification
    Given j accede à l application SwagLabs
    When je saisi le username "standard_user"
    When je saisi le mot de passe "secret_sauce"
    When je clique sur le bouton de connexion
    And  je me redirige vers la page d acceuil "Products"
    And je clique sur le bouton logout
    And je me redirige vers la page authentification
    

  