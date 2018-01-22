package vn.edu.vnuk.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConnection {
	public static void main(String[] args) throws SQLException {
		try {
			Connection connection = new ConnectionFactory().getConnection();
			System.out.println("Connection is open!");
			connection.close();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Dane!");
		}
	}
}