package sarathy.manoj.ManojSarathyJava.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadAsReader 
{
	public static void main(String[] args) throws IOException 
	{
		//File file=new File("D:\\Course backups\\Java\\SarathyManoj\\Holland.java");
		File file=new File("D:\\Course backups\\Web\\NithyaArthiAnnakili\\index.html");
		FileReader reader=new FileReader(file);
		
		int hai=0;
		while((hai=reader.read())!=-1)
		{
			System.out.print((char)hai);
		}
		
		reader.close();
	}
}
