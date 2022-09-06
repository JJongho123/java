package ja_0818;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class DateClient {
	public static void main(String[] args) throws Exception{
		
		Socket   s = new Socket("192.168.20.15",9999);
		BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String res = input.readLine();
		String res2 = input.readLine();
		System.out.println(res);
		System.out.println(res2);
		System.exit(0);
		
	}
}

