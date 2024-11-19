package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbutil {
	private static final String URL = "jdbc:mysql://localhost:3306/assignment";
	private static final String NAME = "root";
	private static final String PASSWORD = "root";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, NAME, PASSWORD);
	}

}
