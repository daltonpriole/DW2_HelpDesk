package dw2.help.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionHelpFactory {

	public static Connection getConnection() {
		try {
			Class.forName("org.hsqldb.jdbcDriver");
			return DriverManager.getConnection(
					"jdbc:hsqldb:hsql://localhost/helpdb",
					"sa",
					"");
					
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
