package logical_programs;

public class Example_08_ReverseNumber {

	public static void main(String[] args) 
	{
         int orgNum=12345;
         
         String org = Integer.toString(orgNum);
         String rev="";
         
         for(int i=org.length()-1;i>=0;i--)
         {
        	 rev= rev+org.charAt(i);
         }
         
         int RevNum = Integer.parseInt(rev);
         System.out.println(RevNum);
	}

};
