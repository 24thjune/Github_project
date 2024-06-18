package logical_programs;

public class Example_12_RemoveSpaceInString {

	public static void main(String[] args) 
	{
		String str="a b  c d";
		System.out.println(str);
		
		str=str.replace(" ", "");
		System.out.println(str);

	}

}
