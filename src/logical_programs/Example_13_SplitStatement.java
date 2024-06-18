package logical_programs;

public class Example_13_SplitStatement {

	public static void main(String[] args) 
	{
		String s="My Name is Sanghpal Nawghare";
		
		String[] ar = s.split(" ");
		System.out.println(ar[3]);
		
		System.out.println("<------------------------------------->");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
		
	}
 
}
