package jodaTimeAPI;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ThirdStep {
	
	public static void main(String[] args) {
		//String dateTime = LocalDateTime.now(ZoneId.of("Asia/Tokyo")).format(DateTimeFormatter.ofPattern("dd-mm-yyyy HHmmss"));
	//	System.out.println(dateTime);
		//టుటోరియల్స్ పాయింట్ కి స్వాగతిం
		try
		{
		FileOutputStream fos=new FileOutputStream("C:\\Users\\ARUNR11\\Desktop\\File Programing\\abc.csv");
		fos.write(239);
		fos.write(187);
		fos.write(191);
	//	BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\ARUNR11\\Desktop\\File Programing\\abc.csv"));
		try(Writer bw=new BufferedWriter(new OutputStreamWriter(fos, StandardCharsets.UTF_8)))
		{
		String s="栃木県佐野市栄町7-2"+","+"టుటోరియల్స్ పాయింట్ కి స్వాగతిం";
		bw.write(s);
		}
	//	bw.close();
	//	bw.flush();
		//bw.flush();
		}
		catch(IOException e)
		{
			System.out.println("Exception");
		}
	}

}
