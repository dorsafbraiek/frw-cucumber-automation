Feature: Je verifie la page d authentification
  En tant que utilisateur je souhaite me connecter au site Mercury
  
  @connexion
  Scenario: Je verifie la page d authentification
    Given Je me connecte sur l aplication Mercury
    When Je saisie le User Name "Test"
    And je saisie le Password "Test"
    And je click sur le boutton Submit
    Then je me redirige a la page home "Login Successfully"
    