package practice;

interface Intref1 
{
	void m1();

}

public class Test1
{
	static int x=200;
	
	public static void main(String[] args) 
	{
		int x=100;
			Intref i1 = ()->{
				System.out.println(x);//100
				System.out.println(Test1.x);//200
		};
		//x=150;
		i1.m1();
		
	}
}
