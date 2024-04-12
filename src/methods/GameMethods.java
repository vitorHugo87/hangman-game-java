package methods;

public class GameMethods {

	public char[] checkLetter(char[] progress, char letter, String word) {
		for(int i = 0; i < progress.length; i++) {
			if(progress[i] == '_' && letter == word.charAt(i)) {
				progress[i] = letter;
			}
		}
		return progress;
	}
}
