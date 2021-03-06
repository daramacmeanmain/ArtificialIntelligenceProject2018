package ie.gmit.sw.ai;

import java.awt.Point;

public class PlayfairTable {
	
	//playfair table adapted from https://github.com/mckennapsean/code-examples/blob/master/Java/Playfair.java
	
	private static GenKey gk = new GenKey();
	@SuppressWarnings("static-access")
	private static String parent = gk.keyGen();
	private String[][] table = this.cipherTable(parent);
	private String fuString;
	private String output = FileUpload.readFile(fuString);
	private String decodedOutput = decode(output);
	
	public PlayfairTable(){
		this.printTable(table);
		this.printDecode(decodedOutput);
	}
	
	//generates cipher table from the random key
	public String[][] cipherTable(String key){
		 String[][] playFairTable = new String [5][5];
		 String keyString = parent;
		 
		 for(int i = 0; i < 5; i++)
		      for(int j = 0; j < 5; j++)
		        playFairTable[i][j] = "";
		 
		 
		 for(int k = 0; k < keyString.length(); k++){
		      boolean repeat = false;
		      boolean used = false;
		      for(int i = 0; i < 5; i++){
		        for(int j = 0; j < 5; j++){
		          if(playFairTable[i][j].equals("" + keyString.charAt(k))){
		            repeat = true;
		          }else if(playFairTable[i][j].equals("") && !repeat && !used){
		        	  playFairTable[i][j] = "" + keyString.charAt(k);
		            used = true;
		          }
		        }
		      }
		    }
		 
		return playFairTable;
		 
	 }
	
	//decodes the encrypted text
	private String decode(String out){
	    String decoded = "";
	    for(int i = 0; i < out.length() / 2; i++){
	      char a = out.charAt(2*i);
	      char b = out.charAt(2*i+1);
	      int r1 = (int) getPoint(a).getX();
	      int r2 = (int) getPoint(b).getX();
	      int c1 = (int) getPoint(a).getY();
	      int c2 = (int) getPoint(b).getY();
	      if(r1 == r2){
	        c1 = (c1 + 4) % 5;
	        c2 = (c2 + 4) % 5;
	      }else if(c1 == c2){
	        r1 = (r1 + 4) % 5;
	        r2 = (r2 + 4) % 5;
	      }else{
	        int temp = c1;
	        c1 = c2;
	        c2 = temp;
	      }
	      decoded = decoded + table[r1][c1] + table[r2][c2];
	    }
	    
	    return decoded;
	  }

		private Point getPoint(char c){
			
		    Point pt = new Point(0,0);
		    for(int i = 0; i < 5; i++)
		      for(int j = 0; j < 5; j++)
		        if(c == table[i][j].charAt(0))
		          pt = new Point(i,j);
		    return pt;
		}
		  
	//print the decoded text
	  public void printDecode(String dec){
	    System.out.println("Decoded text:");
	    System.out.println(dec);
	  }
	
	//output the cipher table of the decryption key
	private void printTable(String[][] printedTable){
	    for(int i = 0; i < 5; i++){
	      for(int j = 0; j < 5; j++){
	        System.out.print(printedTable[i][j]+" ");
	      }
	      System.out.println();
	    }
	    System.out.println();
	  }
	
	//get the decoded text for fitness score
	 public String getDecode(){
		  
		 String decryptedText = decodedOutput;
		  
		return decryptedText;
	  }

}
