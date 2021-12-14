package sarathy.manoj.ManojSarathyJava.files;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class WriteAsEncrypt 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("D:\\Course backups\\Java\\SarathyManoj\\tech.zip");
		
		FileOutputStream fos=new FileOutputStream(file);
		DeflaterOutputStream dos=new DeflaterOutputStream(fos);
		
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Tell us what you wish to write: ");
		String content=dis.readLine();
		dis.close();
		
		dos.write(content.getBytes());
		
		dos.close();
		fos.close();
	}
}
