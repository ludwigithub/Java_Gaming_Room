//SNHU CS230 MODULE2_PROJ ONE MILESTONE Menu (added to starter code)
//GameService.java
//DEONNE LUDWIG | 01/14/23 | 01/21/23(PROJECT ONE)

package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;
	
	/*
	 * Holds the next player identifier
	 */
	private static long nextPlayerId = 1;
	
	/*
	 * Holds the next team identifier
	 */
	private static long nextTeamId = 1;
	
	/**
	 * Hide the default constructor to prevent creating empty instances.
	 */
	private GameService() {
		
	}
	
	

	// FIXME: Add missing pieces to turn this class a singleton 
	
	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	private static GameService instance = new GameService();
	public static GameService getInstance() {
		return instance;
	}
	/**Implementing the singleton pattern
	 * added a private constructor to the GameService class, 
	 * which will prevent attempts to
	 * instantiate more than one instance of
	 * the GameService object
	 */
	
	
	
	/**Using the iterator pattern, 
	 * it will check if a GameService instance
	 * already exists in the ArrayList and 
	 * if not will make one and return it.
	 */
	
	
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same name
		// if found, simply return the existing instance
		for(Game currentGame:games) {
			if(currentGame.getName().equals(name)) {
				return currentGame;
			}
			
		}
		

		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same id
		// if found, simply assign that instance to the local variable
		for(Game currentGame:games) {
			if(currentGame.getId()==id) {
				game = currentGame;
			}
		}
		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same name
		// if found, simply assign that instance to the local variable
		for(Game currentGame:games) {
			if(currentGame.getName().equals(name)) {
				game = currentGame;
			}
		}

		return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
	
	/**
	 * Returns the player id
	 * 
	 * @return the player id
	 */
	public long getNextPlayerId() {
		return nextPlayerId;
	}
	
	/**
	 * Returns the team id
	 * 
	 * @return the team id
	 */
	public long getNextTeamId() {
		return nextTeamId;
	}
	
}