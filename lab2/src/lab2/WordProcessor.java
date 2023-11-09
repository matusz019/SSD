package lab2;

public class WordProcessor implements Counter{
	
	private String text = "Hello my name is bleh";
	
	public void setText(String sample) {
		this.text = sample;
	}
	
	public String getText() {
		return(text);
	}
	
	public int countWords(String sentence) {
		if(sentence == "") {
			String[] words = text.split(" ");
			return (words.length);
		}
		else {
			String[] words = sentence.split(" ");
			return (words.length);
		}
	}
	public int countLetters(String sentence) {
		int letters = 0;
		if(sentence == "") {
			for (int i = 0; i<text.length(); i++) {
				if ( Character.isLetter(text.charAt(i)) )
					letters++;
			}
			return(letters);
		}
		else {
			for (int i = 0; i<sentence.length(); i++) {
				if ( Character.isLetter(sentence.charAt(i)) )
					letters++;
			}
			return(letters);
		}
	}
	public int getLength(String sentence) {
		if(sentence == "") {
			String[] words = text.split(" ");
			return (words.length);
		}
		else {
			String[] words = sentence.split("");
			return (words.length);
		}
	}
}

