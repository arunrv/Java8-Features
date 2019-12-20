package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Test5 
{
	public static void main(String[] args) throws IOException {
		File f4=new File("C:\\Users\\User\\Desktop\\File Handling\\file4.txt");
		File f5=new File("C:\\Users\\User\\Desktop\\File Handling\\file5.txt");
		File f6=new File("C:\\Users\\User\\Desktop\\File Handling\\file6.txt");
		
		PrintWriter pw1=new PrintWriter(f4);
		PrintWriter pw2=new PrintWriter(f5);
		PrintWriter pw3=new PrintWriter(f6);
		pw1.println("222");
		pw1.println("333");
		pw1.println("444");
		pw1.println("555");
		pw2.println("AAA");
		pw2.println("BBB");
		pw2.println("CCC");
		pw2.println("DDD");
		pw2.println("EEE");
		pw1.flush();
		pw2.flush();
		
		BufferedReader br1=new BufferedReader(new FileReader(f4));
		BufferedReader br2=new BufferedReader(new FileReader(f5));
		String line1 = br1.readLine();
		String line2 = br2.readLine();
		
		while(line1!=null || line2!=null)
		{
			if(line1!=null)
			{
				pw3.println(line1);
				line1=br1.readLine();
			}
			if(line2!=null)
			{
				pw3.println(line2);
				line2=br2.readLine();
			}
		}
		pw3.flush();
		pw1.close();
		pw2.close();
		pw3.close();
		br1.close();
		br2.close();
		
		System.out.println("No infinite loop");
		
	}

}
