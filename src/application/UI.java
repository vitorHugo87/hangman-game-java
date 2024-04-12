package application;

import entities.Word;

public class UI {

	public static void printGame(Word word, char[] progress) {
		System.out.print("\033[H\033[2J");
		System.out.flush();
		
		System.out.println(word.getTheme());
		System.out.println(word.getWord());
		for(int i = 0; i < progress.length; i++) {
			System.out.print(progress[i] + " ");
		}
		System.out.println();
	}
}
