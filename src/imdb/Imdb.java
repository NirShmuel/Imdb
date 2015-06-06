package imdb;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import exception.InvalidNameException;
import exception.InvalidRankException;

public class Imdb {
	
	
	// Attributes
	private Map<String,Movie> movies;
	
	// Constructors
	public Imdb(){
		movies = new HashMap<String, Movie>();
	}

	
	// Methods
	public Map<String, Movie> getMovies() {
		return movies;
	}	
	
	public void addMovie(String name, Set<String> actors){
		Movie newMovie = new Movie(name, actors);
		this.movies.put(name, newMovie);
	}
	
	public void vote(String name, int voting) throws InvalidRankException, InvalidNameException{
		if(this.movies.containsKey(name)){
			movies.get(name).upDateRank(voting);
		}else{
			throw new InvalidNameException("Movie with this name does not exist in DB.");
		}
		
	}
	// add;Matrix;kiano reieves; nir
	public List<Movie> getTop(){
		
	}

}
