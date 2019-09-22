package consumer;

import java.util.function.Consumer;

public class ConsumerChaining 
{
	public static void main(String[] args) {
		Consumer<Movie> c1=m->{
			System.out.println("Movie is Yet to Release-----"+m.getName());
		};
		
		Consumer<Movie> c2=m->{
			System.out.println("Movie is Released-----"+m.getName());
		};
		
		Consumer<Movie> c3=m->{
			System.out.println("Movie is Super Hit-----"+m.getName());
		};
		Movie m=new Movie("Ayogya", "Sathish", "Rachitha Ram");
		c1.andThen(c2).andThen(c3).accept(m);
	}

}
