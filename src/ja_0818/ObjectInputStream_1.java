package ja_0818;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectInputStream_1 {
	public static void main(String[] args) throws Exception {
		
		String str,date_str;
		Date date;
		
		FileInputStream fis = new FileInputStream("c:\\kbs\\sun.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		System.out.print(ois.readInt());
		
		str = (String)ois.readObject();
		
		System.out.print("\n" + str);
		
		date = (Date) ois.readObject();
		
		date_str = (date.getYear()+1900)+" 년 ";
		date_str += (date.getMonth()+1) +" 월 ";
		date_str += (date.getDate())+" 일 ";
		
		System.out.print(date_str);
		ois.close();
		
		
	}

}
