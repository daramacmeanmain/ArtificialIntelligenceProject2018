package ie.gmit.sw.ai;

import java.io.IOException;

public class Runner {
	//private static String[][] printedTable;
	
	//public static String keyWord = "THEQUICKBROWNFXMPDVLAZYGS";
	//public static String[][] table;
	//public static DecryptFile df = new DecryptFile();
	//public static 
	//public static 
	

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws IOException {
		FileUpload fu = new FileUpload();
		SADecrypt sad = new SADecrypt();
		
		String filename = "";
		fu.readFile(filename);
		//sad.outputDecrypt();
		
	}

}
