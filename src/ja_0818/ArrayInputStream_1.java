package ja_0818;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ArrayInputStream_1  {
	public static void main(String[] args) {
		
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		// ByteArrayInoutStream : 바이트 배열에 데이터를 입출력 하는데 사용하는 스트림
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		int data = 0 ;
		while((data = input.read())!= -1) {
			output.write(data);
		}
//		input.read() : 이 입력 스트림에서 데이터의 다음 바이트를 읽습니다.
//						값 byte 는 0 에서 255 사이의 int 로  반환됩니다.
//						스트림의 끝에 도달하여 사용할수 있는 바이트가 없으면 값 -1이 됩니다
		outSrc = output.toByteArray();
		
		System.out.println("Input Source : "+Arrays.toString(inSrc));
		System.out.println("Output Source : "+Arrays.toString(outSrc));
		
  	}

}
