@Panier
Feature: Authentification
  je souhaite me conneter a lapplication et commander un article

  Scenario: je souhaite me conneter a lapplication et commander un article
    Given j accede à l application SwagLabs
    When je saisi le username "standard_user"
    When je saisi le mot de passe "secret_sauce"
    When je clique sur le bouton de connexion
    Then  je me redirige vers la page d acceuil "Products"
    And  je commande un article
    And   je verifie le nombre article dans le panier
