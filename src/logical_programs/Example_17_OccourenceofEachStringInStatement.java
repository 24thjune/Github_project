package logical_programs;

import java.util.HashMap;
import java.util.Set;

public class Example_17_OccourenceofEachStringInStatement {

	public static void main(String[] args)
	{
		String str="my name is abc is abc is";
		
		String[] ar = str.split(" ");
		HashMap<String, Integer> mp=new HashMap();
		
		for(int i=0;i<=ar.length-1;i++)
		{
			String s1 = ar[i];
			
			if (s1.contains(s1)) 
			{
				mp.put(s1, mp.get(s1)+1);
			}
			else
			{
               mp.put(s1, 1);
			}
		}
		
		Set<String> keys = mp.keySet();
		
		for(String keys1:keys)
		{
			System.out.println(keys1+"_"+mp.get(keys));
		}
		

	}

}
