package logical_programs;

public class Example_19_FindtotolNumberOfStringAndDigit {

	public static void main(String[] args) 
	{
		String str="abc 12 @";
		
	    int countletter=0;
	    int countDigit=0;
	    int countWhiteSpace=0;
	    int countSpecialCharacter = 0;
	    
	    for(int i=0;i<=str.length()-1;i++)
	    {
	        	char s1 = str.charAt(i);
	        	
	        	if (Character.isLetter(s1)) 
	        	{
					countletter++;
				} 
	        	else if(Character.isDigit(s1))
	        	{
                    countDigit++;
				}
	        	else if(Character.isWhitespace(s1))
	        	{
	        		countWhiteSpace++;
	        	}
	        	else if(Character.isWhitespace(s1))
	        	{
	        		countWhiteSpace++;
	        	}
	        	else
	        	{
	        		countSpecialCharacter++;
	        	}
	    }
		
		System.out.println("LetterCount: "+countletter);
		System.out.println("CountNumber: "+countDigit);
		System.out.println("CountSpaced: "+countWhiteSpace);
		System.out.println("CountCharacter : "+countSpecialCharacter);

	}

}
