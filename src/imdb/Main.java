package imdb;

import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

import exception.InvalidRankException;

public class Main {

	public static void main(String[] args) {
		Set<String> acts = new HashSet<String>();
		
		acts.add("Nir");
		acts.add("Moshe");
				
		Movie a = new Movie("Terminator",acts);
		
		acts.add("Test");
		
		for (String s : a.getActors()){
			System.out.println(s);
		}
		
		try {
			a.upDateRank(11);
		} catch (InvalidRankException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
		}
		
		Set<String> test = new HashSet<String>();

	}

}
