package sarathy.manoj.ManojSarathyJava.files;

import java.io.File;
import java.io.IOException;

public class Creation 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("D:\\Course backups\\Java\\SarathyManoj\\TomHolland.doc");
		file.createNewFile();
		System.out.println(file.getAbsolutePath()+" has created");
	}
}
