package Programs;

import java.util.ArrayList;
import java.util.Collections;

public class Unique_Char_in_a_String {
	
	static int k = 0,max=0;

	public static void main(String[] args) {
		String str="abbcccdddd";
		String noSpaceStr = str.replaceAll("\\s", "");
		System.out.println(noSpaceStr);
		ArrayList<Character> al=new ArrayList<Character>();

		for(int i=0;i<noSpaceStr.length();i++) {
			
			if(!al.contains(noSpaceStr.charAt(i))) {
				al.add(noSpaceStr.charAt(i));
				k++;
				for(int j=i+1;j<noSpaceStr.length();j++) {
					if(noSpaceStr.charAt(i)==noSpaceStr.charAt(j)) {
						k++;
					}
				}
				//System.out.println(str.noSpaceStr(i));
				//System.out.println("K= "+k);
			}	

			
			if(k==1) {
				System.out.println("Unique char is "+noSpaceStr.charAt(i));
			}


		}
		System.out.println(Collections.max(al));



	}

}
