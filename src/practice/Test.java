package practice;

interface Intref 
{
	void m1();

}

public class Test
{
	int x=100;
	public void m2()
	{
		Intref i1 = ()->{
			int x=200;
			System.out.println(x);//200
			System.out.println(this.x);//100
			
		};
		i1.m1();
	}
	
	public static void main(String[] args) 
	{
		Test t=new Test();
		t.m2();
		
	}
}
