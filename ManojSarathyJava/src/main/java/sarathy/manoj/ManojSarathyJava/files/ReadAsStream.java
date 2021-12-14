package sarathy.manoj.ManojSarathyJava.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadAsStream 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("D:\\Course backups\\Python\\Bhuvana\\Denominations.py");
		
		FileInputStream fis=new FileInputStream(file);
		
		byte[] tmp=new byte[fis.available()];
		
		fis.read(tmp);
		
		fis.close();
		
		System.out.println(file.getName()+" has following content: \n"+new String(tmp));
	}
}
