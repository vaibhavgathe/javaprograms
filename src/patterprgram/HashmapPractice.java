package patterprgram;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String s = "abcdabcd"; // output--> a2b2c2d2
//		
//		HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
//		
//		for(int i=0;i<=s.length()-1;i++)
//		{
//			char ch = s.charAt(i);
//			if(hm.containsKey(ch))
//			{
//				hm.put(ch, hm.get(ch)+1);
//			}
//			else
//			{
//				hm.put(ch, 1);
//			}
//		}
//		System.out.println(hm);
//		
//		Set<Entry<Character, Integer>> j = hm.entrySet();
//		for(Entry<Character, Integer> l:j)
//		{
//			System.out.println(l.getKey()+" "+l.getValue());
//		}
//	}
		
		String s = "abcdAAASSSABCD";
		
		HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch = s.charAt(i);
			
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
			{
				hm.put(ch, 1);
			}
		
		}
		System.out.println(hm);
		
	       Set<Entry<Character, Integer>> k = hm.entrySet();
	       for(Entry<Character, Integer> l:k)
	       {
	    	   System.out.println(l.getKey()+" "+l.getValue());
	       }
		
		

	 
	    	
	    	

	}
}
