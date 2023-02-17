package practice;

public class VowelsAndConsonent 
{
	public static void main(String[] args)
	{
		String s="I love my india";
		s=s.toUpperCase();
		int vowels=0,consonent=0;
		  for(int i=0;i<s.length();i++)
		  {
			  char c=s.charAt(i);
			  if(c!=' '&&c!='.')
			  {
				  if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
				  {
					  vowels++;
				  }
				  else
				  {
					  consonent++;
				  }
			  }
		  }
		  System.out.println("Number of vowels are:"+vowels+" and Number of cosenent are:"+consonent);
	}
  
}
