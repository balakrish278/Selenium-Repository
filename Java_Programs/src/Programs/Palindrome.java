package Programs;

import java.lang.String;

public class Palindrome {
	
	public static void main(String[] args) {
	
	String s="Madam";
	System.out.println(s.length());
	
	java.lang.String t="";
	for(int i=s.length()-1;i>=0;i--) {
		t=t+s.charAt(i);
		
	}
	
	System.out.println(t);
	}
	

}
