package ja_0818;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPChatClient {
	public static void main(String[] args) {
		
		int port = 5005;
		String server_ip,str;
		try {
			PrintStream ps = new PrintStream(System.out);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			ps.print(" 접속할 서버 아이피 : >>");
			server_ip = br.readLine();
			ps.print(" 전송할 메시지 : >>");
			str = br.readLine();
			
			DatagramSocket ds = new DatagramSocket();
			
//			DatagramSocket 은 기본생성자로 특정 포트를 정하지 않고 만들수도 있고(클라이언트)
//												서버로서 특정 포트를 열어 둘수도 있다.
//							new DatagramSocket(), new DatagramSocket(int port)
//			2가지 메서드를 가지고 잇다.
//			
//			send( DatagramPacket pack) // 데이터 그램 전송. 받을 위치는 데이터 그램에 이미들어잇다.
//			
//			receive (DatagramPacket pack)// 데이터 그램 수신. 여기 들어간 데이터그램의 버퍼에 받는다.
//			
//			추가로 리시브된 DatagramPacket 에는 발신자의 포트번호 , InetAddress등이 있어서
//			보낸사람에게 다시 데이터를 전송 할 수도잇다.
//			또한 리시브가 수행되면 데이터가 올떄까지 프로세스를 정지하고 대기한다.
			
			
			
			InetAddress addr = InetAddress.getByName(server_ip);
			byte buffer[] = str.getBytes();
			
			DatagramPacket dp = new DatagramPacket(buffer, buffer.length,addr,port);
			
			ds.send(dp);
			ps.print(server_ip+"에 메시지 전송 성공! ");
			ps.close();
			
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}






















