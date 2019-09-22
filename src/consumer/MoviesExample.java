package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Movie
{
	String name;
	String hero;
	String heroin;
	public Movie(String name, String hero, String heroin) {
		super();
		this.name = name;
		this.hero = hero;
		this.heroin = heroin;
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", hero=" + hero + ", heroin=" + heroin + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	public String getHeroin() {
		return heroin;
	}
	public void setHeroin(String heroin) {
		this.heroin = heroin;
	}
	
}
public class MoviesExample 
{
	public static void main(String[] args) {
		Consumer<Movie> c=m->{
			System.out.println("Movie Name is-----"+m.getName());
			System.out.println("Movie Hero is-----"+m.getHero());
			System.out.println("Movie Heroin is---"+m.getHeroin());
			System.out.println();
		};
		
		Movie m1=new Movie("Bahubhali", "Prabas", "Anushka");
		Movie m2=new Movie("Kurukshetra", "Darshan", "Meghana Raj");
		Movie m3=new Movie("Pailwan", "Sudeep", "Rachu");
		Movie m4=new Movie("Manikya", "Sudeep", "Rachu");
		Movie m5=new Movie("Kavaludari", "Unknown", "Unknown");
		List<Movie> l1=new ArrayList<Movie>();
		l1.add(m1);
		l1.add(m2);
		l1.add(m3);
		l1.add(m4);
		l1.add(m5);
		l1.stream().sorted((mo1, mo2)->mo1.getName().compareTo(mo2.getName())).forEach(c);
		System.out.println(l1);
		for (Movie movie : l1) 
		{
			c.accept(movie);
			
		}
		
	}

}
