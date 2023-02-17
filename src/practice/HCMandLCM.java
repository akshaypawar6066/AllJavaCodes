package practice;

import java.util.Scanner;

public class HCMandLCM
{
   public static void main(String[] args)
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter num1:");
	int num1=sc.nextInt();
	System.out.println("Enter num2");
	int num2=sc.nextInt();
	int hcf=1,lcm=1;
	for(int i=1;i<=num1;i++)
	{
		if(num1%i==0&&num2%i==0)
		{
			hcf=i;
		}
	}
	lcm=(num1*num2)/hcf;
	System.out.println("HCF is:"+hcf);
	System.out.println("LCM is:"+lcm);
   }
}
