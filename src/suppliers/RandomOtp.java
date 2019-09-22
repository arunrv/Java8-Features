package suppliers;

import java.util.function.Supplier;

public class RandomOtp 
{
	public static void main(String[] args) 
	{
		Supplier<String> s=()->{
			String[] s1={"Shweetha", "Geetha", "Anekha", "Anu", "Divya"};
			int random = (int)(Math.random()*5);
			return s1[random];
		};
		System.out.println(s.get());
		
		Supplier<String> s2=()->{
			String rstring="";
			for(int i=0; i<6;i++)
			{
			int rnum = (int)(Math.random()*10);
			rstring=rstring+rnum;
			}
			return rstring;
		};
		System.out.println(s2.get());
		
		Supplier<String> s3=()->{
			String pwd="";
			Supplier<Integer> s4=()->(int)((Math.random())*10);
			String Symbols="ABCDEFGHIJKLMNOPQRSTUVWXYZ@#!$";
			Supplier<Character> s5=()->Symbols.charAt((int)(Math.random()*31));
			for(int i=0;i<8;i++)
			{
				if(i%2==0)
				{
					pwd=pwd+s5.get();
				}
				else
					pwd=pwd+s4.get();
			}
			return pwd;
		};
		System.out.println(s3.get());
		
		Supplier<String> s10=()->{
			String AreaCode="";
			Supplier<Integer> s11=()->(int)(Math.random()*10);
			String symb="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			Supplier<Character> s12=()->symb.charAt((int)(Math.random()*26));
			for(int i=0;i<8;i++)
			{
				if(i!=5)
				{
					AreaCode=AreaCode+s11.get();
				}
				else
				{
					AreaCode=AreaCode+s12.get();
				}
			}
			return AreaCode;
			
		};
		System.out.println(s10.get());
	}
}