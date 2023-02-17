package practice;

import java.util.Scanner;

public class LargestAmounghFour
{
   public static void main(String[] args)
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number1");
	int a=sc.nextInt();
	System.out.println("Enter number2");
	int b=sc.nextInt();
	System.out.println("Enter number3");
	int c=sc.nextInt();
	System.out.println("Enter numbe4r");
	int d=sc.nextInt();
	if(a>b&&a>c&&a>d)
	{
		System.out.println("Largest number is a:"+a);
	}
	else if(b>c&&b>d)
	{
		System.out.println("Largest number is b:"+b);
	}
	else if(c>d)
	{
		System.out.println("Largest number is c:"+c);
	}
	else
	{
		System.out.println("Largest number is d:"+d);
	}
   }
}
