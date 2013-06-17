package edu.gatech.cs2340.risk.model;

//Brad's comment x 2
// some more comments

// Added stuff
/**
 * This class contains pointers to previous and next planets in its star system
 *
 */
public class Planet
{

    Planet prevPlanet, nextPlanet = null;

    /**
    * Sets the previous planet in the star system
    * @param prevPlanet the previous planet in the star system
    */
    public void setPrevPlanet(Planet prevPlanet) {
        this.prevPlanet = prevPlanet;
    }
    
    /**
     * 
     * @param nextPlanet: the next planet in the star system 
     */
    public void setNextPlanet(Planet nextPlanet) {
        this.nextPlanet = nextPlanet;
    }
    
    /**
    * Gets the previous planet 
    * @return the previous planet
    */
   public Planet getPrevPlanet() {
       return prevPlanet;
   }
     /**
     * Gets the next planet. 
     * @return the next planet
     */
    public Planet getNextPlanet() {
        return nextPlanet;
    }
}
