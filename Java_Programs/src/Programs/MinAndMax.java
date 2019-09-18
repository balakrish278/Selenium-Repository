package Programs;

import java.util.ArrayList;
import java.util.Collections;

public class MinAndMax {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,3,5,12,5,4,6,6,9,4};
		ArrayList al=new ArrayList();
		
		for(int i=0;i<a.length;i++)
				{
					
					if(!al.contains(a[i]))
					{
						al.add(a[i]);
										
					}			
				}
				System.out.println(Collections.min(al));
				System.out.println(Collections.max(al));
				
			}
		
	

}
