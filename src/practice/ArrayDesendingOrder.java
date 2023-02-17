package practice;

public class ArrayDesendingOrder
{
  public static void main(String[] args)
  {
	int a[]= {10,65,66,46552,46,266,652,6566,6465};
	int temp;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.print("Array in descending order is:");
     
	for(int z:a)
	{
		System.out.print(z+",");
	}
  }
}
