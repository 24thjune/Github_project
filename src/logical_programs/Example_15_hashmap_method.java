package logical_programs;

import java.util.HashMap;
import java.util.Set;

public class Example_15_hashmap_method {

	public static void main(String[] args) 
	{
        HashMap<Integer, String> mp=new HashMap();
        
        //1: To add key in hashmMap
        mp.put(101, "Sanghpal");
        mp.put(102, "Harshwardhan");
        mp.put(103, "Vaishali");
        mp.put(104, "Sonu");
        
        //2 : To update value in hashMap
        mp.put(101, "SANGHPAL");
        System.out.println(mp);
        
        System.out.println("<---------------------------->?");
        
        //3 : Contains key : To verify specific present data present or not
        System.out.println(mp.containsKey(101));
        
        System.out.println("<----------------------------->");
        
        //4 : To get specific index
        System.out.println(mp.get(101));
        
        //5 : keySet ---> To Get all keys in hashMap
        Set<Integer> AllKeys = mp.keySet();
        for(Integer keys:AllKeys)
        {
            System.out.println(keys);	
        }
        
        System.out.println("<---------------------------->");
        
        //6 : Get all keys and value
        for(Integer keys:AllKeys)
        {
        	System.out.println(keys+"_"+mp.get(keys));
        }
        
        
	
	}

}
