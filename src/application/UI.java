package application;

import entities.Word;

public class UI {

	public static void printGame(Word word, char[] progress, char[] typedLetters, int errors) {
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
		
		// Hangman
		printHangman(errors);
		
		// Progress
		for(int i = 0; i < progress.length; i++) {
			System.out.print(progress[i] + " ");
		}
		System.out.println();
	}
	
	public static void printHangman(int errors) {
		switch(errors) {
			case 0:
				System.out.println("  +---+\n"
					             + "  |   |\n"
					             + "      |\n"
					             + "      |\n"
					             + "      |\n"
					             + "      |\n"
					             + "============");
				break;
			case 1:
				System.out.println("  +---+\n"
					             + "  |   |\n"
					             + "  O   |\n"
					             + "      |\n"
					             + "      |\n"
					             + "      |\n"
					             + "============");
				break;
			case 2:
				System.out.println("  +---+\n"
								 + "  |   |\n"
					             + "  O   |\n"
					             + "  |   |\n"
					             + "      |\n"
					             + "      |\n"
					             + "============");
				break;
			case 3:
				System.out.println("  +---+\n"
					             + "  |   |\n"
					             + "  O   |\n"
					             + " /|   |\n"
					             + "      |\n"
					             + "      |\n"
					             + "============");
				break;
			case 4:
				System.out.println("  +---+\n"
					             + "  |   |\n"
					             + "  O   |\n"
					             + " /|\\  |\n"
					             + "      |\n"
					             + "      |\n"
					             + "============");
				break;
			case 5:
				System.out.println("  +---+\n"
					             + "  |   |\n"
					             + "  O   |\n"
					             + " /|\\  |\n"
					             + " /    |\n"
					             + "      |\n"
					             + "============");
				break;
			case 6:
				System.out.println("  +---+\n"
					             + "  |   |\n"
					             + "  O   |\n"
					             + " /|\\  |\n"
					             + " / \\  |\n"
					             + "      |\n"
					             + "============");
				break;
			default:
				break;
			
		}
	}
}
