package vn.edu.vnuk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		try {
			return DriverManager.getConnection(
				"jdbc:mysql://localhost/vnuk", //URL of the DB
				"root", //USER (root)
				"0Pskmhkhbthkbb" //Password
			);
		}
		
		catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}