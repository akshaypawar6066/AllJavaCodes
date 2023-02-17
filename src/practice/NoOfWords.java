package practice;

public class NoOfWords 
{
  public static void main(String[] args)
  {
	 String s="I love my india";
	 String arr[]=s.split(" ");
	 System.out.println("No of words in string are:"+arr.length);
	 System.out.println();
	 for(int i=arr.length-1;i>=0;i--)
	 {
		 System.out.print(arr[i]+" ");
	 }
  }
}
