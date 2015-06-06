package imdb;

import java.util.HashSet;
import java.util.Set;

import exception.InvalidNameException;
import exception.InvalidRankException;
import exception.InvalidSetException;

public class Movie {
	
	private String name;
	private Set<String> actors;
	private double rank;
	private int numOfVoters;
	
	public Movie(String name, Set<String> actors){
		this.actors = new HashSet<String>(); 
		this.name = name;
		this.actors.addAll(actors);
		this.rank = 0;
	}
	
	public String getName(){
		return name;
	}
	
	public double getRank(){
		return rank ;
	}
	
	public int getNumOfVoters(){
		return numOfVoters;
	}
	
	public Set<String> getActors() {
		return actors;
	}
	
	public void setName(String name) throws InvalidNameException{
		if(name != null && !name.isEmpty()){
			this.name = name;
		}else{
			throw new InvalidNameException();
		}
		
		
	}
	
	public void setActors(Set<String> actors) throws InvalidSetException{
		if ( actors != null && !actors.isEmpty() ){
			this.actors = actors;
		}else{
			throw new InvalidSetException();
		}
	}
	
	public void addActor(String actor) throws InvalidNameException{
		if ( actor != null && !actor.isEmpty() ){
			this.actors.add(actor);
		} else {
			throw new InvalidNameException();
		}
	}
	
	public void upDateRank(int rank) throws InvalidRankException{
		double tempRank = numOfVoters * this.rank;
		if(rank > 0 && rank <= 10){
			numOfVoters++;
			this.rank = (tempRank + rank) / numOfVoters;
		} else {
			throw new InvalidRankException();
		}
	}
	
	@Override
	public boolean equals(Object other){
		if(other instanceof Movie){
			Movie otherMovie = (Movie)other;
			return this.name.equals(otherMovie.getName());
		} else {
			return false;
		}
		
		
	}
	
	@Override
	public String toString(){
		return this.name + " \n Featuring: " + this.actors + "\n Ranked: " + this.rank + " by: " + this.numOfVoters + " Voters";
	}
}
