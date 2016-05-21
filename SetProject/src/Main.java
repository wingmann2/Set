import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		SetSimple simpleSet = null;
		SetAdvanced advancedSet = null;
		List<Object> words = new ArrayList<>();
		
		// Populate words
		words.add("Happy");
		words.add("Birthday");
		words.add("to");
		words.add("me!");
		words.add("me!");
		
		// Create new custom sets
		simpleSet = new SetSimple(words);
		advancedSet = new SetAdvanced(words);
		
		// Print simple
		System.out.println("This is your SetSimple:");
		simpleSet.print();
		
		// Print advanced
		System.out.println("This is your SetAdvanced:");
		advancedSet.print();
	}

}
