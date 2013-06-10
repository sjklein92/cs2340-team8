package src.model;

public class Player {
	private String name;
	//private Planet planet;
	private int numFleets;
	
	public Player(String name){
		this.name = name;
	}
	
	public int getFleets(){
		return numFleets;
	}
	
	public void removeFleet(){
		numFleets--;
	}
	
	public void setNumFleets(int newNumFleets){
		numFleets = newNumFleets;
	}
	
	public String getName(){
		return name;
	}
}
