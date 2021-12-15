package sarathy.manoj.ManojSarathyJava.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class WriteCollection 
{
	public static void main(String[] args) throws IOException 
	{
		List<Account> store=new ArrayList<Account>();
		File file=new File("D:\\Course backups\\Java\\SarathyManoj\\dare-collection.doc");
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		Account account1=new Account("Manoj", 87654345678L, 2300.90);
		Account account2=new Account("Sarathy", 8765456789L, 920.5);
		Account account3=new Account("Vijay", 34567898765L, 1245.6);
		Account account4=new Account("Kumar", 9876545678L, 9955.3);
		store.add(account1);store.add(account2);store.add(account3);store.add(account4);
		oos.writeObject(store);
		
		oos.close();
		fos.close();
		
		System.out.println(store+" has written in a file "+file.getName());
	}
}
