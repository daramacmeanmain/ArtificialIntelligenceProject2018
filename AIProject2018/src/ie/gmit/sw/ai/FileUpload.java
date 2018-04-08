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

	public static List<String> readFileURL() throws IOException{
		
		//method unfinished
		//correct functionality not implemented
		
		System.out.println("Enter URL to load");
		Scanner s = new Scanner(System.in);
		String userURL = s.next();
		
		URL url = new URL(userURL);
		BufferedReader br = new BufferedReader(
		new InputStreamReader(url.openStream()));
		String next;
		
		while((next = br.readLine()) != null){
			System.out.println(next);
		}
		br.close();
		s.close();
		
		return null;
	}
	
	@SuppressWarnings("resource")
	public static String readFile(String filename){
		
		//user chooses the name and path of a text file
		System.out.println("Enter full name of text file");
		Scanner s = new Scanner(System.in);
		String userFile = s.next();
		filename = userFile;
		
		//file read into a string
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
	
	//uploads 4grams.txt into a map to be used for fitness scoring
	public Map<String, Double> fourGram() throws IOException{
		
		Stream<String> lines = Files.lines(Paths.get("4grams.txt"));
		
		Map<String, Double> fMap = lines.map(line -> line.split(" ")).collect(Collectors.toMap(line -> line[0], line -> Double.parseDouble(line[1])));
		
		lines.close();
		
		return fMap;
	}

}
