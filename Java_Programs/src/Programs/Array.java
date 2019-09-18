package Programs;

import java.util.*;

public class Array {
	public static void main(String[] args) {
		int b[][]= {{2,4,5},{1,2,3}};
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				al.add(b[i][j]);
			System.out.println(al);
			}
		}
		System.out.println(Collections.min(al));
	}

}
