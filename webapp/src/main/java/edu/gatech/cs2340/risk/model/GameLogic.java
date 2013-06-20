package edu.gatech.cs2340.risk.model;

import java.util.*;

/**
 * Game initialization and processing
 */
public class GameLogic
{

    private int numPlayers;
    ArrayList<StarSystem> allTheSystems;
    private ArrayList<Player> players;
    
    public GameLogic (ArrayList<Player> players) {
        this.players = players;
        numPlayers = players.size();
        initializeStarallTheSystems();

    }
    /**
     * Creates a linked system of planets for each player
     * @param player
     * @return
     */
    public ArrayList<StarSystem> initializeStarallTheSystems(){        
        for(Player current: players){
            allTheSystems.add(new StarSystem(current));
        }
        return allTheSystems;
    }
    

}
