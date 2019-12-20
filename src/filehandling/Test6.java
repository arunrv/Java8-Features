package filehandling;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Test6 
{
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\User\\Desktop\\File Handling");
		File f1=new File("C:\\Users\\User\\Desktop\\File Handling\\file7.txt");
		PrintWriter pw1=new PrintWriter(f1);
		String[] srray = f.list();
		
		for (String s : srray) {
			
			BufferedReader br1=new BufferedReader(new FileReader(new File(f, s)));
			String line1 = br1.readLine();
			while(line1!=null)
			{
				pw1.println(line1);
				line1=br1.readLine();
			}
		}
		pw1.flush();
		pw1.close();
		System.out.println("No Infinite loop");
		ArrayList<String> l1=new ArrayList<String>();
		
	}
	

}
