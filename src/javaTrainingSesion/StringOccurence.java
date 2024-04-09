package javaTrainingSesion;

import java.util.HashMap;
import java.util.Map;

public class StringOccurence {

	public static void main(String[] args) {
	
		
		getCharCount("sonali gawai");
		//String s="sonali";
		//int [] arr=new int[127];
		
		//for(int i=0; i<s.length(); i++) {
			//arr[s.charAt(i)]=arr[s.charAt(i)]+1;
			//System.out.println(arr);
		//}
		
	}
	
	public static void getCharCount(String name) {
		Map<Character, Integer> charMap= new HashMap<Character, Integer>();
		char strArray[]=name.toCharArray();
		for(char c:strArray) {
			
			if(charMap.containsKey(c)) {
				charMap.put(c,charMap.get(c)+1);
			}
			else {
				charMap.put(c,1);
			}
		}
			
			System.out.println(name + ":" + charMap);
		
	}
	

}
