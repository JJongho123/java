package ja_0817;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileReader_3 {
	public static void main(String[] args) {

		
		try {
			//파일 객체 생성
			File file = new File("C:\\kbs\\abc.789");
			
			//스캐너로 파일 읽기
			Scanner sc = new Scanner(file);
			
			while(sc.hasNextLine()) {
				System.out.println(sc.next());
//				System.out.println(sc.useDelimiter("\\n").next());
//				NoSuchElementException는 존재하지 않는것을 가져오라고 할때 발생합니다.
				
			}
		}catch(FileNotFoundException e) {}
		catch(NoSuchElementException e) {}
	}

}
