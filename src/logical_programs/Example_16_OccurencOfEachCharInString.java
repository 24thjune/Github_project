package logical_programs;

import java.util.HashMap;
import java.util.Set;

public class Example_16_OccurencOfEachCharInString {

	public static void main(String[] args) 
	{
		String str="abcab";
		
		HashMap<Character,Integer > mp=new HashMap();
		
		for(int i=0;i<=str.length()-1;i++)
		{
			  char s1 = str.charAt(i);
			  
			  if (mp.containsValue(s1))
			  {
				  mp.put(s1, mp.get(s1)+1);
			  }
			  else 
			  {
                  mp.put(s1, 1);
			  }
			  
		}
		
		//print all duplicate value
//		Set<Character> allkeys = mp.keySet();
//		
//		for(Character keys:allkeys)
//		{
//			System.out.println(keys);
//		}
		
//		//Occurence of each char
//		Set<Character> allkeys = mp.keySet();
//		
//		{
//			System.out.println(allkeys+"_"+mp.get(allkeys));
//		}
		
		
		

	}

}
