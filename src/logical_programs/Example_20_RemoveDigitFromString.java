package logical_programs;

public class Example_20_RemoveDigitFromString {

	public static void main(String[] args) 
	{
	      String str="abcd123xyz";
	      String Str1="";
	      
	      for(int i=0;i<=str.length()-1;i++)
	      {
	    	  char s1 = str.charAt(i);
	    	  
	    	  if (!Character.isDigit(s1))
	    	  {
				  Str1=Str1+s1;
			  }
	      }
	      
	      System.out.println(Str1);

	}

}
