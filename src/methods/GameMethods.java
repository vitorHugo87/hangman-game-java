package methods;

import exceptions.GameException;

public class GameMethods {

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
