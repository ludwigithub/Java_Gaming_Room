//SNHU CS230 MODULE2_PROJ ONE (added to starter code)
//Game.java
//DEONNE LUDWIG | 01/21/23

package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */
public class Game extends Entity {
	
	/**
	 * A list of the active teams
	 */
	private List<Team> teams = new ArrayList<Team>();

	/*
	 * Holds the next team identifier
	 */
	private static long nextTeamId = 1;

	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
		super(id, name);
	}

	public Team addTeam(String name) {

		// a local team instance
		Team team = null;

		// Iterate to look for existing team with same name
		// if found, simply return the existing instance
		for(Team currentTeam:teams) {
			if(currentTeam.getName().equals(name)) {
				return currentTeam;
			}
			
		}
		

		// if not found, make a new team instance and add to list of teams
		if (team == null) {
			team = new Team(nextTeamId++, name);
			teams.add(team);
		}

		// return the new/existing team instance to the caller
		return team;
	}

	@Override
	/**
	 * @return String to display Team Id and names of teams
	 */
	public String toString() {

		return "Game [id = " + super.getId() + ", name = " + super.getName() + "]";
	}


}

