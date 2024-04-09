package CommonProgram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountKeyValueOfStringByUsingIterator {

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
		
		Iterator<String> it=wordCount.keySet().iterator();
		while(it.hasNext()) {
			String key=it.next();
			Integer value=wordCount.get(key);
			System.out.println(key+ ":" +value);
		}
		

	}

}
