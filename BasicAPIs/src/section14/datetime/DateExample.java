package section14.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf1.format(now));

		SimpleDateFormat sdf2 = new SimpleDateFormat("yy-M-dd a hh:mm:ss Eø‰¿œ");
		System.out.println(sdf2.format(now));
	}

}
