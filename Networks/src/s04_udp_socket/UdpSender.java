package s04_udp_socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UdpSender {
	public static void main(String[] args) throws Exception {
		DatagramSocket datagramSocket = new DatagramSocket();
		
		System.out.println("[발신 시작]");
		
		for(int i=1; i<3; i++) {
			String data = "안녕 : " + i;
			byte[] byteArr = data.getBytes("UTF-8");
			DatagramPacket packet = new DatagramPacket(
				byteArr, byteArr.length, 
				new InetSocketAddress("localhost", 5002)
			);
			
			datagramSocket.send(packet);
			System.out.println("[송신자] 보낸 바이트 수: " + byteArr.length + " bytes");
		}
		
		System.out.println("[송신자] 발신 종료.");
		
		datagramSocket.close();
	}
}
