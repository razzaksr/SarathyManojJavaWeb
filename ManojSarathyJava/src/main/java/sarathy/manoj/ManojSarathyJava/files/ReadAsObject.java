package sarathy.manoj.ManojSarathyJava.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadAsObject 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		Account tmp=null;
		File file=new File("D:\\Course backups\\Java\\SarathyManoj\\dare.doc");
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		tmp =(Account) ois.readObject();
		
		ois.close();
		fis.close();
		
		System.out.println(tmp+" has got from "+file.getName());
	}
}
