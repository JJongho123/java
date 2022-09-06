package ja_0818;

import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPChatServer {
	public static void main(String[] args) {
		
		int port = 5005; //채팅 서버 포트
		final int BUFFER = 50;
		byte buffer[] = new byte[BUFFER];
		String message = null;
		PrintStream ps = new PrintStream(System.out);
		try {
			DatagramSocket ds = new DatagramSocket(port);
//			UDP 방식은 데이터의 전송이 끝나면 연결을 끊는다.
//			UDP 방식은 TCP 방식에 비해 서버의 부담을 줄이는 효과가 있지만.
//			상대방이 내가 보낸 데이터를 정상적으로 받앗는지 체크 할수가 없다.
//			또한 보낸 데이터 소실확률이 있다.
//			
//			UDP 방식 데이터 교환을 위해서는 다음 두가지 클래스가 있다.
//			DatagramPacket : 데이터 패킷은 데이터를 하나로 묶는 객체라고 보면 편하다.
//			DatagramSoket : 데이터 소켓은 우리집의 대문을 생각하면 된다.
//							다른사람이 내 IP로 접근할때 , 내 데이터를 밖으로 내보낼때
//							DatagramSocket 을 통해 접근한다.
//							
//			DatagramPacket 은 대표적으로 2가지 용도가 있다.
//			
//			1. 누군가가 보낸 데이터를 받을 패킷.  new DatagramPacket(byte[] buf,int length)
//											전송된 byte 데이터를 저장할 버퍼 , 읽어낼 길이.
//											보통 buf 의 길이만큼 사용한다.
//	        2. 데이터를 보낼 패킷 . DatagramPacket(byte[] buf,int length , InetAddress address,int port)
//	        					 특이하게도 보내는 패킷에는 전송할 목적지의 주소와 포트번호를 같이 가지고 간다.
//	        						buf = 바이트 타입 전송할 데이터 , length = 보낼 패킷의 길이 , address = 전송할 주소
//	        						port 접속할 주소가 열어둔 포트번호
			while(true) {
				DatagramPacket dp = new DatagramPacket(buffer,buffer.length);
				ds.receive(dp);
				message = new String(dp.getData());
				ps.print("수신 메시지 >> " +message);
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		ps.close();
		
	}

}






















