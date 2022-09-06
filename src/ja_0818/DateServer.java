package ja_0818;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DateServer {
	public static void main(String[] args) throws Exception{
		
		ServerSocket ss = new ServerSocket(9999);
		try {
			while(true) {
				Socket socket = ss.accept();
				try {
					PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
					out.println(new Date().toString());
					out.println("시원한 여름 날씨 정종호");
					out.flush();
				}finally {
					socket.close();
				}
				
			}
		}finally {
			ss.close();
		}
		
	}

}
