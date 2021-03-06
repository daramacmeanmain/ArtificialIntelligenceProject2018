package ie.gmit.sw.ai;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GenKey {
	
	//public static final String parent = keyGen();
	
	//adaption of Fisher�Yates Shuffle to shuffle through 25 letter alphabet
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
