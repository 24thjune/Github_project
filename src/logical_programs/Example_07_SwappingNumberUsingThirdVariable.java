package logical_programs;

public class Example_07_SwappingNumberUsingThirdVariable {

	public static void main(String[] args) 
	{
		int first=10;
		int second=20;
		int temp;
		
		System.out.println("<---Before Swapping--->");
		System.out.println("First Number : "+first);
		System.out.println("Second Number : "+second);
		
		temp=first;
		first=second;
		temp=second;
		
		
		
		System.out.println("<---After Swapping--->");
		System.out.println("First Number : "+first);
		System.out.println("Second Number : "+second);
		
		
	}

}
