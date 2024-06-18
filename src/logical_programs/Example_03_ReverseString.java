package logical_programs;

public class Example_03_ReverseString {

	public static void main(String[] args) 
	{
		String org="Sanghpal";
		String rev=" ";
		
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		
		System.out.println(rev);

	}

}
