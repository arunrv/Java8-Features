package serializationPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;

class Employee implements Serializable
{
	String eid="180878";
	String name="Arun";
	transient String pwd="RandomPassword";
	transient int pinCode=345678;
	
	private void writeObject(ObjectOutputStream os) throws IOException
	{
		os.defaultWriteObject();
		byte[] barr = pwd.getBytes();
		String epwd = Base64.getEncoder().encodeToString(barr);
		os.writeObject(epwd);	
		String pin2 = String.valueOf(pinCode);
		String pinEncoded = Base64.getEncoder().encodeToString(pin2.getBytes());
		os.writeObject(pinEncoded);
	}
	
	private void readObject(ObjectInputStream is) throws ClassNotFoundException, IOException
	{
		is.defaultReadObject();
		String epwd1 = (String)is.readObject();
		byte[] barr1 = Base64.getDecoder().decode(epwd1);
		String s3=new String(barr1);
		pwd=s3;
		String pin3 = (String)is.readObject();
		byte[] pin4 = Base64.getDecoder().decode(pin3);
		String pin5=new String(pin4);
		pinCode=Integer.parseInt(pin5);
	}
}
public class Test {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee e1=new Employee();
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e1);
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee emp = (Employee)ois.readObject();
		System.out.println(emp.eid);
		System.out.println(emp.name);
		System.out.println(emp.pwd);
		System.out.println(emp.pinCode);
		
	}

}
