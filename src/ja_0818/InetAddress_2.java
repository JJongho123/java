package ja_0818;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class InetAddress_2 {
	public static void main(String[] args) throws Exception {
		
		String url = null;
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(" 웹 사이트 이름을 입력하세요 ! ");
		url = read.readLine();
		
		InetAddress addr = InetAddress.getByName(url);
		
		System.out.println("=============================");
		System.out.println(url + " => "+ addr.getHostAddress());
		System.out.println(url + " => "+ addr.getHostName());
				
		
		
	}

}
