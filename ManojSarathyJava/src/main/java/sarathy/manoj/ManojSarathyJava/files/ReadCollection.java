package sarathy.manoj.ManojSarathyJava.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ReadCollection 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		List<Account> all=null;
		File file=new File("D:\\Course backups\\Java\\SarathyManoj\\dare-collection.doc");
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		all =(List<Account>) ois.readObject();
		
		ois.close();
		fis.close();
		
		System.out.println(all+" has got from "+file.getName());
	}
}
