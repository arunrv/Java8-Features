package programming;

public class Test1 
{
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		sb.append("arun");
		sb.append("lakshmi");
		
		sb.insert(4, "Shweetha");
		System.out.println(sb);
		
		String s="hi";
		s.concat("Hello");
		System.out.println(s);
	}

}
