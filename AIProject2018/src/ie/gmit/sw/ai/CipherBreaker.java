package ie.gmit.sw.ai;

//import java.io.IOException;

public class CipherBreaker {
	
	public static String keyWord = "THEQUICKBROWNFXMPDVLAZYGS";
	public static String[][] table;
	public static DecryptFile df = new DecryptFile();
	public static FileUpload fu = new FileUpload();

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		String filename = "";
		fu.readFile(filename);

	}

}
