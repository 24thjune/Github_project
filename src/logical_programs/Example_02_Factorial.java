package logical_programs;

public class Example_02_Factorial {

	public static void main(String[] args) 
	{
		int num=5;
		int fact=1;
		
		for(int i=num;i>1;i--)
		{
			fact=fact*i;
		}
		
		System.out.println(fact);

	}

}
