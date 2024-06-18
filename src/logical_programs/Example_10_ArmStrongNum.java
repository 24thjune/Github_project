package logical_programs;

public class Example_10_ArmStrongNum {

	public static void main(String[] args) 
	{
         int num=371;
         
         int sum=0;
         
         for(int i=num;i>0; i= i/10)
         {
        	 int rem = i%10;
        	 
        	 sum= sum+(rem * rem *rem);
        	 
         }
         
         if (num==sum)
         {
		     System.out.println("Given Number is ArmStrong");	
		 }
         else 
         {
             System.out.println("Given Number is NOt-ArmStrong");
 		}
	}

}
