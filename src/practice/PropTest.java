package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropTest {
	
	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\ARUNR11\\Collections\\Java Training\\JWT Authentication video\\CollectionsSorting\\src\\testing.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop);
		
		prop.setProperty("name", "Tarun");
		prop.setProperty("sex", "male");
		System.out.println(prop);
		String dir = System.getProperty("user.dir");
		System.out.println(dir);
		FileOutputStream fos=new FileOutputStream(dir+"\\src\\testing.properties");
		prop.store(fos, "Test");
	}

}
