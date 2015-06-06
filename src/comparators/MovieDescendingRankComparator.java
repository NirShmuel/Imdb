package comparators;

import imdb.Movie;

import java.util.Comparator;

public class MovieDescendingRankComparator implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		if ( o1.getRank() > o2.getRank() ){
			return -1;
		}else if( o1.getRank() < o2.getRank()){
			return 1;
		}else{
			return 0;
		}
	}

}
