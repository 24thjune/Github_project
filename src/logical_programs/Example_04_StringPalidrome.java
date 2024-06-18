package logical_programs;

public class Example_04_StringPalidrome {

	public static void main(String[] args) 
	{
		String org="madam";
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		
	//	System.out.println(rev);
		
		if (rev.equals(org))
		{
		 	System.out.println("Given String is palidrome");
		} 
		else 
		{
            System.out.println("Given String is Not-Palidrome");
		}

	}

}
