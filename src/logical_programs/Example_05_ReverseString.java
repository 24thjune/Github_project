package logical_programs;

public class Example_05_ReverseString {

	public static void main(String[] args) 
	{
        int orgNum=12345;
        int revNum=0;
        
        for(int i=orgNum;i>0;i=i/10)
        {
        	int rem = i%10;
        	revNum=revNum *10 +rem;
        }
        
        System.out.println(revNum);
	}

}
