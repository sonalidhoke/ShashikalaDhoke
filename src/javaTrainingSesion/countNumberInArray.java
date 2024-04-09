package javaTrainingSesion;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class countNumberInArray {

	public static void main(String[] args) {
		
		FindDSring("java is best language is java");
	}
		//String array= "java is best language is java";
		public static void FindDSring(String inputString) {
		
		String words[]=inputString.split(" ");
		Map<String, Integer> wordCount=new HashMap<String,Integer>();
		
		for(String word:words) {
			if(wordCount.containsKey(word)) {
				wordCount.put(word,wordCount.get(word)+1);
				
			}
			else {
				wordCount.put(word, 1);
			}
		}
		
		Set<String> wordsInString=wordCount.keySet();
		
		for(String word:wordsInString) {
			if(wordCount.get(word)>1) {
				System.out.println(word + " : "+ wordCount.get(word));
			}
		}
		

	}

}
