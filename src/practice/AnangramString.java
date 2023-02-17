package practice;

import java.util.Arrays;

public class AnangramString {
	public static void main(String[] args) {
		String s1 = "silent";
		String s2 = "listent";
		s1 = s1.toUpperCase();
		s2 = s2.toUpperCase();
		char c[] = s1.toCharArray();
		char d[] = s2.toCharArray();
		Arrays.sort(d);
		Arrays.sort(c);
		boolean b = Arrays.equals(c, d);
		if (b == true) {
			System.out.println("Anangram");
		} else {
			System.out.println("Not");
		}
   System.out.println("Hello All");
	}
}
