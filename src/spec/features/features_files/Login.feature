
@login
Feature: Authentification
  en tant qu utilisateur je souhaite tester la page de connexion de l application Swag Labs
 
  @connexion-casPassant
  Scenario: je souhaite tester la page de la connexion avec un cas passant
    Given j accede à l application SwagLabs
    When je saisi le username "standard_user"
    And je saisi le mot de passe "secret_sauce"
    And je clique sur le bouton de connexion
    Then je me redirige vers la page d acceuil "Products"
    @connexion-casNonPassant
    Scenario: je souhaite tester la page de la connexion avec un cas non passant
    Given j accede à l application SwagLabs
    When je saisi le username "najla"
    And je saisi le mot de passe "secret_sauce"
    And je clique sur le bouton de connexion
    Then un message d erreur s affiche "pic sadface: Username and password do not match any user in this service"
    
    
    
    
    