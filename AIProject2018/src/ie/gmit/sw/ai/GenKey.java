package ie.gmit.sw.ai;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GenKey {
	
	public static void main(String[] args) {
		String parent = keyGen();
    	System.out.println(parent);
	}
    
   /* public static String keyGen(){
		
    	int a = 97;
        int z = 122;
        int length = 25;
        Random r = new Random();
        StringBuilder buffer = new StringBuilder(length);
        
        for (int i = 0; i < length; i++) {
            int randomLimitedInt = a + (int) 
              (r.nextFloat() * (z - a + 1));
            buffer.append((char) randomLimitedInt);
        }
        
        String randomString = buffer.toString();
        String generatedString = randomString.toUpperCase();
        
		return generatedString;
	}*/
	
	public static String keyGen() {
		 String alphabet = "ABCDEFGHIKLMNOPQRSTUVWXYZ";
		 int index;
		 Random random = ThreadLocalRandom.current();
		 char[] key = alphabet.toCharArray();
		 for (int i = key.length - 1; i > 0; i--) {
			 index = random.nextInt(i + 1);
			 if (index != i) {
				 key[index] ^= key[i];
				 key[i] ^= key[index];
				 key[index] ^= key[i];
			 }
		 }
		 return new String(key);
	}

}
