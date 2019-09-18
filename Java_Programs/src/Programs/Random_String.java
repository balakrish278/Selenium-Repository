package Programs;

import java.util.Random;

public class Random_String {
	public static void main(String[] args) {
	
        String random =generateRandomChars("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 7);
        System.out.println(random);
	    
	}

	
	public static String generateRandomChars(String candidateChars, int length) {
	    StringBuilder sb = new StringBuilder();
	    Random random = new Random();
	    for (int i = 0; i < length; i++) {
	        sb.append(candidateChars.charAt(random.nextInt(candidateChars.length())));
	    }

	    return sb.toString();
	}

	

}
