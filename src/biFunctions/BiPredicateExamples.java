package biFunctions;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateExamples 
{
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> p1=(i1,i2)->(i1+i2)%2==0;
		System.out.println(p1.test(10, 123));
		
		BiFunction<Integer, Integer, Integer> f1=(i3, i4)->i3*i4;
		System.out.println(f1.apply(20, 30));
	}

}
