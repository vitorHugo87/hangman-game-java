package entities;

public class Word {

	String word;
	String theme;
	
	public Word(String word, String theme) {
		this.word = word;
		this.theme = theme;
	}

	public String getWord() {
		return word;
	}

	public String getTheme() {
		return theme;
	}
}
