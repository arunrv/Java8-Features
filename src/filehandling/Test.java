package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Stream;

public class Test
{
	public static void main(String[] args) throws IOException, InterruptedException {
		File f=new File("abc");
		f.mkdir();
		System.out.println(f.exists());
		
		
		File f1=new File(f, "test.txt");
		f1.createNewFile();
		System.out.println(f1.exists());
		
		File f2=new File("abc", "xyz.xls");
		f2.createNewFile();
		System.out.println(f2.exists());
		
		
		System.out.println(f.isDirectory());
		
		File f3=new File("D:\\JWT Authentication video");
		String[] s = f.list();
		for (String string : s) {
			System.out.println(string);
		}
		
		File f4=new File("D:\\JWT Authentication video\\CollectionsSorting");
		String[] s2 = f4.list();
		for (String string : s2) {
			File f6=new File(string);
			if(f6.isFile())
				System.out.println(string);
		}
		
		
		FileWriter fw=new FileWriter(f2);
		fw.write("Today is Monday");

		fw.flush();
		fw.close();
		
		//Thread.sleep(5000);
		
		File f7=new File("abc", "xyz.xls");
		
		FileWriter fw1=new FileWriter(f7, true);
		fw1.write('\n');
		fw1.write("Tomorrow is Tuesday");
		fw1.flush();
		fw1.close();
		
		
	}

}
