package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\User\\Desktop\\filehandlingtest1.csv");
	f.createNewFile();
	BufferedWriter bw=new BufferedWriter(new FileWriter(f, true));
	bw.write("I love you lakshmi");
	bw.newLine();
	bw.write("I love you lakshmi");
	bw.newLine();
	bw.write("I love you lakshmi");
	bw.flush();
	bw.close();
	
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
