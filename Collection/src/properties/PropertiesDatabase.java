/*
 * properties file
 *   - ISO-8859-1
 *   - 한글은 유니코드 값으로 저장 : \uD55C\uAE00
 *   - key=value
 */
package properties;
			
import java.io.FileReader;
import java.net.URLDecoder;									
import java.util.Properties;

public class PropertiesDatabase {

	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		
		String path = PropertiesDatabase.class.getResource("database.properties").getPath();
		String utf8 = URLDecoder.decode(path, "utf-8");
		properties.load(new FileReader(utf8));
		
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String hangeul = properties.getProperty("hangeul");
		
		System.out.println("[ database.properties ]");
		System.out.println("path: " + path);
		System.out.println("driver: " + driver);
		System.out.println("url: " + url);
		System.out.println("username: " + username);
		System.out.println("password: " + password);
		System.out.println("hangeul: " + hangeul);
	}

}
