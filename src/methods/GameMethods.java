package methods;

import entities.Word;
import exceptions.GameException;

public class GameMethods {

	public char[] initializeProgress(Word result) {
		char[] vet = new char[result.getWord().length()];
		for(int i = 0; i < vet.length; i++) {
			if(result.getWord().charAt(i) != ' ') {
				vet[i] = '_';
			}
			else {
				vet[i] = ' ';
			}
		}		
		return vet;
	}
	
	public char[] initializeTypedLetters(int length) {
		char[] typedLetters = new char[length];
		for(int i = 0; i < length; i++) {
			typedLetters[i] = ' ';
		}
		return typedLetters;
	}
	
	public char[] checkOccurrences(char[] typedLetters, char letter) {
		for(int i = 0; i < typedLetters.length; i++) {
			if(letter == typedLetters[i]) {
				throw new GameException("Character already typed");
			}
		}
		for(int i = 0; i < typedLetters[i]; i++) {
			if(typedLetters[i] == ' ') {
				typedLetters[i] = letter;
				break;
			}
		}
		return typedLetters;
	}
	
	public char[] checkLetter(char[] progress, char letter, String word) {
		if(letter < 'a' || letter > 'z') {
			throw new GameException("Invalid Character! Valid characters: 'a-z'");
		}
		for(int i = 0; i < progress.length; i++) {
			if(progress[i] == '_' && letter == Character.toLowerCase(word.charAt(i))) {
				progress[i] = word.charAt(i);
			}
		}
		return progress;
	}
}
