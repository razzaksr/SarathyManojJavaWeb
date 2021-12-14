package sarathy.manoj.ManojSarathyJava.files;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteAsStream 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("D:\\Course backups\\Java\\SarathyManoj\\zealous.doc");
		
		FileOutputStream fos=new FileOutputStream(file);
		
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Tell us what you wish to write: ");
		String content=dis.readLine();
		dis.close();
		
		fos.write(content.getBytes());
		
		fos.close();
		
		System.out.println(content+" has written in "+file.getName());
	}
}
