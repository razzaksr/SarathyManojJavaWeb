package sarathy.manoj.ManojSarathyJava.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAsWriter 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("D:\\Course backups\\Java\\SarathyManoj\\Hiddleson.txt");
		FileWriter writer=new FileWriter(file);
		
		writer.write("Manoj's first file");
		
		writer.close();
		
		System.out.println(file.getName()+" has contents");
	}
}
