package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionClass {

	static Connection CONN = null;

	static PreparedStatement STATE = null;
	static int b = 0;

	public static int CheckUser(String UserName, String Password) throws SQLException {

		try {
			CONN = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Mcchss78*");
			String sql = String.format("SELECT COUNT(*) FROM user_table WHERE username = '%S' AND password = '%S'",
					UserName, Password);

			STATE = CONN.prepareStatement(sql);
			boolean S = false;

			S = STATE.execute();

			ResultSet c = STATE.executeQuery();

			if (c.next()) {

				b = c.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			CONN.close();
			STATE.close();
		}
		return b;

	}

}
