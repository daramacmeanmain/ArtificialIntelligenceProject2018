package ie.gmit.sw.ai;

import java.io.IOException;

//import java.io.IOException;

public class CipherBreaker {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws IOException {
		FileUpload fu = new FileUpload();
		//PlayfairTable pf = new PlayfairTable();
		SADecrypt s = new SADecrypt();
		
		String filename = "";
		fu.readFile(filename);
		
		fu.fourGram();
		
		//s.scoreFitness(null);

	}

}
