package imdb;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
	
	

}
