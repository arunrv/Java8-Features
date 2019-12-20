package serializationPractice;

import java.util.Arrays;
import java.util.Base64;

public class Test3 {
	public static void main(String[] args) {
		String s="Arun";
		byte[] by = s.getBytes();
		System.out.println(by);
		System.out.println(Arrays.toString(by));
		String str = Base64.getEncoder().encodeToString(by);
		System.out.println(str);
		byte[] deocodedValues = Base64.getDecoder().decode(str);
		System.out.println(deocodedValues);
		String s2=new String(deocodedValues);
		System.out.println(s2);
	}

}
