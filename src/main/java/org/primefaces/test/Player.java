package org.primefaces.test;

import java.io.Serializable;
import java.util.Objects;

public class Player implements Serializable {

	private Integer id;
	private String name;
	
	Player(Integer id, String name){
		this.id = id;
		this.name = name;
	}
	
   @Override
   public boolean equals(Object obj) {
          if(obj == null)
                  return false;

          if(!(obj instanceof Player))
                  return false;

          Player compare = (Player) obj;

          return Objects.equals(compare.getId(), this.getId());
   }

   @Override
   public int hashCode() {
          int hash = 1;
      return hash * 31 + this.getName().hashCode();
   }	
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
