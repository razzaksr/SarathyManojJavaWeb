package sarathy.manoj.ManojSarathyJava.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class ReadAsDecryption 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("D:\\Course backups\\Java\\SarathyManoj\\tech.zip");
		
		FileInputStream fis=new FileInputStream(file);
		InflaterInputStream dis=new InflaterInputStream(fis);
		
		byte[] tmp=new byte[fis.available()];
		dis.read(tmp);
		
		dis.close();
		fis.close();
		
		System.out.println(file.getName()+" has following content\n"+new String(tmp));
	}
}
