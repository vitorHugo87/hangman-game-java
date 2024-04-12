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
		Word result = wordMethods.drawnWord();
		
		char[] progress = gameMethods.initializeProgress(result);
		char[] typedLetters = gameMethods.initializeTypedLetters(26);
		
		while(true) {
			UI.printGame(result, progress, typedLetters);
			try {
				System.out.print("Type a letter: ");
				char letter = sc.next().charAt(0);
				typedLetters = gameMethods.checkOccurrences(typedLetters, letter);
				progress = gameMethods.checkLetter(progress, letter, result.getWord());
			}
			catch(GameException e){
				System.out.println(e.getMessage());
				sc.nextLine();
				sc.nextLine();
			}
		}
			
		//sc.close();
	}
}
