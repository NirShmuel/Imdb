package imdb;

import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

import exception.InvalidNameException;
import exception.InvalidRankException;

// I also did change
public class Main {

	public static void main(String[] args) {
		Set<String> acts = new HashSet<String>();
		Movie tempMovie = null;
		
		acts.add("Nir");
		acts.add("Moshe");

		Imdb myMovieDB = new Imdb();
		
		
		
		myMovieDB.addMovie("Movie1", acts);
		myMovieDB.addMovie("Movie2", acts);
		myMovieDB.addMovie("Movie3", acts);
		myMovieDB.addMovie("Movie4", acts);
		myMovieDB.addMovie("Movie5", acts);
		myMovieDB.addMovie("Movie6", acts);
		myMovieDB.addMovie("Movie7", acts);
		myMovieDB.addMovie("Movie8", acts);
		
		int movieNumber = 0;
		
		try {
			for (int i = 0 ; i < 30 ; i++ ){
				movieNumber = 1 + (int)(Math.random()*8);
				myMovieDB.vote("Movie" + movieNumber , (int)(Math.random()*11 ));
			}
			
		} catch (InvalidNameException e){
			JOptionPane.showMessageDialog(null, e.getMessage());		
		} catch (InvalidRankException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		System.out.println( myMovieDB.getTop(4) );
		
		
		
		
		tempMovie = new Movie("Movie9", acts);
		
		try {
			tempMovie.addActor("Noah");
		} catch (InvalidNameException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
			
	}

}
