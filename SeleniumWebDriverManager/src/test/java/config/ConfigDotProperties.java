package config;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class ConfigDotProperties {

	public static String browsers;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readpropertiesfile();
		writepropertiesfile();
		readpropertiesfile();
	}
	
	public static void readpropertiesfile() {
		Properties prop=new Properties();
		try {
			InputStream input=new FileInputStream("C:\\Users\\rocok\\eclipse-workspace\\SeleniumWebDriverManager\\src\\test\\java\\config\\config.properties");
			prop.load(input);
			System.out.println(prop.getProperty("browsers"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void writepropertiesfile() {
		Properties prop=new Properties();
		try {
			OutputStream output=new FileOutputStream("C:\\Users\\rocok\\eclipse-workspace\\SeleniumWebDriverManager\\src\\test\\java\\config\\config.properties");
			prop.setProperty("browsers", "Chrome+Firefox+IE+Edge");
			prop.setProperty("Result", "Pass");
			prop.store(output, "Values are Stored");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
