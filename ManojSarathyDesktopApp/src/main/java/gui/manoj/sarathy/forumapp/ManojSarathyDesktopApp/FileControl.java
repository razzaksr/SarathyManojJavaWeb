package gui.manoj.sarathy.forumapp.ManojSarathyDesktopApp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class FileControl 
{
	static File file=new File("D:\\Course backups\\Java\\SarathyManoj\\Clubs.doc");
	static FileOutputStream fos;
	static FileInputStream fis;
	static ObjectOutputStream oos;
	static ObjectInputStream ois;
	
	public static void affect(List<Forum> ksr) 
	{
		try
		{
			fos=new FileOutputStream(file); 
			oos=new ObjectOutputStream(fos); 
			oos.writeObject(ksr); // current list updated
			oos.close();
			fos.close();
		}
		catch(IOException ios) {}
	}
	
	public static List<Forum> fetch() 
	{
		List<Forum> ksr=null;
		try
		{
			fis=new FileInputStream(file);
			ois=new ObjectInputStream(fis);
			
			ksr = (List<Forum>)ois.readObject();// read existing list from file
			
			ois.close();
			fis.close();
		}
		catch(IOException | ClassNotFoundException ee) {}
		return ksr;
	}
}
