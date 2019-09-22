package function;

import java.util.function.Function;

public class chaining 
{
	public static void main(String[] args) {
		Function<String, String> f1=s->s.toUpperCase();
		Function<String, String> f2=s->s.substring(3);
		System.out.println(f2.apply("Hello"));
		System.out.println(f1.andThen(f2).apply("MyXCheeti"));
		
	}

}
