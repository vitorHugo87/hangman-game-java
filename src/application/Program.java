package application;

import entities.Word;
import methods.WordMethods;

public class Program {

	public static void main(String[] args) {
		
		WordMethods wordMethods = new WordMethods();
		wordMethods.initialSetup();
		Word result = wordMethods.drawnWord(wordMethods.words);
		
		String[] progress = new String[result.getWord().length()];
		for(int i = 0; i < progress.length; i++) {
			if(result.getWord().charAt(i) != ' ') {
				progress[i] = "_";
			}
			else {
				progress[i] = " ";
			}
		}
		
		System.out.println(result.getTheme());
		System.out.println(result.getWord());
		for(int i = 0; i < progress.length; i++) {
			System.out.print(progress[i] + " ");
		}
		
	}
}
