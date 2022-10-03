package Case_Study5_Referal.Service;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {

	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String connectionString = "jdbc:mysql://localhost:3306/DPhone_corporation";
			connection = DriverManager.getConnection(connectionString, "root" , "Bhavna@123");
			System.out.println("Connected");
		} catch(Exception e) {
			System.out.println(e);
		}
		return connection;
	}

}
