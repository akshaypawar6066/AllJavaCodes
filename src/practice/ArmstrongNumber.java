package practice;

import java.util.Scanner;

public class ArmstrongNumber
{
   public static void main(String[] args)
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number");
	int num=sc.nextInt();
	int temp=num;
	int count=0;
	int p;
	int rem, sum=0;
	while(num>0)
	{
	
		num=num/10;
		count++;
	}
	num=temp;
	System.out.println(count);
	while(num>0)
	{
		rem=num%10;
		p=(int)Math.pow(rem, count);
		sum=sum+p;
		num=num/10;
	}
	num=temp;
	if(sum==temp)
	{
		System.out.println("Arm");
	}
	else
	{
		System.out.println("Not arm");
	}
	
	  
   }
}
