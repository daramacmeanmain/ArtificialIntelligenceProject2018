package ie.gmit.sw.ai;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.*;


import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUpload {
	
	public static Map<String, Double> fMap = new HashMap<String, Double>();

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
	
	public Map<String, Double> fourGram() throws IOException{
		
		Stream<String> lines = Files.lines(Paths.get("src/4grams.txt"));
		
		Map<String, Double> fMap = lines.map(line -> line.split(" ")).collect(Collectors.toMap(line -> line[0], line -> Double.parseDouble(line[1])));
		
		lines.close();
		
		//System.out.println(fMap.get("THER"));
		
		return fMap;
	}

}
