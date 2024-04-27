
@ProfilBoulet
Feature: ProfilBoulet
  je souhaite connecter a lapplication et acceder au profil boulet


  Scenario: je souhaite connecter a lapplication et acceder au profil boulet

    Given j accede a lapplication bouletcorp
    When je clique sur le boutton a propos
    And je decent au bas de page
    And je clique sur image sms bleu
    Then je me redirige vers le profil de boulet
    
 