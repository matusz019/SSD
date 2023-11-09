package lab2;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter myobj = new WordProcessor();
		
	    System.out.println("Input a sentence:");
	    Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		int Words = myobj.countWords(sentence);
		System.out.println(Words);
		int lengths = myobj.getLength(sentence);
		System.out.println(lengths);
		int letters = myobj.countLetters(sentence);
		System.out.println(letters);
		String text = myobj.getText();
	
	    
	}

}
