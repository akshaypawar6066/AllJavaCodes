package practice;

public class OccuranceOfCharacter
{
   public static void main(String[] args)
   {
     String s="Akshay Pawar India";
      int a=s.length();
      int b=s.replace("a", "").length();
      int c=a-b;
      System.out.println("Occurance of a is:"+c);
   }
}
