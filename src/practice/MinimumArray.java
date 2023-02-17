package practice;

public class MinimumArray
{
  public static void main(String[] args)
  {
	int a[]= {10,205,46,-25,-26,-10};
	int min=Integer.MAX_VALUE;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.println("Minimun value from array is:"+min);
  }
}
