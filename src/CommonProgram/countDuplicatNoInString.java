package CommonProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class countDuplicatNoInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="java is the best language is java than phython language";
		
		String words[]=str.split(" ");
		
		Map<String , Integer> wordCount=new HashMap<String, Integer>();
		
		for(String word: words) {
			if(wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word)+1);
			}
			else {
				wordCount.put(word, 1);
				//System.out.println(word + ":" + wordCount.get(word));
			}
		}

		Set<String> numcount=wordCount.keySet();
		
		for(String word:numcount) {
			if(wordCount.get(word)>1) {
				System.out.println(word +":" + wordCount.get(word));
			}
		}
	}

}
