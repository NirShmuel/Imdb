package imdb;

import java.util.HashSet;
import java.util.Set;

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

	}

}
