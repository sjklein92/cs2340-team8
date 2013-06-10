
public class Player {
	private String name;
	//private Planet planet;
	private int numFleets;
	
	public Player(String name){
		this.name = name;
	}
	/**
	 * 
	 * @return Number of fleets a player has
	 */
	
	public int getFleets(){
		return numFleets;
	}
	
	/**
	 * Called when a player is attacked, removes a player's fleet
	 */
	public void removeFleet(){
		numFleets--;
	}
	
	/**
	 * Sets the number of fleets a Player has based on how many player's 
	 * Are playing risk
	 * @param newNumFleets
	 */
	public void setNumFleets(int newNumFleets){
		numFleets = newNumFleets;
	}
	
	/**
	 * 
	 * @return Name of the player
	 */
	
	public String getName(){
		return name;
	}
}
