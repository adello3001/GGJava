package s01_inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내컴퓨터 IP주소: " + local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.abc.co.kr");
			for(InetAddress remote : iaArr) {
				System.out.println("www.ez.com IP주소: " + remote.getHostAddress());
			}
		} 
		catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}
}

