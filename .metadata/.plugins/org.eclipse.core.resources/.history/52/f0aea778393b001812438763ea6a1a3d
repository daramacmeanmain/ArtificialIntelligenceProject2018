package ie.gmit.sw.ai;

import java.util.*;
import java.io.*;

import java.net.URL;

public class FileUpload {

	public List<String> readFileURL() throws IOException{
		
		//dummy url test data
		URL url = new URL("http://www.puzzlers.org/pub/wordlists/pocket.txt");
		BufferedReader in = new BufferedReader(
		new InputStreamReader(url.openStream()));
		String next;
		
		while((next = in.readLine()) != null){
			System.out.println(next);
		}
		
		return null;
	}
	
	@SuppressWarnings("resource")
	public static String readFile(String filename){
		
		filename = "src/hobbitV2.txt";
		
		
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(filename));
	    String next;
	    StringBuilder sb = new StringBuilder();
			while ((next = br.readLine()) != null)
			{
				sb.append(next).append("\n");
				next = br.readLine();
			}
			
			String fileString = sb.toString();
			
			return fileString;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return filename;
	    
	    
		
	}

}
