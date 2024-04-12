package application;

import java.util.Scanner;

import entities.Word;
import exceptions.GameException;
import methods.GameMethods;
import methods.WordMethods;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		GameMethods gameMethods = new GameMethods();
		WordMethods wordMethods = new WordMethods();
		wordMethods.initialSetup();
		Word result = wordMethods.drawnWord(wordMethods.words);
		
		char[] progress = new char[result.getWord().length()];
		for(int i = 0; i < progress.length; i++) {
			if(result.getWord().charAt(i) != ' ') {
				progress[i] = '_';
			}
			else {
				progress[i] = ' ';
			}
		}
		
		System.out.println(result.getTheme());
		System.out.println(result.getWord());
		for(int i = 0; i < progress.length; i++) {
			System.out.print(progress[i] + " ");
		}
		System.out.println();
		
		while(true) {
			try {
				System.out.print("Type a letter: ");
				char letter = sc.next().charAt(0);
				progress = gameMethods.checkLetter(progress, letter, result.getWord());
			}
			catch(GameException e){
				System.out.println(e.getMessage());
				sc.nextLine();
				sc.nextLine();
			}
			
			System.out.print("\033[H\033[2J");
			System.out.flush();
			
			System.out.println(result.getTheme());
			System.out.println(result.getWord());
			for(int i = 0; i < progress.length; i++) {
				System.out.print(progress[i] + " ");
			}
			System.out.println();
		}
			
		//sc.close();
	}
}
