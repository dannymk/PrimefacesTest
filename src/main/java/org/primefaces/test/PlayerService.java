package org.primefaces.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel Maldonado
 */
public class PlayerService implements Serializable{

	private List<Player> available = new ArrayList<>();
	
	public PlayerService() {
		available.add(new Player(1, "One"));
		available.add(new Player(2, "Two"));
		available.add(new Player(3, "Three"));
		available.add(new Player(4, "Four"));
		available.add(new Player(5, "Five"));
		
	}

	/**
	 * @return the available
	 */
	public List<Player> getAvailable() {
		return available;
	}

	/**
	 * @param available the available to set
	 */
	public void setAvailable(List<Player> available) {
		this.available = available;
	}
	
	
}
