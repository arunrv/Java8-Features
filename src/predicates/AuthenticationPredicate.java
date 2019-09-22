package predicates;

import java.util.Scanner;
import java.util.function.Predicate;

import test.User;

public class AuthenticationPredicate 
{
	
	public static void main(String[] args)
	{
		Predicate<User> p=user->user.getUsername().equals("Durga")&&user.getPwd().equals("java");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter UserName");
		String username=sc.next();
		System.out.println("Enter Password");
		String pwd=sc.next();
		User user=new  User();
		user.setUsername(username);
		user.setPwd(pwd);
		if(p.test(user))
			System.out.println("User Authenticated Successfully");
		else
			System.out.println("Enter valid UN and PWD");
		
		
		
		
		
	}

}
