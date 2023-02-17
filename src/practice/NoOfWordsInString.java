package practice;

public class NoOfWordsInString
{
  public static void main(String[] args)
  {
	String s="I love my india";
	int count=1;
	for(int i=0;i<s.length();i++)
	{
		
		if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
		{
			count++;
		}
		
	}
	System.out.println("No of words in string are:"+count);
  }
}
