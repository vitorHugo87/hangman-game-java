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
