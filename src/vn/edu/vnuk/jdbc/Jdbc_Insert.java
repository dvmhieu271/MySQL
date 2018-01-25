package vn.edu.vnuk.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

public class Jdbc_Insert {
	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		String sqlQuery = "insert into contacts (name, email, address, date_of_birth) " + "value (?, ?, ?, ? )";
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(sqlQuery);
			statement.setString(1, "Duong Viet Minh Hieu");
			statement.setString(2, "hieu.duong160204@vnuk.edu.vn");
			statement.setString(3, "41 Nguyen Xuan On");
			statement.setDate(4, new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
			statement.execute();
			statement.close();
			System.out.println("New record in DB!");
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			connection.close();
			System.out.println("Done!");
		}
	}
}