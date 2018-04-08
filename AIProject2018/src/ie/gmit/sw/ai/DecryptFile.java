package ie.gmit.sw.ai;

import java.awt.Point;
import java.io.IOException;
import java.util.List;

public class DecryptFile extends FileUpload{
	
	/*public static Runner r = new Runner();
	
	@SuppressWarnings("static-access")
	private String keyword = r.keyWord;
	private String[][] table = this.cipherTable(keyword);
	private String fuString;
	private String output = FileUpload.readFile(fuString);
	private String decodedOutput = decode(output);

	public DecryptFile(){
		
		this.printDecode(decodedOutput);
		
	}
	
	public void outputDecrypt() throws IOException{
		
		
		//lString = FileUpload.ls.toString();
		//System.out.println(keyword);
		//printTable(table);
		//printDecode(decodedOutput);
		
	}
	
	public String[][] cipherTable(String key){
		 String[][] playFairTable = new String [5][5];
		 
		 for(int i = 0; i < 5; i++)
		      for(int j = 0; j < 5; j++)
		        playFairTable[i][j] = "";
		 
		 
		 for(int k = 0; k < keyword.length(); k++){
		      boolean repeat = false;
		      boolean used = false;
		      for(int i = 0; i < 5; i++){
		        for(int j = 0; j < 5; j++){
		          if(playFairTable[i][j].equals("" + keyword.charAt(k))){
		            repeat = true;
		          }else if(playFairTable[i][j].equals("") && !repeat && !used){
		        	  playFairTable[i][j] = "" + keyword.charAt(k);
		            used = true;
		          }
		        }
		      }
		    }
		 
		 //System.out.println(playFairTable);
		 
		return playFairTable;
		 
	 }
	 
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
	 		  
	 		  // prints results (encoded and decoded)
	 		  public void printDecode(String dec){
	 		    System.out.println("Decoded text:");
	 		    System.out.println(dec);
	 		  }*/

}
