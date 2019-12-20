import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Strings {
	
	public static void main(String[] args) {
		
		String s=new String("Durga");
		s.concat("Software");
		System.out.println(s);
		System.out.println(s.substring(1, 3));
		System.out.println(s.compareTo(""));
		System.out.println(s.toLowerCase());
		StringBuffer sb=new StringBuffer("Durga");
		sb.append(" ");
		String s12 = String.valueOf(10);
		System.out.println(s12);
		
		sb.append("Software");
		System.out.println(sb);
		System.out.println(LocalDate.now());
		System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")));
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));
		String s1="Hi ";
		System.out.println(s1);
		System.out.println(s1.trim());
		
	}

}
