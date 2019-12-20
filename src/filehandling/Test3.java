package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test3 
{
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\User\\Desktop\\filehandlingtest2.csv");
		f.createNewFile();
		PrintWriter pw=new PrintWriter(f);
		pw.println("I have worked in log base project");
		pw.println("I have worked in DLA project");
		pw.println("I have worked in Dolibar project");
		pw.flush();
		pw.close();
		
		BufferedReader br=new BufferedReader(new FileReader(f));
		String line = br.readLine();
		while(line!=null)
		{
			System.out.println(line);
			line=br.readLine();
			
		}
		br.close();
	}

}
