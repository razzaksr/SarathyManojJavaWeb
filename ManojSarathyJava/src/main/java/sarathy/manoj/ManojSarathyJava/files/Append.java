package sarathy.manoj.ManojSarathyJava.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Append 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("D:\\Course backups\\Java\\SarathyManoj\\zealous.doc");
		FileInputStream fis=new FileInputStream(file);
		
		byte[] tmp=new byte[fis.available()];
		
		fis.read(tmp);
		
		fis.close();
		
		String old=new String(tmp);
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Tell us what you wish to write: ");
		String newone=scan.nextLine();
		scan.close();
		
		String current=old+" "+newone;
		
		FileOutputStream fos=new FileOutputStream(file);
		
		fos.write(current.getBytes());
		
		fos.close();
		
		System.out.println(file.getName()+" has appended");
	}
}
