//SNHU CS230 MODULE2_PROJ ONE (added to starter code)
//Team.java
//DEONNE LUDWIG | 01/21/23

package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */
public class Team extends Entity {

	/**
	 * A list of the active players
	 */
	private List<Player> players = new ArrayList<Player>();
	
	/*
	 * Holds the next player identifier
	 */
	private static long nextPlayerId = 1;
 
	
	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
		super(id, name);
	}
	
	public Player addPlayer(String name) {

		// a local player instance
		Player player = null;

		// Iterate to look for existing player with same name
		// if found, simply return the existing instance
		for(Player currentPlayer:players) {
			if(currentPlayer.getName().equals(name)) {
				return currentPlayer;
			}
			
		}
		

		// if not found, make a new player instance and add to list of players
		if (player == null) {
			player = new Player(nextPlayerId++, name);
			players.add(player);
		}

		// return the new/existing player instance to the caller
		return player;
	}

	@Override
	public String toString() {
		return "Team [id = " + super.getId() + ", name = " + super.getName() + "]";
	}
}
