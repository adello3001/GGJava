/*
 * UDP(User Datagram Protocol)
 *   - �񿬰� ����
 *   - �ŷڼ��� Ȯ������ �ʴ´�.
 *   - ������ ������� �ʴ´�.
 *   - ������ �ս��� �߻��� �� �ִ�.
 *   - �뵵: �߽��ڰ� �Ϲ������� �����͸� �߽��ϰ�
 *           ���� �����ϴ��� ������ �ʿ䰡 ���� �� ���
 */
package s04_udp_socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiver extends Thread {
	public static void main(String[] args) throws Exception {
		DatagramSocket datagramSocket = new DatagramSocket(5002);
		
		Thread thread = new Thread() {
			@Override
			public void run() {
				System.out.println("[������] ���� ����...");
				try {
					while(true) {
						DatagramPacket packet = new DatagramPacket(new byte[100], 100);
						datagramSocket.receive(packet);
						
						String data = new String(packet.getData(), 0, packet.getLength(), "UTF-8");
						System.out.println("[������] ���� ����: ["  + packet.getSocketAddress() + "] " + data);
					}
				} 
				catch (Exception e) {
					System.out.println("[������] ���ܹ߻����� ���� ����");
				}
			}			
		};
		thread.start();
		
		Thread.sleep(10000); // 10�� ���
		datagramSocket.close();
		
		System.out.println("[������] ����");
	}
}
