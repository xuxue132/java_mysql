package db.example08;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlDAO {
	public static Connection getConnection()  throws Exception{
		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost/myjava?useSSL=true&serverTimezone=GMT";
		String userName = "root";
		String password = "12xuhua12";
		Class.forName(driverName);
		Connection con = DriverManager.getConnection(url, userName, password);
		return con;
	}
}
