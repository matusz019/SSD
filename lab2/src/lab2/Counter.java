package lab2;

public interface Counter {
	int countWords(String sentence); //counts the words in the input string
	int countLetters(String sentence); //Counts the amount of letter in the input string
	int getLength(String sentence); // Gets the length of the input string
	String getText();
	void setText(String sample);
}
