package application;

import entities.Word;

public class UI {

	public static void printGame(Word word, char[] progress, char[] typedLetters) {
		// Clear Screen
		System.out.print("\033[H\033[2J");
		System.out.flush();
		
		// Theme
		System.out.println(word.getTheme());
		
		// Typed Letters
		System.out.print("[");
		for(int i = 0; i < typedLetters.length; i++) {
			if(typedLetters[i] != ' ') {
				System.out.print(typedLetters[i] + ", ");
			}
		}
		System.out.println("]");
		
		System.out.println(word.getWord());
		
		// Progress
		for(int i = 0; i < progress.length; i++) {
			System.out.print(progress[i] + " ");
		}
		System.out.println();
	}
}
