package practice;

public class Pyramid 
{
   public static void main(String[] args)
   {
	   for(int b=1;b<=6;b++)
		{
	      for(int a=1;a<=(6-b);a++)
	      {
	    	  System.out.print(" ");
	      }
	      for(int a=1;a<=2*b-1;a++)
	      {
	    	  System.out.print("*");
	      }
	      System.out.println();
	    }
	   for(int b=5;b>=1;b--)
	   {
		   for(int a=1;a<=(6-b);a++)
		   {
			   System.out.print(" ");
		   }
		   for(int a=1;a<=2*b-1;a++)
		   {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
   }
}
