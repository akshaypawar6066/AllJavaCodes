package practice;

public class FactorialNumber
{
  public static void main(String[] args)
  {
	  int num=5;
	int fact=1;
//	while(num>0)
//	{
//		fact=fact*num;
//		num--;
//	}
	for(int i=1;i<=num;i++)
	{
		fact=fact*i;
	}
	System.out.println("Factorail of number is:"+fact);
  }
}
