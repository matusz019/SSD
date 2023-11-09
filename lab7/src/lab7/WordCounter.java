package lab7;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WordCounter {
	/**
	 * Maps words to their occurrence count.
	 */
	private final Map<String, Integer> wordMap = new HashMap<String, Integer>();
	public void addWord(String word) {
		int duplicate = 1;
		if (wordMap.containsKey(word)) {
			duplicate += 1;
			wordMap.put(word, duplicate);
		}else {
			wordMap.put(word, 1);
		}
	}
	public void addSentence(String sentence) {
		for (String words : (sentence.split(" "))) {
			addWord(words);
		}
	}
	
	public void outputResults() {

		 for(Entry<String, Integer> entry : wordMap.entrySet()) {

			 String word = entry.getKey(); // get the key
			 Integer duplicate = entry.getValue(); // get the associated value
			 System.out.println(word + " : " + duplicate);
		 }
	}
	
	
	
}
