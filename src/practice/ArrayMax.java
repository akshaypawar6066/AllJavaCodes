package practice;

public class ArrayMax 
{
   public static void main(String[] args) 
   {
	int a[]= {10,5132,632,6336232,624};
	int max=Integer.MIN_VALUE;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.println("Maximum number from arera is:"+max);
   }
}
