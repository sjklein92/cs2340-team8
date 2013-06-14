package src.main.java.model;

// Added stuff
/**
 * This class contains pointers to previous and next planets in its star system
 *
 */
public class Planet
{

    Planet prevPlanet, nextPlanet = null;

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
    
   public Planet getPrevPlanet() {
       return prevPlanet;
   }
    
    public Planet getNextPlanet() {
        return nextPlanet;
    }
}
