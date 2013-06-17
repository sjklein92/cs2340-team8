package edu.gatech.cs2340.risk.model;

//Brad's comment
// some more comments

// Added stuff
/**
 * This is the class for a Planet, which is a terrritory in our version of Risk
 * This class contains pointers to previous and next planets in its star system
 *
 */
public class Planet
{

    Planet prevPlanet, nextPlanet = null;

    /**
    *This sets the prevPlanet for the current Planet
    *@param prevPlanet: the prev planet in the solar system
    */

    public void setPrevPlanet(Planet prevPlanet) {
        this.prevPlanet = prevPlanet;
    }
    
    /**
     * This set's the current Planet's next Planet
     * @param nextPlanet: the next planet in the star system 
     */
    public void setNextPlanet(Planet nextPlanet) {
        this.nextPlanet = nextPlanet;
    }
    /**
    * This get's the current Planet's prevPlanet in the solar system
    * @return prevPlanet: the prev planet in the solar system
    */
    public Planet getPrevPlanet() {
       return prevPlanet;
    }
    /**
    * This get's the current Planet's nextPlanet in the solar system
    * @return nextPlanet: the next planet in the solar system
    */
    public Planet getNextPlanet() {
        return nextPlanet;
    }
}
