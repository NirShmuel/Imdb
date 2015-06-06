package imdb;

import java.util.HashSet;
import java.util.Set;

public class Movie {
	
	private String name;
	private Set<String> actors;
	private double rank;
	private int numOfVoters;
	
	public Movie(String name, Set<String> actors){
		this.actors = new HashSet<String>(); 
		this.name = name;
		this.actors.addAll(actors);
		
	}
	
	public String getName(){
		return name;
	}
	
	public int getRank(){
		return
	}
	
	public Set<String> getActors() {
		return actors;
	}

	
	
}
