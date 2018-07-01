package db;

public class DBConnectionFactory {
	private static final String DEFAULT_DB = "mysql";
	
	public static DBConnection getDBConnection(String db) {
		switch(db) {
		case "mysql":
			return null;
		case "mongodb":
			return null;
		default:
			throw new IllegalArgumentException("Invalid db" + db);
		}
	}

}
