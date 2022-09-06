package ja_0817;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedInputStream_1 {
	public static void main(String[] args) throws Exception{
		
		int i=0;
		
		String file;
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(" 읽어올 화일 이름 ");
		file = read.readLine();
		
		System.out.println(file+ " 문서 내용 ");
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		while((i= bis.read()) != -1) {
			System.out.print((char)i);
		}
		bis.close();
				
		
	
	}
	

}
