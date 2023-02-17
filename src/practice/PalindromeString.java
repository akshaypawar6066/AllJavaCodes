package practice;

import java.util.Scanner;

public class PalindromeString
{
	public static void main(String[] args)
	{
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter any string:");
		  String s=sc.next();
		  String rev="";
		  for(int i=s.length()-1;i>=0;i--)
		  {
			  rev=rev+s.charAt(i);
		  }
		  if(rev.equals(s))
		  {
			  System.out.println("Palindrome");
		  }
		  else
		  {
			  System.out.println("Not palindrome");
		  }
		  System.out.println(s);
		  System.out.println(rev);
	}

  
}
