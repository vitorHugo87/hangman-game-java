package methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import entities.Word;

public class WordMethods {

	public List<Word> words = new ArrayList<>();
	
	public WordMethods() {
		initialSetup();
	}
	
	public void initialSetup() {
		words.add(new Word("Dog", "Animal"));
		words.add(new Word("Zebra", "Animal"));
		words.add(new Word("Elephant", "Animal"));
		words.add(new Word("Giraffe", "Animal"));
		words.add(new Word("Cheetah", "Animal"));
		
		// Professions
		words.add(new Word("Ethical Hacker", "Profession"));
		words.add(new Word("Urban Planner", "Profession"));
		words.add(new Word("Data Scientist", "Profession"));
		words.add(new Word("Sommelier", "Profession"));
		words.add(new Word("Voice Actor", "Profession"));
		
		// Countries
		words.add(new Word("Japan", "Country"));
		words.add(new Word("Canada", "Country"));
		words.add(new Word("Brazil", "Country"));
		words.add(new Word("Australia", "Country"));
		words.add(new Word("France", "Country"));
	}
	
	public Word drawnWord() {
		Random random = new Random();
		return words.get(random.nextInt(words.size()));
	}
}
