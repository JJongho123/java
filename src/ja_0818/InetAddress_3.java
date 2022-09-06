package ja_0818;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.util.Iterator;

public class InetAddress_3 {
	public static void main(String[] args) throws Exception{
		
		String url = null;
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("웹 사이트이름을 입력하세요 ");
		
		url = read.readLine();
		
		InetAddress[] addr = InetAddress.getAllByName(url);
		
		System.out.println("===========================");
		System.out.println(url+" 는 "+ addr.length + " 개의 IP 주소를 갖고 있습니다. ");
		
		for(int i=0;i<addr.length;i++) {
			System.out.println((i + 1)+ " 번 IP 번호 : "+addr[i].getHostAddress());
		}
		
	}

}
