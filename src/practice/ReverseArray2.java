package practice;

import java.util.Scanner;

public class ReverseArray2 
{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter array size");
	 int n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("Enter array values:");
      for(int i=0;i<a.length;i++)
      {
    	  a[i]=sc.nextInt();
      }
	int start=0;
	int end=a.length-1;
	int temp;
	while(start<end)
	{
		temp=a[start];
		a[start]=a[end];
		a[end]=temp;
		start++;
		end--;
	}
	System.out.println("Reversed Array is:");
	for(int z:a)
	{
		System.out.print(z+",");
	}
  }
}
