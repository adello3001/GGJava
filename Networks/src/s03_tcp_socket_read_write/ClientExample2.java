package s03_tcp_socket_read_write;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample2 {
	public static void main(String[] args) {
		String message = null;
		
		if(args.length >= 1) {
			message = args[0];
		}
		else {
			message = "Hello, Server!!!";
		}
		
		System.out.println("args: " + message);
		
		Socket socket = null;
		try {
			socket = new Socket();
			System.out.println( "[Ŭ���̾�Ʈ] ���� ��û...");
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println( "[Ŭ���̾�Ʈ] ���� ����");
			
			byte[] bytes = null;
			
			OutputStream os = socket.getOutputStream();
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println( "[Ŭ���̾�Ʈ] ������ ����");
			
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes);
			message = new String(bytes, 0, readByteCount, "UTF-8");
			System.out.println("[Ŭ���̾�Ʈ] ������ ����: " + message);
			
			os.close();
			is.close();
		} catch(Exception e) {}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e1) {}
		}
		
		System.out.println("[Ŭ���̾�Ʈ] ����");
	}
}