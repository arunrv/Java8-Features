package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Test4 {
	
	public static void main(String[] args) throws IOException {
		
		File f1=new File("C:\\Users\\User\\Desktop\\File Handling\\file1.txt");
		File f2=new File("C:\\Users\\User\\Desktop\\File Handling\\file2.txt");
		File f3=new File("C:\\Users\\User\\Desktop\\File Handling\\file3.txt");
		
		PrintWriter pw1=new PrintWriter(f1);
		pw1.println("222");
		pw1.println("333");
		pw1.println("444");
		pw1.println("555");
		
		pw1.flush();
		pw1.close();
		
		PrintWriter pw2=new PrintWriter(f2);
		pw2.println("AAA");
		pw2.println("BBB");
		pw2.println("CCC");
		pw2.println("DDD");
		pw2.println("EEE");
		
		pw2.flush();
		pw2.close();
		
		BufferedReader br1=new BufferedReader(new FileReader(f1));
		BufferedReader br2=new BufferedReader(new FileReader(f2));
		
		PrintWriter pw3=new PrintWriter(f3);
		
		String line1 = br1.readLine();
		while(line1!=null)
		{
			pw3.println(line1);
			line1=br1.readLine();
			pw3.flush();
			
		}
		
		String line2 = br2.readLine();
		while(line2!=null)
		{
			pw3.println(line2);
			line2=br2.readLine();
			pw3.flush();
		}
		
	}

}
