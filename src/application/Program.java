package application;

import entities.Word;
import methods.WordMethods;

public class Program {

	public static void main(String[] args) {
		
		WordMethods wordMethods = new WordMethods();
		wordMethods.initialSetup();
		Word result = wordMethods.drawnWord(wordMethods.words);
		
		System.out.println(result.getWord());
		System.out.println(result.getTheme());
	}
}
