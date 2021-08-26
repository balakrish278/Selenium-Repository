package Programs;

import java.util.ArrayList;
import java.util.Scanner;

public class No_of_words_in_a_sentence {
	
	
	public static void main(String[] arg) {
		
		String string="Bala works in Infosys Limited";
		int count=0;  
	      
        char ch[]= new char[string.length()]; 
		 for(int i=0;i<string.length();i++)  
         {  
             ch[i]= string.charAt(i);  
             if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                 count++;  
         }  
		 System.out.println(count);
		 ArrayList<String> al=new ArrayList<String>(); 
		String[] words=string.split("\\s");
		for(String w:words) {				
		al.add(w);	
		System.out.println("Word ="+w+" and its lenght ="+w.length());
		
		}
		System.out.println(al.size());
		
	}
}
