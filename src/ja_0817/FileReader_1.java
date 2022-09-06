package ja_0817;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class FileReader_1 {
	public static void main(String[] args) throws Exception{
		
		int i=0;
		String file;
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("읽어올 화일이름을 입력하세요 ! ");
		file = read.readLine();
		
		System.out.println(file + " 문서 내용 ##### ");
		
		FileReader frr = new FileReader(file);
		
		while((i = frr.read())!=-1) {	//파일이 없을떄 까지 읽어라
			System.out.print((char)i);
			
		}
		frr.close();
			
		
	}

}
