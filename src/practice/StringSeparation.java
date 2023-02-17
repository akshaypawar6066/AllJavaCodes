package practice;

public class StringSeparation
{
  public static void main(String[] args)
  {
	String s="gagjd6527672656e7278446s5fsgj^#^%^%&$";
	String letter="";
	String number="";
	String symbol="";
	int sum=0;
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(Character.isAlphabetic(c))
		{
			letter=letter+c;
			
		}
		else if(Character.isDigit(c))
		{
			
			int d=Character.getNumericValue(c);
			number=number+d;
		}
		else
		{
			symbol=symbol+c;
		}
	}
	System.out.println("Letters are:"+letter);
	System.out.println("Numbers are:"+number);
	System.out.println("Symbols are:"+symbol);
	
	
  }
}
