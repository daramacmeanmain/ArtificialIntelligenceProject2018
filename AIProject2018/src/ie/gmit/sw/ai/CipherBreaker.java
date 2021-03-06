package ie.gmit.sw.ai;

import java.io.IOException;
import java.util.Scanner;

//import java.io.IOException;

public class CipherBreaker {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		String filename = "";
		
		System.out.println("Select an option");
		System.out.println("=========================");
		System.out.println("1. Decrypt text from file");
		System.out.println("2. Decrypt text from URL");
		System.out.println("=========================");
		int choice = sc.nextInt();
		
		while(choice == 1 || choice == 2)
		{
			while(choice == 1){
				SADecrypt sd = new SADecrypt();
			}
			
			if(choice == 1)
				FileUpload.readFile(filename);
			
			else if(choice == 2)
				FileUpload.readFileURL();
			
			else
				System.out.println("Please select 1 or 2");
		}

	}

}
