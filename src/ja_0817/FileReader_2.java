package ja_0817;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_2 {
	public static void main(String[] args) {
		
		try {
			//파일 객체 생성
			File file = new File("C:\\kbs\\abc.789");
			
			//입력 스트림 생성
			FileReader filereader = new FileReader(file);
			
			//입력 버퍼 생성
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = "";
			
			//한줄씩 읽기
			// /readLine() 은 끝에 개행문자를 읽지 않는다.
			
			while((line = bufReader.readLine())!=null) {
				System.out.println(line);
			}
			bufReader.close();
			
		}catch(FileNotFoundException e) {
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
	}

}






















