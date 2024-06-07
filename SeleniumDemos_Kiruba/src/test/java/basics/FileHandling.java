package basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\shimu\\eclipse-workspace\\SeleniumDemos_Kiruba\\FileTest\\sample.txt");
	
		f.createNewFile();
		
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\shimu\\eclipse-workspace\\SeleniumDemos_Kiruba\\FileTest\\sample.txt"));
	
		String line;
		
		while ((line = reader.readLine()) != null) {
            
			   System.out.println(line);
     
		}
    }
	
}

