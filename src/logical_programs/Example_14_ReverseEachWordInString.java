package logical_programs;

public class Example_14_ReverseEachWordInString {

	public static void main(String[] args) 
	{
       String s1="My name is Sanghpal";
       
       String[] ar = s1.split(" ");
       System.out.println(ar[3]);
       
       System.out.println("<----------------------------->");
       
       for(int i=0;i<=ar.length-1;i++)
       {
    	   String org = ar[i];
    	   String rev="";
    	   
    	   for(int j=org.length()-1;j>=0;j--)
    	   {
    		   rev=rev+org.charAt(j);
    	   }
    	   
    	   System.out.println(rev+" ");
       }
       
	}

}
