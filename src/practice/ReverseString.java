package practice;

public class ReverseString
{
   public static void main(String[] args)
   {
	 String s="Akshay";
	 for(int i=s.length()-1;i>=0;i--)
	 {
		 System.out.print(s.charAt(i));
	 }
	 System.out.println();
	 System.out.println(s);
   }
}
