package patterprgram;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Set;

public class HAshMAPforSTringCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "abcdabcd";
		
		
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

		Set<java.util.Map.Entry<Character, Integer>> values = hm.entrySet();	
		
		for(java.util.Map.Entry<Character, Integer> j:values)
		{
			System.out.println(j.getKey()+" "+j.getValue());
		}
		
		
	}

}
