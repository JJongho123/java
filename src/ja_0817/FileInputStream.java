package ja_0817;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FileInputStream {
	public static void main(String[] args) {
		
		int i=0;
		String file;
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("읽어올 파일 이름 ");
		file = read.readLine();
		
		System.out.println(file + " 문서내용 \r\n");
		
		FileInputStream fis = new FileInputStream(file);
		
//		FileReader fis = new FileReader(file);
		
		while((i = fis.read())!= -1) {
			System.out.print((char)i);
		}
		
		
	}

}



















