package Tutorial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class globalVariables {

	public static void main(String[] args) throws IOException {
		
		Properties pt=new Properties();
		FileInputStream fis=new FileInputStream("C:/Users/ajeth/workspace/CoreJava/data.properties");
		pt.load(fis);
		System.out.println(pt.getProperty("browser"));
		System.out.println(pt.getProperty("url"));
		pt.setProperty("browser", "firefox");
		System.out.println(pt.getProperty("browser"));
		FileOutputStream fos=new FileOutputStream("C:/Users/ajeth/workspace/CoreJava/data.properties");
		pt.store(fos, null);
		
		
		
		

	}

}
