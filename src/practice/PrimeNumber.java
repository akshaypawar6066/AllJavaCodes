package practice;

import java.util.Scanner;

public class PrimeNumber 
{
  public static void main(String[] args)
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Any Number:");
	int num=sc.nextInt();
	int temp=0;
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			temp=temp+1;
		}
	}
	if(temp==0)
	{
		System.out.println("Entered number is prime:");
	}
	else
	{
		System.out.println("Entered number is Not prime:");
	}
  }
}
