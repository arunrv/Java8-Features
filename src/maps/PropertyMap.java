package maps;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyMap 
{
	public static void main(String[] args) throws IOException {
		Properties p=new Properties(); // this map can store the key and value pair which is present in the property file
		FileInputStream fis=new FileInputStream("C:\\Users\\ARUNR11\\Collections\\Java Training\\JWT Authentication video\\CollectionsSorting\\src\\file.properties");
		p.load(fis); //once this method got executed all the key and value pair present in the properties file will be loaded to java object
		System.out.println(p);
		System.out.println(p.getProperty("user"));//to get the property from the property object
		System.out.println(p.getProperty("password"));
		System.out.println(p.getProperty("venki"));
		p.setProperty("Nag", "999");//to set the value to the property object.
		p.setProperty("Sham", "9999999");
		System.out.println(p);
		FileOutputStream fos=new FileOutputStream("C:\\Users\\ARUNR11\\Collections\\Java Training\\JWT Authentication video\\CollectionsSorting\\src\\file.properties");
		p.store(fos, "Test");
		
		
	}

}
