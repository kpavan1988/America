package Tutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JdbcConnect {

	public static void main(String[] args) throws SQLException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/ajeth/workspace/CoreJava/drivers/gecko driver/chromedriver.exe");
		
		String host="localhost";
		String port="3306";
		
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/pavan", "root", "root");
		Statement st=con.createStatement();
		ResultSet r=st.executeQuery("select * from employee where name='ravi'");
		while(r.next())
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://affiliate.flipkart.com/login");
			driver.findElement(By.id("inputEmail")).sendKeys(r.getString("name"));
			driver.findElement(By.id("inputPassword")).sendKeys(r.getString("name"));
		
	
		
		}
		

	}

}
