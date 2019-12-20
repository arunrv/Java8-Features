package programming;
import java.time.LocalDateTime;

public class Test 
{
	public static void main(String[] args) {
		/*String raw_snumber="21554";
		if(raw_snumber.length()>5)
		{
		raw_snumber = raw_snumber.substring(1);
		}
		System.out.println(raw_snumber);*/
		
		/*String productiongroup="92";
		System.out.println(productiongroup.length());
		if(productiongroup.length()>2)
		{
		productiongroup = productiongroup.substring(0, 2);
		}
		System.out.println(productiongroup);*/
		/*String updatedDate="10/01/2019";
		String[] datearray = updatedDate.split("/");
		String month = datearray[0];
		String date = datearray[1];
		String year = datearray[2];
		LocalDateTime dateTime = LocalDateTime.parse(""+year+"-"+month+"-"+date+"T12:00:00");
		System.out.println(dateTime);*/
		
		/*String productiongroup= "33.0";
		if(productiongroup.contains("."))
		{
			int len = productiongroup.length()-1;
			productiongroup=productiongroup.substring(0, len);
			productiongroup=productiongroup.replace(".", "");
		}
		productiongroup.replace(".", "");
		System.out.println(productiongroup);*/
		
		/*String pg="44.04567";
		double pg1 = Double.parseDouble(pg);
		System.out.println(pg1);
		int pg2 = (int)pg1;
		System.out.println(pg2);*/
		
		/*String productiongroup= "44";
		
		if(productiongroup.contains("."))
		{
			double pg_double = Double.parseDouble(productiongroup);
			int pg_int = (int)pg_double;
			productiongroup=String.valueOf(pg_int);
			//productiongroup=productiongroup.substring(0, productiongroup.length()-1);
			//productiongroup=productiongroup.replace(".", "");
		}
		System.out.println(productiongroup);
		
	}*/
		
		Integer ab=null;
		String abs = String.valueOf(ab);
		System.out.println(abs);
		System.out.println(abs.equals("null"));

}
}
