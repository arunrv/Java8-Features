package function;

import java.util.function.Function;

public class RemoveSpaces 
{
	public static void main(String[] args) 
	{
		Function<String, String> f1=s->s.replaceAll(" ", "");
		System.out.println(f1.apply("Hi Hello How are You"));
		String s2="Hi Hi Hi";
		String s3 = s2.replaceAll(" ", "");
		System.out.println(s3);
		System.out.println(s2.length()-s3.length());
		
	}

}
