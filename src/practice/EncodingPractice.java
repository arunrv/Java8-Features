package practice;

import java.util.Base64;

public class EncodingPractice 
{
	public static void main(String[] args) {
		
		String a="Arun";
		byte[] b1 = Base64.getEncoder().encode(a.getBytes());
		System.out.println(b1);
		String s2 = Base64.getEncoder().encodeToString(a.getBytes());
		System.out.println(s2);
		byte[] decoded = Base64.getDecoder().decode(b1);
		System.out.println(new String(decoded));
		byte[] b3 = a.getBytes();
		System.out.println(b3);
		System.out.println(a.matches(new String(b1)));
		
	}

}
