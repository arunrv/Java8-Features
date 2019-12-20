package serializationPractice;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;

class Student implements Serializable
{
	String sid="32SEERE";
	String name="Shweetha";
	
}
public class Test2 {
	
	public static void main(String[] args) throws IOException {
		Student s1=new Student();
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		oos.writeObject(s1);
		String encodedString = Base64.getEncoder().encodeToString(bos.toByteArray());
		System.out.println(encodedString);
	}

}
