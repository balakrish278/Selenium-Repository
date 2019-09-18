package Programs;

public class String_Separation {
	
	
	public static void main(String[] args)  {
		
		java.lang.String s="Test@123#";		
		System.out.println(s.charAt(8));
		StringBuffer alpha = new StringBuffer();  
		StringBuffer num = new StringBuffer();
		StringBuffer special = new StringBuffer(); 
		
		for (int i=0; i<s.length(); i++) 
        { 
            if (Character.isDigit(s.charAt(i))) 
                num.append(s.charAt(i)); 
            else if(Character.isAlphabetic(s.charAt(i))) 
                alpha.append(s.charAt(i)); 
            else 
                special.append(s.charAt(i)); 
        } 
       
        System.out.println(alpha); 
        System.out.println(num); 
        System.out.println(special); 
    } 
	

}
