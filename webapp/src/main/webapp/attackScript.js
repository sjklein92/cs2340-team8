function attackPrompt(planetID) {
      var promptMessage = "Which planet's fleets will you be using to attack planet {0}?";
      String.Format(promptMessage, planetID);
      var attackingPlanetID = prompt(promptMessage);
      
      
    }