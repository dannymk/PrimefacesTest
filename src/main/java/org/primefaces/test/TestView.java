package org.primefaces.test;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import lombok.Data;

@Data
@Named
@ViewScoped
public class TestView implements Serializable {
    
    private String hello;
	 
	 private List<Player> available;
	 private Player selected;
	 
	 @Inject
	 PlayerService service;
    
    @PostConstruct  
    public void init() {
        setHello("Welcome to PrimeFaces!!!");
        this.available = service.getAvailable();
		  
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

	/**
	 * @return the selected
	 */
	public Player getSelected() {
		return selected;
	}

	/**
	 * @param selected the selected to set
	 */
	public void setSelected(Player selected) {
		this.selected = selected;
	}

	/**
	 * @return the hello
	 */
	public String getHello() {
		return hello;
	}

	/**
	 * @param hello the hello to set
	 */
	public void setHello(String hello) {
		this.hello = hello;
	}

}
