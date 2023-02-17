package practice;

public class ArrayAscending
{
   public static void main(String[] args)
   {
	int a[]= {10,25,45,36,35,20,45,};
	int temp;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.print("Array in ascending order is:");
	for(int z:a)
	{
		System.out.print(z+",");
	}
   }
}
