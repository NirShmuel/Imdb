package imdb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import comparators.MovieDescendingRankComparator;
import comparators.MovieNameComparator;
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

	
	/**
	 * 
	 * @param numbint number
	 * @return
	 */
	public List<Movie> getTop(int number) {
		ArrayList<Movie> myMovies = new ArrayList<Movie>(movies.values());
		
		Collections.sort(myMovies,new MovieDescendingRankComparator());		
		
		List<Movie> returnMovies = new ArrayList<Movie>();
		
		for ( int i = 0 ; i < number && i < myMovies.size() ; i++ ){
			returnMovies.add(myMovies.get(i));
		}
		
		return returnMovies;	
	} 
	
	public Collection<Movie> getAll(){
		return movies.values();
	}
	
}
