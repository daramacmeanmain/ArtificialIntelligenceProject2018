package ie.gmit.sw.ai;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SADecrypt {
	
	//This class is mostly unsuccessful attempts to implement the simulated annealing algorithm into the project
	
	private PlayfairTable pt = new PlayfairTable();
	private GenKey gk = new GenKey();
	
	//retrieve decrypted text and measure its accuracy
	public double scoreFitness(String fitness){
		String decryptText = pt.getDecode();
		double score = 0;
		long total = 4224127912L;
		String gram;
		double gramVal;
		
		//check the value of a 4gram within the decrypted string
		for(int i = 0; i < decryptText.length(); i = i + 4){
			gram = decryptText.substring(i, i + 4);
			gramVal = FileUpload.fMap.get(gram);
			
			if(gramVal == 0){
				gramVal = 1.0;
			}
			
			score += Math.log10(gramVal / total);
		}
		
		return score;
		
	}
	
	/*public String shuffleKey(String shuffle){
		int index;
		 Random random = ThreadLocalRandom.current();
		 char[] key = shuffle.toCharArray();
		 for (int i = key.length - 1; i > 0; i--) {
			 index = random.nextInt(i + 1);
			 if (index != i) {
				 key[index] ^= key[i];
				 key[i] ^= key[index];
				 key[index] ^= key[i];
			 }
		 }
		 
		 return new String(key);
	}*/
	
	/*public void logProbability(String log){
		for(int i = 10; i >= 0; i--)
			for(int j = 5000; j >= 0; j--){
				String child = shuffleKey(gk.parent);
			}
	}*/

}
