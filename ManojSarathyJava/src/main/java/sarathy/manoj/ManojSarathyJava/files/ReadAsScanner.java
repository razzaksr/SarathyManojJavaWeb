package sarathy.manoj.ManojSarathyJava.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadAsScanner 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File file=new File("D:\\Course backups\\Python\\Bhuvana\\Denominations.py");
		Scanner scan=new Scanner(file.getAbsoluteFile());

		while(scan.hasNext())
		{
			System.out.println(scan.nextLine());
		}
		scan.close();
	}
}
