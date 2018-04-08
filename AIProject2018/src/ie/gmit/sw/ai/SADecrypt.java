package ie.gmit.sw.ai;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SADecrypt {
	
	private PlayfairTable pt = new PlayfairTable();
	private GenKey gk = new GenKey();
	private FileUpload fu = new FileUpload();
	//private Map<String, Double> fMap = new HashMap<String, Double>();
	//private int temp;
	//private int transitions;
	
	public SADecrypt(){
		//this.temp = temp;
		//this.transitions = transitions;
	}
	
	public double scoreFitness(String fitness){
		String decryptText = pt.getDecode();
		double score = 0;
		long total = 4224127912L;
		String gram;
		double gramVal;
		//double childScore;
		
		
		
		for(int i = 0; i < decryptText.length(); i = i + 4){
			gram = decryptText.substring(i, i + 4);
			gramVal = fu.fMap.get(gram);
			
			if(gramVal == 0){
				gramVal = 1.0;
			}
			
			score += Math.log10(gramVal / total);
		}
		
		
		return score;
		
		
	}
	
	public String shuffleKey(String shuffle){
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
	}
	
	public void logProbability(String log){
		for(int i = 10; i >= 0; i--)
			for(int j = 5000; j >= 0; j--){
				String child = shuffleKey(gk.parent);
			}
	}

}
