package Programs;

import java.util.Scanner;

public class Integer {
	public static void main(String arg[]) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int s1=1;
		for(int i=1;i<=n;i++) {
			
			s1=m*s1;
			System.out.println(s1);
			
		}
		System.out.println(s1);
	}

}
