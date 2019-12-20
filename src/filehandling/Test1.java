package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test1 
{
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\User\\Desktop\\filehandling test.docx");
		f.createNewFile();
		FileWriter fw=new FileWriter(f, true);
		fw.write("I love u lakshmi, I love you lakshmi, I love you lakshmi");
		fw.flush();
		char[] ch=new char[(int)f.length()];
		FileReader fr=new FileReader(f);
		fr.read(ch);
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
		
		int data=fr.read();
		
	}

}
