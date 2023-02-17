package practice;

public class DuplicateNoFromArray 
{
  public static void main(String[] args) 
  {
	int a[]= {10,20,30,40,10,30};
	System.out.print("Duplicate number from array is:");
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				System.out.print(a[i]+",");
			}
		}
	}
  }
}
