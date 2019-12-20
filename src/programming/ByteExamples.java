package programming;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ByteExamples 
{
	public static void main(String[] args) {
		String str="Arun";
		byte[] bytearray=str.getBytes();
	//	byte[] bytearray = str.getBytes(StandardCharsets.UTF_8);
		System.out.println(bytearray);
		System.out.println(Arrays.toString(bytearray));
		
		String str1=new String(bytearray);
		System.out.println(str1);
		byte data[]=null;
		data=new byte[10];
		data[0]=97;
		String str3=new String(data);
		System.out.println(data);
		System.out.println(str3);
		int i=10;
		System.out.println("The value is "+i+"");
	}
	/*public void recieveMqtt(Message message) {
		String msgText="";
		String data1="";
	if (message instanceof BytesMessage) {
        BytesMessage bm = (BytesMessage) message;
        byte data[] = null;
        try {
			data = new byte[(int) bm.getBodyLength()];
			bm.readBytes(data);
		} catch (JMSException e) {	
			logger.error(e.getMessage());
		}*/
}
